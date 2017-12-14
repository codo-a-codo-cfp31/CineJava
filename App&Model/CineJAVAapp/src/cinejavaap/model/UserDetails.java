//<editor-fold defaultstate="collapsed" desc="Legal">
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//</editor-fold>
/* Coded by Federico Belchior */
/* FedericoBelchior@gmail.com */

package cinejavaap.model;

import cinejavaapp.dao.DBManagedObject;
import cinejavaapp.dao.Pair;

public class UserDetails extends DBManagedObject{
    private String name;
    private String surname;
    private int  dni;
    private int telephone;
    private int credit_card;
    
    public UserDetails(){
        super();
        listColumns.add("name");
        listValues.add( new Pair<String, String>( "String", name ));
        listColumns.add("surname");
        listValues.add( new Pair<String, String>( "String", surname ));
        listColumns.add("password");
        listValues.add( new Pair<String, String>( "Integer", Integer.toString(dni) ));
        listColumns.add("dni");
        listValues.add( new Pair<String, String>( "Integer", Integer.toString(telephone) ));
        listColumns.add("telephone");
        listValues.add( new Pair<String, String>( "Integer", Integer.toString(credit_card) ));
        listColumns.add("credit_card");
        
   }    
}
