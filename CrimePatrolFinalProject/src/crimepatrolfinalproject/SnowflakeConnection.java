/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crimepatrolfinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author aryan
 */
public class SnowflakeConnection {
    
    String user;
    String password;
    String warehouse; 
    String db; 
    String schema; 
    String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
    Connection conn; 
    
    

    public SnowflakeConnection (String user, String password, String warehouse, String db, String schema) {
        this.user = user;
        this.password = password;
        this.warehouse = warehouse;
        this.db = db;
        this.schema = schema;
    }
    
    
    
    public Connection connect() {
        
        Properties properties = new Properties();
        properties.put("user", "SNEHILARYAN"); 
        properties.put("password", "Breakingbad@1");
        properties.put("warehouse", "MY_WH");
        properties.put("db", "CRIMEPATROL"); 
        properties.put("schema", "PUBLIC"); 
        
        try{
            String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
            Connection conn = DriverManager.getConnection(connectStr, properties);
            return conn;
        }
        
        catch (SQLException ex) {
            System.out.println("connection failed");
        }
        
        return conn;
    
    }
        
    
    
}
