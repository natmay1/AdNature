package com.adnature.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adnature.domain.message.criteria.MessageManagementCriteria;
import com.adnature.domain.message.criteria.MessageTempleteCriteria;
import com.adnature.domain.message.entity.MessageLog;
import com.adnature.domain.message.entity.MessageTemplete;
import com.adnature.domain.message.query.MessageTempleteQuery;
import com.adnature.domain.message.repository.MessageTempleteRepository;
import com.adnature.message.service.MessageTempleteManageService;

@Service
public class MessageTempleteManageServiceImpl implements
		MessageTempleteManageService {

	@Autowired
	MessageTempleteRepository messageTempleteRepository;
	@Autowired
	MessageTempleteQuery messageTempleteQuery;


	@Override
	public void stopMessageTemp(String id) {
		MessageTemplete messageTemplete = new MessageTemplete();
		messageTemplete.setId(id);
		messageTemplete.setValidFlag("0");
		messageTempleteRepository.dynamicUpdate(messageTemplete);

	}

	@Override
	public void startMessageTemp(String id) {
		MessageTemplete messageTemplete = new MessageTemplete();
		messageTemplete.setId(id);
		messageTemplete.setValidFlag("1");
		messageTempleteRepository.dynamicUpdate(messageTemplete);

	}

	@Override
	public List<MessageTemplete> getMessageTempList(
			MessageTempleteCriteria criteria) {
		return messageTempleteRepository.findPageByCriteria(criteria);
	}

	@Override
	public List<MessageTemplete> getMessageTempLists(
			MessageManagementCriteria criteria) {
		return messageTempleteQuery.findPageByCriteria(criteria);
	}
	
	@Override
	public MessageTemplete getMessageTempById(String id){	
		return messageTempleteRepository.findOne(id);
	}

}
