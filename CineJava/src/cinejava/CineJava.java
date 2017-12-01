/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejava;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class CineJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        MasterController mastercontroller = new MasterController();

        controller controller1 = new controller();
        controller controller2 = new controller();
        controller controller3 = new controller();

        System.out.println(mastercontroller.empty());

        mastercontroller.push(controller1);
        System.out.println(mastercontroller.stack);

        mastercontroller.push(controller2);
        System.out.println(mastercontroller.stack);

        mastercontroller.push(controller3);
        System.out.println(mastercontroller.stack);

        System.out.println(mastercontroller.search(controller2));

        mastercontroller.pop();
        System.out.println(mastercontroller.stack);

        User user = new User();
        
        ResultSet rs = (bdconnection.GetSingleton().SelectObjects(user));
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) {
                    System.out.print(",  ");
                }
                String columnValue = rs.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }

    }

}
