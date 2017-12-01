/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejava;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class bdconnection {
    //desde acÃ¡ hago que esta clase se comporte como singleton

    private static bdconnection singletoninstance = null;
    private Connection conn = null;
    

    final String url = "jdbc:mysql://192.168.230.27:3306/mydb"; //cadena de conexion.
    final String dbName = "mydb"; //nombre de la base de datos.
    final String driver = "com.mysql.jdbc.Driver";
    final String UserName = "alumno";
    final String password = "codoacodo";

    private bdconnection() {

        try {
            //  class.forName(driver);
            //.newInstance();
            conn = (Connection) DriverManager.getConnection(url, UserName, password);

            if (!conn.isClosed()) {
                System.out.println("Database connection working using TCP/IP ");
            }

        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());

        } 
     
    }
    
    public ResultSet SelectObjects(DBManagedObject dbmo) throws SQLException{
                
        String query = "SELECT " + dbmo.getColumns() + " FROM " + dbmo.getTableName() + ";";
        
        return ExecuteQuery(query, dbmo);
    }

    private ResultSet ExecuteQuery(String sqlstmt, DBManagedObject dbmo) throws SQLException {
        
        PreparedStatement stmt = conn.prepareStatement(sqlstmt);
        int longitud = stmt.getMaxRows();

        for (int i = 1; i <= longitud; i++) {
            stmt.setString(i, dbmo.toString());
        }
        ResultSet rs = stmt.executeQuery();
        return rs;
    }

    public void closecon() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }
    
    
    public static bdconnection GetSingleton() {

        if (singletoninstance == null) {
            singletoninstance = new bdconnection();
        }
        return singletoninstance;
        
        
        
//hasta acÃ¡.
    }
//la

}

//IP 192.168.230.3

