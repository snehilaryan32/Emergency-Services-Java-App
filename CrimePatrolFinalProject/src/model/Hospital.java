/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import utilPackage.Helper;

/**
 *
 * @author bashu
 */
@Entity
public class Hospital {
    
    @Column(name="hospital_id")
    Integer hospitalId;
    
    @Column(name="name")
    String name;
    
    @Column(name="locationId")
    Integer locationId;
    
    @Column(name="email")
    String emailId;
    
    @Column(name="contactNo")
    Integer contactNum;
    
    public Hospital(Integer id, Integer locationId, String name, String email, Integer contactNum) {
        this.hospitalId = id;
        this.name = name;
        this.locationId = locationId;
        this.emailId = email;
        this.contactNum = contactNum;
    }
    
    public Hospital() {};

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getContactNum() {
        return contactNum;
    }

    public void setContactNum(Integer contactNum) {
        this.contactNum = contactNum;
    }
    
    public void addToHospitalTable(Hospital hospital) {
        String query = "insert into hospital values(" + hospital.getHospitalId() + ",'" + hospital.getName()+ "', " + hospital.getLocationId() +  ",'" + hospital.getEmailId() + "', " + hospital.getContactNum() + ")";
        Helper.getData(query);
    }
    
}
