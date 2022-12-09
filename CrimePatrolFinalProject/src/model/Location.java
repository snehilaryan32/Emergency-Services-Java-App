/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aryan
 */
public class Location {
    
    int locationId;
    double longtude;
    double latitude; 
    Community comminity; 

    public Location(int locationId, double longtude, double latitude, Community comminity) {
        this.locationId = locationId;
        this.longtude = longtude;
        this.latitude = latitude;
        this.comminity = comminity;
    }

    public int getLocationId() {
        return locationId;
    }

    public double getLongtude() {
        return longtude;
    }

    public double getLatitude() {
        return latitude;
    }

    public Community getComminity() {
        return comminity;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public void setLongtude(double longtude) {
        this.longtude = longtude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setComminity(Community comminity) {
        this.comminity = comminity;
    }
    

}
