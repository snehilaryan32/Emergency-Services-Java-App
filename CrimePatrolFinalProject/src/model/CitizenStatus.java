/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import utilPackage.Helper;

/**
 *
 * @author aryan
 */

@Entity
public class CitizenStatus {
    
    
    @Id
    @Column(name = "STATUS_ID")
    Integer statusId;
    
    
    Person person;
    
    @Column(name = "PERSON_ID")
    Integer personId; 
    
    Person Person;
    
    @Column(name = "STATUS")
    Integer Status;
    
    @Column(name = "CASE_iD")
    Integer caseId; 
    
    @Column(name = "WANTEDLEVEL")
    Integer wantedLevel; 

    public CitizenStatus(Integer statusId, Person person, Integer personId, Person Person, Integer Status, Integer caseId, Integer wantedLevel) {
        this.statusId = statusId;
        this.person = person;
        this.personId = personId;
        this.Person = Person;
        this.Status = Status;
        this.caseId = caseId;
        this.wantedLevel = wantedLevel;
    }

    public CitizenStatus() {
    }

    public Integer getStatusId() {
        return statusId;
    }

    public Person getPerson() {
        return person;
    }

    public Integer getPersonId() {
        return personId;
    }


    public Integer getStatus() {
        return Status;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public Integer getWantedLevel() {
        return wantedLevel;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public void setWantedLevel(Integer wantedLevel) {
        this.wantedLevel = wantedLevel;
    }
    
    public static void addToCitizenStatus(CitizenStatus cs){
        String query = "insert into citizen_status values(" + cs.getStatusId() + "," + cs.getPersonId() + ",'" + cs.getStatus() + "'," + cs.wantedLevel + ")";
        Helper.insertDeleteData(query);
    }
    
    
}
