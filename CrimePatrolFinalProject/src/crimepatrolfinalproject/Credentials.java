/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crimepatrolfinalproject;

/**
 *
 * @author bashu
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import utilPackage.Helper;

@Entity
public class Credentials implements Serializable {
    

    
    @Column(name="USERNAME")
    String userName;
    
    @Column(name="PASSWORD")
    String password;

    public Credentials(String userName, String password) {
    //    this.id = id;
        this.userName = userName;
        this.password = password;
    }
    
    public Credentials() {}

//    public int getId() {
//        return id;
//    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }



   
    public void addToCredentialTable(Credentials cred){
        String query = "insert into credentials values('" + cred.getUserName() + "', '" + cred.getPassword() + "')";
        Helper.insertData(query);
    }
    
}
