/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import utilPackage.Helper;

/**
 *
 * @author sahilpadyal
 */
@Entity
public class Lawyer extends Person {
    @Id
    @Column(name="LAWYER_ID")
        private int lawyerid;
    
    @Id
    @Column(name="AVAILABILITY")
        String availability;
    
    @Id
    @Column(name="PROBONOLAWYER")
         String probonolawyer;

    public Lawyer(int lawyerid, String availability, String probonolawyer, String name, int address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
        this.lawyerid = lawyerid;
        this.availability = availability;
        this.probonolawyer = probonolawyer;
    }

    
    
    
    public Lawyer(String name, int address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
    }

   
    
        
   

    public int getLawyerid() {
        return lawyerid;
    }

    public void setLawyerid(int lawyerid) {
        this.lawyerid = lawyerid;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getProbonolawyer() {
        return probonolawyer;
    }

    public void setProbonolawyer(String probonolawyer) {
        this.probonolawyer = probonolawyer;
    }

   

    
public void addToLawyerTable(Lawyer law){
        String insertQuery = "insert into person values ( " + law.getId() + ", '" + law.getName() + "'," + law.getAddress() + ",'" + law.getEmail() + "'," + law.getPhoneNo() + ", '" + Helper.getValidSnowFlkDate(law.getDateOfBirth()) + "','" + law.getBloodGroup() + "', '" + law.getGender() + "', '" + law.getRole() + "')";
        String query = "insert into lawyer values(" + law.getLawyerid()+ ",'" + law.getAvailability() + "','" + law.getProbonolawyer() + "')";
        
        Helper.insertDeleteData(query);
        Helper.insertDeleteData(insertQuery);

}           
}
