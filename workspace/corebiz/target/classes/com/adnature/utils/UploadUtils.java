package com.adnature.utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.adnature.domain.system.entity.UploadFile;
import com.adnature.framework.util.FileUpload;

public class UploadUtils {
	public static UploadFile upload(File file, String fileName, String fileContentType){
		UploadFile uf = new UploadFile();
		if(file != null){
			try {
				Map<String, String> map = FileUpload.fileUpload(file, fileName);
				uf.setFileName(fileName);
				uf.setFileUrlOriginal(map.get("fileUrlOriginal").toString());
				uf.setFileUrlBig(map.get("fileUrlBig"));
				uf.setFileUrlThumb(map.get("fileUrlThumb"));
				uf.setFileType(fileContentType);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return uf;
	}
}
