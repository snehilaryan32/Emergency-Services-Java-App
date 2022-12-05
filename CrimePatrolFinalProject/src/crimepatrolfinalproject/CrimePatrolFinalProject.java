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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            System.out.println("connection success" + conn);
        }
        
        catch (SQLException ex) {
            System.out.println("connection failed");
        }
          
//          try{
//            Statement statement = newConn.createStatement();
//            statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
//            ResultSet res = statement.executeQuery("select * from credentials");
//            while (res.next()) {
//                System.out.println(res.getString(1));
//              }
//
//          }
//          
//          catch(SQLException ex){
//              System.out.println("crimepatrolfinalproject.CrimePatrolFinalProject.main()");
//              
//          }
//          finally {
//            try {
//                newConn.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CrimePatrolFinalProject.class.getName()).log(Level.SEVERE, null, ex);
//            }
//          }
        
//        
//          SnowflakeConnection conn = new SnowflakeConnection("SNEHILARYAN", "Breakingbad@1", "MY_WH", "CRIMEPATROL", "PUBLIC");
//          
//          Connection newConn = conn.connect(); 
//          System.err.println(newConn);
//          
//          try{
//            Statement statement = newConn.createStatement();
//            statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
//            ResultSet res = statement.executeQuery("select * from credentials");
//            while (res.next()) {
//                System.out.println(res.getString(1));
//              }
//
//          }
//          
//          catch(SQLException ex){
//              System.out.println("crimepatrolfinalproject.CrimePatrolFinalProject.main()");
//              
//          }
        
//        Statement statement = newConn.createStatement();
//        statement.executeUpdate("insert into mytable values ('69999999999999999999999999')");
//        System.out.println("Done inserting 'hello world'\n");
//        statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
//        ResultSet res = statement.executeQuery("select * from mytable");
////        
           
        
        

       
        }
        
        
        
        
    }
    

