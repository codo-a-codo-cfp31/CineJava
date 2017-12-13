/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaap.model;

import cinejavaapp.dao.DBManagedObject;

/**
 *
 * @author alumno
 */
public class User extends DBManagedObject{
   
    private String username;
    
    public User(){
        super();
        listColumns.add("username");
        listColumns.add("email");
    }
}
