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
import model.Citizen;
import model.Community;
import model.Location;
import utilPackage.S3BucketOperations;
import utilPackage.Helper; 
import utilPackage.Helper;
import utilPackage.ResultSetMapper;
import utilPackage.SystemConstants;
import utilPackage.SendNotification;


/**
 *
 * @author aryan
 */
public class CrimePatrolFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
//        ResultSetMapper<Credentials> credentialsResultSetMapper = new ResultSetMapper<Credentials>();
//        
//        ResultSet resultSet = null;
//        
//        resultSet = Helper.getData("select * from credentials");
//        
//        List<Credentials> credList = credentialsResultSetMapper.mapResultSetToObject(resultSet, Credentials.class);
//        
//        for(Credentials cred: credList) {
//            System.out.println("UserName: " + cred.getUserName() + " and Password: " + cred.getPassword());
//        }
//        
//  
//        new Login().setVisible(true);
        
    //    SendNotification.sendEmailNotification("Good Morning From Java", "Testing the code", "aryan.s@northeastern.edu");
    //    SendNotification.sendEmailNotification("Good Morning From Java", "Testing the code", "bisht.b@northeastern.edu");
    //    SendNotification.sendEmailNotification("Good Morning From Java", "Testing the code", "padyal.s@northeastern.edu");
        
        
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

//**************************CODE TO TEST AWS***************************************************




    //    S3BucketOperations.putObjectToS3("crime-patrol-evidence", "C:/Users/aryan/Desktop/Capture.JPG", "tested-from-final-froject.JPG");
    //    S3BucketOperations.getObjectFromS3("crime-patrol-evidence", "CaptureFromAws.JPG", "tested-from-final-froject.JPG"); 
    
        Helper.insertData("insert into credentials values('12334', 'Breakingbad@1')");
        String query = "insert into person values(12345, 'bashu', 1234, 'aryan.s@northeastern.edu', 9334117595, to_date('03-02-1998', 'mm-dd-yyyy'), 'A+', 'Male', 'Citizen')";
        Helper.insertData(query);
        
        Community comm = new Community("Roxbury", 0, 10202);
        
   
        
        Location location = new Location(1000, 12.5);
        Citizen cit = new Citizen(0, false, false, "Sahil", location, "helloEmail", Long.parseLong("9334117595"), null, 12349876, "A+", "Citizen", "Male");
        cit.addToPersonTable(cit);
        

        }

    }
    

