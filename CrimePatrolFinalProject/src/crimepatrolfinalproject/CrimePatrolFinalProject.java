/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crimepatrolfinalproject;
import utilPackage.SnowflakeConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        
        SnowflakeConnector conn = new SnowflakeConnector(SystemConstants.SNOWFLAKE_ADMIN_UNAME, SystemConstants.SNOWFLAKE_ADMIN_PASSWORD, "MY_WH", "CRIMEPATROL", "PUBLIC");
          
          Connection newConn = conn.connect(SystemConstants.SNOWFLAKE_ADMIN_UNAME, SystemConstants.SNOWFLAKE_ADMIN_PASSWORD);
          System.err.println(newConn);
          
          try{
            Statement statement = newConn.createStatement();
            statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
            ResultSet res = statement.executeQuery("select * from credentials");
            while (res.next()) {
                System.out.println(res.getString(1));
              }

          }
          
          catch(SQLException ex){
              System.out.println("crimepatrolfinalproject.CrimePatrolFinalProject.main()");
              
          }
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
    

