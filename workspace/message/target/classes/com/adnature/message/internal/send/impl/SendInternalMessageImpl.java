package com.adnature.message.internal.send.impl;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adnature.domain.message.entity.MessageLog;
import com.adnature.domain.message.entity.MessageReceiver;
import com.adnature.domain.message.entity.MessageTemplete;
import com.adnature.domain.message.repository.MessageLogRepository;
import com.adnature.domain.message.repository.MessageReceiverRepository;
import com.adnature.domain.message.repository.MessageTempleteRepository;
import com.adnature.framework.constant.Constants;
import com.adnature.framework.exception.SystemException;
import com.adnature.framework.util.DateUtils;
import com.adnature.framework.util.StringUtils;
import com.adnature.message.constants.MessageReceiverType;
import com.adnature.message.constants.MessageType;
import com.adnature.message.internal.send.SendInternalMessage;

@Service
public class SendInternalMessageImpl implements SendInternalMessage {

	@Autowired
	MessageLogRepository messageLogRepository;
	
	@Autowired
	MessageTempleteRepository messageTempleteRepository;
	
	@Autowired
	MessageReceiverRepository messageReceiverRepository;
	
	@Override
	public boolean send2BackUser(String tenantCd, String msgBizType, String... msgParams) {
		
		List<MessageTemplete> msgTempList = messageTempleteRepository.findMessageTempleteByBizKeys(MessageType.INTERNAL.getValue(),
				msgBizType,
				MessageReceiverType.BACK_USER.getValue(),
				"1",
				tenantCd);
		
		if (msgTempList.size() == 0) {
			throw new SystemException("消息模版未定义");
		}
		MessageTemplete msgTemp = msgTempList.get(0);
		//消息内容替换
		String temp = msgTemp.getMsgTeml();
		Object[] msgparamsTmp = msgParams;
		String msg = MessageFormat.format(temp, msgparamsTmp);
		
		List<MessageReceiver> msgReceiverList = messageReceiverRepository.findMessageReceiverByBizKeys(msgTemp.getId(), tenantCd);
		
		if (msgReceiverList.size() == 0) {
			throw new SystemException("消息接收者未指定");
		}
		for (MessageReceiver receiver : msgReceiverList) {
			MessageLog msglog = new MessageLog();
			msglog.setId(StringUtils.getUUID());
			msglog.setContent(msg);
			msglog.setSubject(msgTemp.getMsgTitle());
			msglog.setSendTime(DateUtils.getCurrentDateTime());
			msglog.setMsgType(MessageType.INTERNAL.getValue());
			msglog.setStatus("0");
			msglog.setMsgReceiveType(MessageReceiverType.BACK_USER.getValue());
			msglog.setTenantCd(tenantCd);
			msglog.setToUserId(receiver.getReceiverId());
			messageLogRepository.insert(msglog);
		}

		return true;
	}

	@Override
	public boolean send2FrontUser(String toUser, String msgBizType, String... msgParams) {
		String tenantCd ="001";
		List<MessageTemplete> msgTempList = messageTempleteRepository.findMessageTempleteByBizKeys(MessageType.INTERNAL.getValue(),
				msgBizType,
				MessageReceiverType.FRONT_USER.getValue(),
				"1",
				tenantCd);
		if (msgTempList.size() == 0) {
			throw new SystemException("消息模版未定义");
		}
		MessageTemplete msgTemp = msgTempList.get(0);

		//消息内容替换
		String temp = msgTemp.getMsgTeml();
		Object[] msgparamsTmp = msgParams;
		String msg = MessageFormat.format(temp, msgparamsTmp);
		
		//消息标题替换(首次登录发送)
		String msgTitle = msgTemp.getMsgTitle();
		if("1".equals(msgBizType)){
			msgTitle = MessageFormat.format(msgTitle, msgparamsTmp);
		}

		MessageLog msglog = new MessageLog();
		msglog.setId(StringUtils.getUUID());
		msglog.setContent(msg);
		msglog.setSubject(msgTitle);
		msglog.setSendTime(DateUtils.getCurrentDateTime());
		msglog.setMsgType(MessageType.INTERNAL.getValue());
		msglog.setStatus("0");
		msglog.setMsgReceiveType(MessageReceiverType.FRONT_USER.getValue());
		msglog.setTenantCd(Constants.PLAT_TENANT_CD);
		msglog.setToUserId(toUser);
		messageLogRepository.insert(msglog);

		return true;
	}

}
