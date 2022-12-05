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
    float[] longtude;
    Comminity comminity; 

    public Location(float[] longtude, Comminity comminity) {
        this.longtude = longtude;
        this.comminity = comminity;
    }

    public float[] getLongtude() {
        return longtude;
    }

    public Comminity getComminity() {
        return comminity;
    }

    public void setLongtude(float[] longtude) {
        this.longtude = longtude;
    }

    public void setComminity(Comminity comminity) {
        this.comminity = comminity;
    }
    
}
