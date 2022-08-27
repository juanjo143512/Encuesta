/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jalvarez
 */
public class Conexion {
    
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://802ALVAREZOC2\\SQLEXPRESS:1433;"
                + "database=encuesta;"
                + "user=sa;"
                + "password=Enero1435$";
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
    }
}
