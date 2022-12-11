/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FireDepartment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */

@Entity
public class FireStation {
    @Id
    @Column(name="STATION_ID")
    int stationId; 
    @Id
    @Column(name="LOCATION_ID")
    int LocationId; 
    
    @Id
    @Column(name="EMAIL")
    String email;
    
    @Id
    @Column(name="CHEIF_ID")
    int chiefId;
    
    

    public FireStation(int stationId, int LocationId, String email) {
        this.stationId = stationId;
        this.LocationId = LocationId;
        this.email = email;
        this.chiefId = chiefId;
    }
    
        public FireStation() {};

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getStationId() {
        return stationId;
    }

    public int getLocationId() {
        return LocationId;
    }

    public int getChiefId() {
        return chiefId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setLocationId(int LocationId) {
        this.LocationId = LocationId;
    }

    public void setChiefId(int chiefId) {
        this.chiefId = chiefId;
    }
    
    public void InsertToFireTable(FireStation fir){
        String query = "insert into fireStation values(" + fir.getStationId() + ",'" + fir.getLocationId() + "')";
        Helper.insertDeleteData(query);
    }
    
}
