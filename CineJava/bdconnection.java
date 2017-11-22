/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineJava;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class bdconnection {
//desde acá hago que esta clase se comporte como singleton

    private static bdconnection singletoninstance = null;
    private Connection conn = null;

    final String url = "jdbc:mysql://IP:192.168.230.3/"; //cadena de conexión.
    final String dbName = "mydb"; //nombre de la base de datos.
    final String driver = "com.mysql.jdbc.Driver";
    final String UserName = "root";
    final String password = "codoacodo";

    private bdconnection() {
        try {
            //  class.forName(driver);
            //.newInstance();
            conn = (Connection) DriverManager.getConnection(url, url, password);

            if (!conn.isClosed()) {
                System.out.println("Database connection working using TCP/IP ");
            }

        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {

            }
        }
    }

    public static bdconnection GetSingleton() {

        if (singletoninstance == null) {
            singletoninstance = new bdconnection();
        }
        return singletoninstance;
//hasta acá.
    }

}
    
    
    


//IP 192.168.230.3
