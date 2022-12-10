/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoliceDepartment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import model.Location;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */
@Entity
public class Case implements Serializable{
    
    @Id
    private int id;

    @Column(name="CASE_ID")
    Integer caseId;
    
    @Column(name="DESCRIPTION")
    String description;

    Location location; 
    
    @Column(name="LOCATION_ID")
    Integer location_id;
    
    Precinct precinct;
    
    @Column(name="PRECINCT_ID")
    Integer precinctId;
    
    @Column(name="POLICE_ID")
    Integer policeId;
    
    @Column(name="LAWYERID")
    Integer lawyerId;
    
    @Column(name="EMERGENCYTYPE")
    String EmerStringType;
    
    @Column(name = "DATETIME")
    Date dateTime;
    
    @Column(name="CASESTATUS")
    String caseStatus;
    
    @Column(name="DETECTIVE_ID")
    Integer detectiveId;
    

    public String getCaseStatus() {
        return caseStatus;
    }

    public Case(Integer CaseID, String description, Location location, Precinct precinct, Integer policeId, Integer LawyerId, String EmerStringType, Date dateTime, String caseStatus, Integer detectiveId) {
        this.caseId = CaseID;
        this.description = description;
        this.location = location;
        this.precinct = precinct;
        this.policeId = policeId;
        this.lawyerId = LawyerId;
        this.EmerStringType = EmerStringType;
        this.dateTime = dateTime;
        this.caseStatus = caseStatus;
        this.detectiveId = detectiveId;
    }
    
    public Case() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }


    public Precinct getPrecinct() {
        return precinct;
    }

    public void setPrecinct(Precinct precinct) {
        this.precinct = precinct;
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

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public void setPrecinctId(Integer precinctId) {
        this.precinctId = precinctId;
    }

    public Integer getLocationid() {
        return location_id;
    }

    public Integer getPrecinctId() {
        return precinctId;
    }

    public Integer getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Integer lawyerId) {
        this.lawyerId = lawyerId;
    }

    public void addToCaseTable(Case cas){
        String query = "insert into case values(" + cas.getCaseId() + ", '" + cas.getDescription()+ "', " + cas.getLocation().getLocationId() +  ", " + cas.getLawyerId() + ", " + cas.getPrecinct().getPrecinctId() + ", " + cas.getPoliceId() + ", '" + getEmerStringType() + "','" + Helper.getValidSnowFlkDate(cas.getDateTime()) + "','" + cas.getCaseStatus() + "'," + cas.getDetectiveId() + ")";
        Helper.getData(query);
    }
    
}
