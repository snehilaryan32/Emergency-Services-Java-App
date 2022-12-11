/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliceDepartment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import model.Location;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */
@Entity
public class Precinct {
    
    @Id
    @Column(name="PRECINCT_ID")
    int precinctId; 
    
    @Id
    @Column(name="LOCATION_ID")
    int location; 
    @Id
    @Column(name="CAPTAIN_ID")
    int CaptainId; 
    
    public Precinct(int precinctId, int location, int CaptainId) {
        this.precinctId = precinctId;
        this.location = location;
        this.CaptainId = CaptainId;
    }
    
    public Precinct() {};
    

    public void setPrecinctId(int precinctId) {
        this.precinctId = precinctId;
    }

    

    public void setCaptainId(int CaptainId) {
        this.CaptainId = CaptainId;
    }

    public int getPrecinctId() {
        return precinctId;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

   
    public int getCaptainId() {
        return CaptainId;
    }

    
    
    public void addToPrecinctTable(Precinct pre){
        String query = "insert into precinct values(" + pre.getPrecinctId() + ", " + pre.getLocation() + ", " + pre.getPrecinctId() + ")";
        Helper.insertDeleteData(query);
    }
    
    
}
