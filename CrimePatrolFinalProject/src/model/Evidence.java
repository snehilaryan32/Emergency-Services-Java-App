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
public class Evidence {
    
    @Id
    @Column(name="EVIDENCE_ID")
    Integer evidenceId;
    
    @Column(name="CASE_ID")
    Integer caseId;
    
    @Column(name="DESCRIPTION")
    String description;
    
    @Column(name="IMAGEPATH")
    String imagePath;

    public Evidence(Integer evidenceId, Integer caseId, String desc, String imagePath) {
        this.evidenceId = evidenceId;
        this.caseId = caseId;
        this.description = desc;
        this.imagePath = imagePath;
    }
    
    public Evidence() {};

    public Integer getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(Integer evidenceId) {
        this.evidenceId = evidenceId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public void addToEvidenceTable(Evidence evidence){
        String query = "insert into evidence values(" + evidence.getEvidenceId() + "," + evidence.getCaseId() + ",'" + evidence.getDescription() + "','" + evidence.getImagePath() + "')";
        Helper.insertDeleteData(query);
    }
}
