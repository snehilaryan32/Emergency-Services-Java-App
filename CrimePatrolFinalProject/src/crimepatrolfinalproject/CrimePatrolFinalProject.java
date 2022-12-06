/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crimepatrolfinalproject;
import utilPackage.SnowflakeConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilPackage.Helper;
import utilPackage.ResultSetMapper;
import utilPackage.SystemConstants;

/**
 *
 * @author aryan
 */
public class CrimePatrolFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        ResultSetMapper<Credentials> credentialsResultSetMapper = new ResultSetMapper<Credentials>();
        
        ResultSet resultSet = null;
        
        resultSet = Helper.getData("select * from credentials");
        
        List<Credentials> credList = credentialsResultSetMapper.mapResultSetToObject(resultSet, Credentials.class);
        
        for(Credentials cred: credList) {
            System.out.println("UserName: " + cred.getUserName() + " and Password: " + cred.getPassword());
        }
        
  
        new Login().setVisible(true);
        
//       Properties properties = new Properties();
//        properties.put("user", "SNEHILARYAN"); 
//        properties.put("password", "Breakingbad@1");
//        properties.put("warehouse", "MY_WH");
//        properties.put("db", "CRIMEPATROL"); 
//        properties.put("schema", "PUBLIC"); 
//        Connection conn = null;
//        
//        try{
//            String connectStr = "jdbc:snowflake://cfukojb-pm07945.snowflakecomputing.com"; 
//            conn = DriverManager.getConnection(connectStr, properties);
//            System.out.println("connection success " + conn);
//        }
//        
//        catch (SQLException ex) {
//            System.out.println("connection failed");
//        }

        }

    }
    

