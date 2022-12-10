/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliceDepartment;

import model.Location;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */
public class Precinct {
    
    int precinctId; 
    Location location; 
    int CaptainId; 

    public void setPrecinctId(int precinctId) {
        this.precinctId = precinctId;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setCaptainId(int CaptainId) {
        this.CaptainId = CaptainId;
    }

    public int getPrecinctId() {
        return precinctId;
    }

    public Location getLocation() {
        return location;
    }

    public int getCaptainId() {
        return CaptainId;
    }

    public Precinct(int precinctId, Location location, int CaptainId) {
        this.precinctId = precinctId;
        this.location = location;
        this.CaptainId = CaptainId;
    }
    
    public void addToPrecinctTable(Precinct pre){
        String query = "insert into precinct values(" + pre.getPrecinctId() + ", " + pre.getLocation().getLocationId() + ", " + pre.getPrecinctId() + ")";
        Helper.insertDeleteData(query);
    }
    
    
}
