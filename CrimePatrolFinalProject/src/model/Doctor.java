/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import utilPackage.Helper;

/**
 *
 * @author bashu
 */

@Entity
public class Doctor extends Person {
    
    @Column(name = "doctor_id")
    Integer doctorId;
    
    @Column(name = "hospital_id")
    Integer hospitalId;
    
    public Doctor(String name, Integer address, String email, Long phoneNo, Date dateOfBirth, Integer id, String bloodGroup, String role, String gender, Integer doctorId, Integer hospitalId){
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
        this.doctorId = doctorId;
        this.hospitalId = hospitalId;
    }

    public Doctor(String name, int address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        super(name, address, email, phoneNo, dateOfBirth, id, bloodGroup, role, gender);
    }  

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }
    
    public void addToDoctorTable(Doctor doc){
        String insertQuery = "insert into person values ( " + doc.getId() + ", '" + doc.getName() + "'," + doc.getAddress() + ",'" + doc.getEmail() + "'," + doc.getPhoneNo() + ", '" + "01-DEC-1987" + "','" + doc.getBloodGroup() + "', '" + doc.getGender() + "', '" + doc.getRole() + "')";
        String query = "insert into doctor values(" + doc.getDoctorId() + "," + doc.getHospitalId() + ")";
        Helper.insertDeleteData(query);
        Helper.insertDeleteData(insertQuery);
    }
    
}
