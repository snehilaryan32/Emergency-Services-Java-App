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
    
    int CaseID;
    String description;
    Location location; 
    Precinct precinct;
    int policeId;
    int LawyerId;
    String EmerStringType;
    Date dateTime;
    String caseStatus;

    public String getCaseStatus() {
        return caseStatus;
    }

    public Case(int CaseID, String description, Location location, Precinct precinct, int policeId, int LawyerId, String EmerStringType, Date dateTime, String caseStatus) {
        this.CaseID = CaseID;
        this.description = description;
        this.location = location;
        this.precinct = precinct;
        this.policeId = policeId;
        this.LawyerId = LawyerId;
        this.EmerStringType = EmerStringType;
        this.dateTime = dateTime;
        this.caseStatus = caseStatus;
    }


    public Date getDateTime() {
        return dateTime;
    }

    public void setLawyerId(int LawyerId) {
        this.LawyerId = LawyerId;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

 

    public Precinct getPrecinct() {
        return precinct;
    }

    public int getLawyerId() {
        return LawyerId;
    }

    public void setPrecinct(Precinct precinct) {
        this.precinct = precinct;
    }
    
    public void setCaseID(int CaseID) {
        this.CaseID = CaseID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    public void setPoliceId(int policeId) {
        this.policeId = policeId;
    }

    public void setEmerStringType(String EmerStringType) {
        this.EmerStringType = EmerStringType;
    }

    public int getCaseID() {
        return CaseID;
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }

    
    public int getPoliceId() {
        return policeId;
    }

    public String getEmerStringType() {
        return EmerStringType;
    }

    public void addToCaseTable(Case cas){
        String query = "insert into case values(" + cas.getCaseID() + ", '" + cas.getDescription()+ "', " + cas.getLocation().getLocationId() + ", " + ", " + cas.getLawyerId() + ", " + cas.getPrecinct().getPrecinctId() + ", " + cas.getPoliceId() + "', '" + getEmerStringType() + "', to_date('03-02-1998', 'dd-mm-yyyy') ,'" + cas.getCaseStatus() + ")";
        Helper.getData(query);
    }
    
    
}
