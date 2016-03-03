package com.adnature.framework.report.bean;

import java.io.OutputStream;
import java.util.Map;

import com.adnature.framework.report.ExcleTablWorkBook;

public interface Writer {
	public void writer(OutputStream out,ExcleTablWorkBook tableWrokBook,Map<String,Object> dataSource);
}
