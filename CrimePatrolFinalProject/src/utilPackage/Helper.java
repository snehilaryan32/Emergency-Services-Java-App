/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import PoliceDepartment.Precinct;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Community;
import model.Location;

/**
 *
 * @author bashu
 */
public class Helper {
    
    public static Connection connect = SnowflakeConnector.connect(SystemConstants.SNOWFLAKE_ADMIN_UNAME, SystemConstants.SNOWFLAKE_ADMIN_PASSWORD);
    
    public static ResultSet getData(String query){
        Connection connectToSnow = Helper.connect;
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
    
    
    public static int insertData(String query){
        Connection connectToSnow = Helper.connect;
        int rowsInserted = 0; 
        
        try{
            Statement statement = connectToSnow.createStatement();
            rowsInserted = statement.executeUpdate(query); 
        }
        
        catch(SQLException ex){
            ex.printStackTrace();
            
        }
        
        return rowsInserted;
    }
    
    public static String getValidSnowFlkDate(Date inputDate) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
        return dateFormat.format(inputDate);
    }
    
    public static Community fetchCommunity(int communityId){
        Connection connectToSnow = Helper.connect;
        Community comm = null;
        ResultSet res = null;
        int heatLevel = 0;
        String name = null;
        try{
            Statement statement = connectToSnow.createStatement();
            statement.executeQuery("ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON'");
            res = statement.executeQuery("select * from community where community_Id = " + communityId); 
            
            while(res.next()){
                
                name = res.getString(2);
                heatLevel = Integer.parseInt(res.getString(3));
            }
            
            comm = new Community(name, communityId, heatLevel);
        }
        
        catch(SQLException ex){
              System.out.println("Unable to fetch data");     
        }
        
        return comm;
    }
    
    public static Location fetchLocation(int Id) throws SQLException{
        Connection connectToSnow = Helper.connect;
        int communityId = 0;
        int locationId = 0;
        double longitude = 0;
        double latitude = 0; 
        Location loc = null;
        
        ResultSet res = Helper.getData("select * from location where location_id = " + Id);
        while(res.next()){
            longitude = Double.parseDouble(res.getString(1));
            latitude = Double.parseDouble(res.getString(2));
            communityId = Integer.parseInt(res.getString(4));
   
        }
        
        if(communityId != 0){
            Community comm = Helper.fetchCommunity(communityId);
            loc = new Location(Id, longitude, latitude, comm);
        }
        
        
        return loc;
    }
    
        public static Precinct fetchPrecinct(int Id) throws SQLException{
        Connection connectToSnow = Helper.connect;
        
        int locationId = 0;

        Precinct pre = null;
        
        ResultSet res = Helper.getData("select * from precinct where precinct_id = " + Id);
        while(res.next()){
            locationId = Integer.parseInt(res.getString(2));
         
        }
        
        if(locationId != 0){
            Location loc = Helper.fetchLocation(locationId);
            pre = new Precinct(Id, loc, locationId);   
        }
        
        
        return pre;
    }
    
    
    
}
