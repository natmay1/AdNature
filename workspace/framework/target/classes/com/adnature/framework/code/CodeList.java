
package com.adnature.framework.code;

import java.util.Map;


public interface CodeList {

    Map<String, String> getMap(String bizType);
    
    Map<String, String> toMap();    
}
