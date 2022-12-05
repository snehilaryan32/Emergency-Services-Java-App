/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author aryan
 */
public class Location {
    float[] coordinates;
    Community comminity; 

    public Location(float[] longtude, Community comminity) {
        this.coordinates = coordinates;
        this.comminity = comminity;
    }

    public float[] getLongtude() {
        return coordinates;
    }

    public Community getComminity() {
        return comminity;
    }

    public void setcoordinates(float[] coordinates) {
        this.coordinates = coordinates;
    }

    public void setComminity(Community comminity) {
        this.comminity = comminity;
    }
    
}
