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
    public static int locationId = 2000000;
    public static int  communityId = 3000000; 
    
    public static int newPersonId(){
        GenerateId.personId = GenerateId.personId + 1;
        return GenerateId.personId; 
    }
    
    public static int newLocationId(){
        GenerateId.locationId = GenerateId.locationId + 1;
        return GenerateId.locationId; 
    }
    
    public static int newCommunityId(){
        GenerateId.communityId = GenerateId.communityId + 1;
        return GenerateId.communityId; 
    }
    
}
