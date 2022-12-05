/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author aryan
 */
public class Citizen {
    
    int wantedLevel; 
    boolean suspect; 
    boolean victim; 

    public Citizen(int wantedLevel, boolean suspect, boolean victim) {
        this.wantedLevel = wantedLevel;
        this.suspect = suspect;
        this.victim = victim;
    }

    public int getWantedLevel() {
        return wantedLevel;
    }

    public boolean isSuspect() {
        return suspect;
    }

    public boolean isVictim() {
        return victim;
    }

    public void setWantedLevel(int wantedLevel) {
        this.wantedLevel = wantedLevel;
    }

    public void setSuspect(boolean suspect) {
        this.suspect = suspect;
    }

    public void setVictim(boolean victim) {
        this.victim = victim;
    }
    
    
    
}
