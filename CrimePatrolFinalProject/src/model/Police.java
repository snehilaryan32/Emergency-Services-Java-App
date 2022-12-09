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
        String query = "insert into location values(" + police.getCaseid() +",'" + police.getName() +",'" + police.getPrecinctid() + ", " + police.getId() + ", '" + police.getRank() + ",'"+ police.getGender() + ",'" + police.getEmail() + ",'" + police.getBloodGroup()+ ",'"+ police.getDateOfBirth()+ ",'" + police.getPerformance() + ","+ police.getAddress() + "," + police.getPhoneNo() + ")";
        Helper.insertData(query);
    
    
}
}
