/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


/**
 *
 * @author aryan
 */
public class Person {
    String name; 
    Location address; 
    String email; 
    long phoneNo; 
    Date dateOfBirth; 
    int id;
    String bloodGroup; 
    String role; 
    String gender; 

    public Person(String name, Location address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.bloodGroup = bloodGroup;
        this.role = role;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Location getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Location address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
