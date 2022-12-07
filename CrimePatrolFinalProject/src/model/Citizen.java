/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.amazonaws.services.connect.model.PhoneNumberCountryCode;
import java.util.Date;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */
public class Citizen extends Person{
    
    int wantedLevel; 
    boolean suspect; 
    boolean victim; 


    public Citizen(int wantedLevel, boolean suspect, boolean victim, String name, Location address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
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
    
    public void addToPersonTable(Citizen cit){
        
        String insertQuery = "insert into person values ( " + cit.getId() + ", '" + cit.getName() + "'," + cit.getAddress().getLocationId()+ ",'" + cit.getEmail() + "'," + cit.getPhoneNo() + ", to_date('03-02-1998', 'dd-mm-yyyy'),'" + cit.getBloodGroup() + "', '" + cit.getGender() + "', '" + cit.getRole() + "')"; 
        Helper.insertData(insertQuery); 
        
        
    }

}
