/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import PoliceDepartment.Case;
import PoliceDepartment.Precinct;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import utilPackage.Helper;

/**
 *
 * @author sahilpadyal
 */


public class Police extends Person{
    private int id;
    Precinct precinct;
    String rank;
    String performance;

    public Police(Precinct precinct, String rank, String performance, String name, int address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
        this.precinct = precinct;
        this.rank = rank;
        this.performance = performance;
    }

    public Precinct getPrecinct() {
        return precinct;
    }


    public String getRank() {
        return rank;
    }

    public String getPerformance() {
        return performance;
    }


    
    public void addToPoliceTable(Police police){
        String insertQuery = "insert into person values ( " + police.getId() + ", '" + police.getName() + "'," + police.getAddress() + ",'" + police.getEmail() + "'," + police.getPhoneNo() + ", '" + Helper.getValidSnowFlkDate(police.getDateOfBirth()) + "','" + police.getBloodGroup() + "', '" + police.getGender() + "', '" + police.getRole() + "')";
        String query = "insert into police values(" + police.getId() + ",'" + police.getName() + "','" + police.getRank() + "'," + police.getPrecinct().getPrecinctId() + ",'" + police.getPerformance() + "')";
        Helper.insertDeleteData(query);
        Helper.insertDeleteData(insertQuery);
    
    
    }
}
