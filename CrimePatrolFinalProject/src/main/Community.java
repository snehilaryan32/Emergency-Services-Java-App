/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author aryan
 */
public class Comminity {
    String name; 
    String city; 
    int zipcode; 
    int heatLevel; 

    public Comminity(String name, String city, int zipcode, int heatLevel) {
        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
        this.heatLevel = heatLevel;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getHeatLevel() {
        return heatLevel;
    }
    
    
    
}
