/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import FireDepartment.FireStation;
import PoliceDepartment.Precinct;
import com.amazonaws.services.s3.model.ObjectListing;
import crimepatrolfinalproject.Credentials;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Table;
import model.Community;
import model.Location;
import java.sql.PreparedStatement;

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
    
    
    public static int insertDeleteData(String query){
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
            longitude = Double.parseDouble(res.getString(3));
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
        Integer captainId = null;

        Precinct pre = null;
        
        ResultSet res = Helper.getData("select * from precinct where precinct_id = " + Id);
        while(res.next()){
            locationId = Integer.parseInt(res.getString(2));
            captainId = Integer.parseInt(res.getString(3));
         
        }
        
        if(locationId != 0){
            Location loc = Helper.fetchLocation(locationId);
            pre = new Precinct(Id, loc.getLocationId(), captainId);   
        }
        
        
        return pre;
    }
    
     public static FireStation fetchFireStation(int Id) throws SQLException{
        Connection connectToSnow = Helper.connect;
        
        int locationId = 0;
        Integer cheifId = null;

        FireStation fire = null;
        
        ResultSet res = Helper.getData("select * from fireStation where station_id = " + Id);
        while(res.next()){
            locationId = Integer.parseInt(res.getString(2));
            cheifId = Integer.parseInt(res.getString(3));
         
        }
        
        if(locationId != 0){
            Location loc = Helper.fetchLocation(locationId);
            fire = new FireStation(Id, loc.getLocationId(), cheifId);   
        }
        
        
        return fire;
    }    
        
        //Function to fetch data from
        
    public static <T> List<T> getResultSet(Class<T> c, String table) throws InstantiationException{
        Object obj = null;  
        List<T> objList = null;
        try {
            
            
            obj = c.newInstance();
            ResultSet result = Helper.getData("select * from " + table);
            ResultSetMapper<T> credsRSMapper = new ResultSetMapper<T>();
            objList = credsRSMapper.mapResultSetToObject(result, c);
            
            
        } 
        
        catch (IllegalAccessException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objList;
            
    }
    
    public static <T> List<T> getResultSetByConditionId(Class<T> c, String table, String conditionId, Integer id) throws InstantiationException {
        Object obj = null;  
        List<T> objList = null;
        try {
            
            
            obj = c.newInstance();
            ResultSet result = Helper.getData("select * from " + table + " where " + conditionId + " = " + id);
            ResultSetMapper<T> credsRSMapper = new ResultSetMapper<T>();
            objList = credsRSMapper.mapResultSetToObject(result, c);
            
            
        } 
        
        catch (IllegalAccessException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objList;
    }
        
        public static int getMaxId(String table, String columnName, String condition) throws SQLException{
            
            Integer maxId = null;
            if(condition == null){
                String query = "select max(" + columnName + ") + 1 from " + table; 
                ResultSet res = Helper.getData(query); 
                
                while(res.next()){
                    maxId = res.getInt(1);

                }
            }
            
            else{
                String query = "select max(" + columnName + ") + 1 from " + table + "where " + condition;
                ResultSet res = Helper.getData(query); 
                
                while(res.next()){
                    maxId = res.getInt(1);
                }
                
            }
            
            return maxId;
            
        }
        
        public static void updateColumns(String table, Map<String, String> columns, String condition) throws SQLException {
            
            Connection con = Helper.connect; 
            StringBuilder updateSql = new StringBuilder("UPDATE " + table + " SET ");
            for (Map.Entry<String, String> entry : columns.entrySet()) {
                updateSql.append(entry.getKey() + " = ?, ");
            }
            updateSql.delete(updateSql.length() - 2, updateSql.length()); // Remove the last ", "
            if (condition != null) {
                updateSql.append(" WHERE " + condition);
            }

            try (PreparedStatement stmt = con.prepareStatement(updateSql.toString())) {
                int i = 1;
                for (String value : columns.values()) {
                    stmt.setString(i++, value);
                }
                stmt.executeUpdate();
            }
            
//            public static void deleteColoumns(String table, id){
//                Connection con = Helper.connect; 
//                query = "delete from " + table + "where id = " + 
//            }

    }
    
        
    
}
