/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilPackage;

import model.Person;

/**
 *
 * @author aryan
 */
public class CurrentSession {
    public static Person currentUser;

    public CurrentSession() {
    }

    public static Person getCurrentUser() {
        return currentUser;
    }
    
    public static void setCurrentUser(Person per) {
        CurrentSession.currentUser = per;
    }
    
    
}
