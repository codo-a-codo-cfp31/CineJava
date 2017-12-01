/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejava;

import java.util.*;

/**
 *
 * @author alumno
 */
public class User extends DBManagedObject {

    

    public User() {
        super();
        listColumns.add("ID");
        listColumns.add("name");
        listColumns.add("email");
        nameTable = "User";
     

    }

}
