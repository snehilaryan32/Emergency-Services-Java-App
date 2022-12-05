/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author aryan
 */
public class SnowflakeConnector {
    
    public static Connection connect(String userName, String password) {
        
        Properties properties = new Properties();
        properties.put("user", userName); 
        properties.put("password", password);
        properties.put("warehouse", "MY_WH");
        properties.put("db", "CRIMEPATROL"); 
        properties.put("schema", "PUBLIC"); 
        Connection conn = null;
        
        try{
            String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
            conn = DriverManager.getConnection(connectStr, properties);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SnowflakeConnector.class.getName()).log(Level.SEVERE, "unable to connect to SnowFlake", ex);
        }
        
        return conn;
    
    }
}
