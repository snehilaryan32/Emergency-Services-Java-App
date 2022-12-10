/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author aryan
 */
import utilPackage.Helper;
public class Community {
    String name; 
   // String city; 
    int zipcode;   
    int heatLevel; 

    public Community(String name, int zipcode, int heatLevel) {
        this.name = name;
      //  this.city = city;
        this.zipcode = zipcode;
        this.heatLevel = heatLevel;
    }

    public String getName() {
        return name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getHeatLevel() {
        return heatLevel;
    }
    
    public void addToCommunityTable(Community comm){
        String query = "insert into community values(" + comm.getZipcode() + ", '" + comm.getName() + "', " + comm.getHeatLevel() + ")";
        Helper.insertDeleteData(query);
    }
}
