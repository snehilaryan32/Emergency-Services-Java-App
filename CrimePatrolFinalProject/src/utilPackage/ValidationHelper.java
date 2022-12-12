/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author bashu
 */
public class ValidationHelper {
    
    public static Boolean isValidId(String id) {
        
        try {
            Integer.valueOf(id);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
        
    }
    
    public static Boolean isValidIdsList(ArrayList<String> idList) {
        
        try {
            for(String id: idList) {
                Integer.valueOf(id);
            }
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
        
    }
    
    public static String getInvalidNumericId(Map<String, String> idsMap) {
        for (Map.Entry<String, String> entry : idsMap.entrySet()) {
            if(isEmptyOrNullString(entry.getValue())) {
                continue;
            }
            
            try {
                Integer.valueOf(entry.getValue());
            } catch(NumberFormatException e) {
                return entry.getKey();
            }
        }
        return "";
    }
    
    public static Boolean isEmptyOrNullString(String str) {
        return str == null || str.isBlank();
    }
    
}
