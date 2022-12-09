/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

/**
 *
 * @author aryan
 */
public class GenerateId {
    
    public static int personId = 1000000; 
    public static int policeID = 2000000;
    public static int doctorID = 3000000;
    public static int emrgencyDispatcherID = 4000000;
    public static int emrgencyFireDispatcherID = 5000000;
    public static int emrgencyMedicalDispatcherID = 6000000;
    public static int locationID = 7000000;
    public static int communityID = 8000000;
    public static int hospitalID  = 9000000;
    public static int precinctID = 10000000; 
    public static int fireStationID = 20000000;
    public static int caseID = 30000000;
  
    public static int newPersonId(){
        GenerateId.personId = GenerateId.personId + 1;
        return GenerateId.personId; 
    }
    
    public static int newPoliceId(){
        GenerateId.policeID = GenerateId.policeID + 1;
        return GenerateId.policeID; 
    }
    
    public static int newDoctorId(){
        GenerateId.doctorID = GenerateId.doctorID + 1;
        return GenerateId.doctorID; 
    }
    
    public static int newEmrgencyDispatcherID(){
        GenerateId.emrgencyDispatcherID = GenerateId.emrgencyDispatcherID + 1;
        return GenerateId.emrgencyDispatcherID; 
    }
    
    public static int newMedicalDispatcherID(){
        GenerateId.emrgencyMedicalDispatcherID = GenerateId.emrgencyMedicalDispatcherID + 1;
        return GenerateId.emrgencyMedicalDispatcherID; 
    }

    public static int newLocationId(){
        GenerateId.locationID = GenerateId.locationID + 1;
        return GenerateId.locationID; 
    }
    
    public static int newCommunityId(){
        GenerateId.communityID = GenerateId.communityID + 1;
        return GenerateId.communityID; 
    }
    
    public static int newHospitalId(){
        GenerateId.hospitalID = GenerateId.hospitalID + 1;
        return GenerateId.hospitalID; 
    }
    
    public static int newPrecinctId(){
        GenerateId.precinctID = GenerateId.precinctID + 1;
        return GenerateId.precinctID; 
    }
    
    public static int newFireStationId(){
        GenerateId.fireStationID = GenerateId.fireStationID + 1;
        return GenerateId.fireStationID; 
    }
    
    public static int newCaseId(){
        GenerateId.caseID = GenerateId.caseID + 1;
        return GenerateId.caseID; 
    }
        
}
