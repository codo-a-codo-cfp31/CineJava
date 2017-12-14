/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaap.model;

import cinejavaapp.dao.DBManagedObject;
import cinejavaapp.dao.Pair;

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
        listValues.add( new Pair<String, String>( "String", username ));
        //TODO: Crear la clase user completa
        // agregando las columnas faltantes definidas en el modelo de datos 
        // ver en la DB.
        // Agregar a la lista listValues cada par (type , value) 
    }
}
