package com.adnature.ui.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.adnature.domain.system.entity.SysSetting;
import com.adnature.domain.system.entity.UploadFile;
import com.adnature.domain.system.repository.UploadFileRepository;
import com.adnature.framework.enumpack.SettingTypeEnum;
import com.adnature.system.service.SettingService;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

public class GetSettingMethod implements TemplateMethodModel{
	@Autowired
	private SettingService settingService;	//系统设定 settingService 接口
    @Autowired
    private UploadFileRepository uploadFileRepository;
	@Override
	public Object exec(List argList) throws TemplateModelException {
		String value="";
		
		SysSetting sysSetting = settingService.findSysSettingBySettingCode(argList.get(0).toString());
		if (sysSetting != null) {
			value = sysSetting.getSettingValue();
			if(SettingTypeEnum.SETTING_TYPE_PICTURE.getCode().equals(sysSetting.getSettingType())){
			    UploadFile file = uploadFileRepository.findOne(value);
			    if(file != null){
			        value = file.getFileUrlOriginal();
			    }
			}
		}
		return value;
	}

}
