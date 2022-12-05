/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bashu
 */
public class Helper {
    
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
