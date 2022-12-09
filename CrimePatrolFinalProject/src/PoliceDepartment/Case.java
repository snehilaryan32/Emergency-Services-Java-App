/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliceDepartment;

import java.util.Date;
import model.Location;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */
public class Case {
    
    
    Integer CaseID;
    String description;
    Location location; 
    Precinct precinct;
    Integer policeId;
    Integer LawyerId;
    String EmerStringType;
    Date dateTime;
    String caseStatus;
    Integer detectiveId;

    public String getCaseStatus() {
        return caseStatus;
    }

    public Case(Integer CaseID, String description, Location location, Precinct precinct, Integer policeId, Integer LawyerId, String EmerStringType, Date dateTime, String caseStatus, Integer detectiveId) {
        this.CaseID = CaseID;
        this.description = description;
        this.location = location;
        this.precinct = precinct;
        this.policeId = policeId;
        this.LawyerId = LawyerId;
        this.EmerStringType = EmerStringType;
        this.dateTime = dateTime;
        this.caseStatus = caseStatus;
        this.detectiveId = detectiveId;
    }

    public void setDetectiveId(Integer detectiveId) {
        this.detectiveId = detectiveId;
    }

    public Integer getDetectiveId() {
        return detectiveId;
    }


    public Date getDateTime() {
        return dateTime;
    }

    public void setLawyerId(Integer LawyerId) {
        this.LawyerId = LawyerId;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }


    public Precinct getPrecinct() {
        return precinct;
    }

    public Integer getLawyerId() {
        return LawyerId;
    }

    public void setPrecinct(Precinct precinct) {
        this.precinct = precinct;
    }
    
    public void setCaseID(Integer CaseID) {
        this.CaseID = CaseID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public void setEmerStringType(String EmerStringType) {
        this.EmerStringType = EmerStringType;
    }

    public Integer getCaseID() {
        return CaseID;
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }

    public Integer getPoliceId() {
        return policeId;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getEmerStringType() {
        return EmerStringType;
    }

    public void addToCaseTable(Case cas){
        String query = "insert into case values(" + cas.getCaseID() + ", '" + cas.getDescription()+ "', " + cas.getLocation().getLocationId() +  ", " + cas.getLawyerId() + ", " + cas.getPrecinct().getPrecinctId() + ", " + cas.getPoliceId() + ", '" + getEmerStringType() + "','" + Helper.getValidSnowFlkDate(cas.getDateTime()) + "','" + cas.getCaseStatus() + "'," + cas.getDetectiveId() + ")";
        Helper.getData(query);
    }
    
    
}
