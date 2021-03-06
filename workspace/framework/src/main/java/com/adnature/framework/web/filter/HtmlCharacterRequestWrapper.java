package com.adnature.framework.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class HtmlCharacterRequestWrapper extends HttpServletRequestWrapper {
	
      private HttpServletRequest request;
  
      public HtmlCharacterRequestWrapper(HttpServletRequest request) {
          super(request);
          this.request = request;
      }
	  
	  /* 覆盖需要增强的getParameter方法
	   * @see javax.servlet.ServletRequestWrapper#getParameter(java.lang.String)
	   */
	  @Override
	  public String getParameter(String name) {
	      String value = this.request.getParameter(name);
	      if (value == null) {
	          return null;
	      }
	      //调用filter转义value中的html标签
	      return filter(value);
	  }
	  
	 /**
	  * @Method: filter
	  * @Description: 过滤内容中的html标签
	  * @param message
	  * @return
	  */ 
	  public String filter(String message) {
	      if (message == null){
	          return null;
	      }
	      char content[] = new char[message.length()];
	      message.getChars(0, message.length(), content, 0);
	      StringBuffer result = new StringBuffer(content.length + 50);
	      for (int i = 0; i < content.length; i++) {
	          switch (content[i]) {
	          case '<':
	              result.append("&lt;");
	              break;
	          case '>':
	              result.append("&gt;");
	              break;
	          case '&':
	              result.append("&amp;");
	              break;
	         case '"':
	             result.append("&quot;");
	                 break;
//	         case '‘':
//	             result.append("&apos;");
//	                 break;
	             default:
	                 result.append(content[i]);
	             }
	         }
	         return result.toString();
	     }
	 }
