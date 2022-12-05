/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author aryan
 */
public class SnowflakeConnector {
    
    //    String user;
//    String password;
//    String warehouse; 
//    String db; 
//    String schema; 
//    String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
//    Connection conn; 
//    
//    
//
//    public SnowflakeConnection (String user, String password, String warehouse, String db, String schema) {
//        this.user = user;
//        this.password = password;
//        this.warehouse = warehouse;
//        this.db = db;
//        this.schema = schema;
//    }
    
    
    
    public static Connection connect(String userName, String password) {
        
        Properties properties = new Properties();
        properties.put("user", "SNEHILARYAN"); 
        properties.put("password", "Breakingbad@1");
        properties.put("warehouse", "MY_WH");
        properties.put("db", "CRIMEPATROL"); 
        properties.put("schema", "PUBLIC"); 
        Connection conn = null;
        
        try{
            String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
            conn = DriverManager.getConnection(connectStr, properties);
        }
        
        catch (SQLException ex) {
            System.out.println("connection failed");
        }
        
        return conn;
    
    }
    
    public static ResultSet getData(String query){
        Connection connectToSnow = SnowflakeConnector.connect(SystemConstants.SNOWFLAKE_ADMIN_UNAME, SystemConstants.SNOWFLAKE_ADMIN_PASSWORD);
        ResultSet res = null;
        try{
            Statement statement = connectToSnow.createStatement();
            statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
            res = statement.executeQuery(query);
            
        }
        
        catch(SQLException ex){
              System.out.println("Unable to fetch data");
              
          }
     
        return res;
    }
}
