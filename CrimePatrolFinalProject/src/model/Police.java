/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import utilPackage.Helper;

/**
 *
 * @author sahilpadyal
 */
public class Police extends Person{
    
    int precinctid;
    int caseid;
    String rank;
    String performance;

    public Police(int precinctid, int caseid, String rank, String performance, String name, int address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
        this.precinctid = precinctid;
        this.caseid = caseid;
        this.rank = rank;
        this.performance = performance;
    }

    
    
    
    

    
    

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
    

    public int getPrecinctid() {
        return precinctid;
    }

    public void setPrecinctid(int precinctid) {
        this.precinctid = precinctid;
    }

    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void addToPoliceTable(Police police){
        String insertQuery = "insert into person values ( " + police.getId() + ", '" + police.getName() + "'," + police.getAddress() + ",'" + police.getEmail() + "'," + police.getPhoneNo() + ", to_date('03-02-1998', 'dd-mm-yyyy'),'" + police.getBloodGroup() + "', '" + police.getGender() + "', '" + police.getRole() + "')";
        String query = "insert into police values(" + police.getId() + ",'" + police.getName() + "','" + police.getRank() + "'," + police.getPrecinctid() + ",'" + police.getPerformance() + "')";
        Helper.insertData(query);
        Helper.insertData(insertQuery);
    
    
}
}
