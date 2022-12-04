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

    public SnowflakeConnection(String user, String password, String warehouse, String db, String schema) {
        this.user = user;
        this.password = password;
        this.warehouse = warehouse;
        this.db = db;
        this.schema = schema;
    }
    
    public Connection connect() throws SQLException{
        
        Properties properties = new Properties();
        properties.put("user", user); 
        properties.put("password", password);
        properties.put("warehouse", warehouse);
        properties.put("db", db); 
        properties.put("schema", schema); 
        
        String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
        return DriverManager.getConnection(connectStr, properties);
        
        
        
    }
        
    
    
}
