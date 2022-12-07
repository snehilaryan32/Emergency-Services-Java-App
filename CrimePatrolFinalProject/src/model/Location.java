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
    float[] longtude;
    Community comminity; 

    public Location(float[] longtude, Community comminity) {
        this.longtude = longtude;
        this.comminity = comminity;
    }

    public float[] getLongtude() {
        return longtude;
    }

    public Community getComminity() {
        return comminity;
    }

    public void setLongtude(float[] longtude) {
        this.longtude = longtude;
    }

    public void setComminity(Community comminity) {
        this.comminity = comminity;
    }
    
}
