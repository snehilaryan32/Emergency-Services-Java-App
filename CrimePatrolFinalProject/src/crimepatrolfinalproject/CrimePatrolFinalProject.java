/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crimepatrolfinalproject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author aryan
 */
public class CrimePatrolFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        
        SnowflakeConnection conn = new SnowflakeConnection("SNEHILARYAN", "Breakingbad@1", "MY_WH", "TESTJAVA", "PUBLIC");
        Connection newConn = conn.connect(); 
        
        Statement statement = newConn.createStatement();
        statement.executeUpdate("insert into mytable values ('69999999999999999999999999')");
        System.out.println("Done inserting 'hello world'\n");
        statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
        ResultSet res = statement.executeQuery("select * from mytable");
        
        while (res.next()) {
            System.out.println(res.getString(1));
            }
       
        }
        
        
        
        
    }
    

