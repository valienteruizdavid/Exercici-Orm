/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * En aquesta secció cal accedir a una taula de MySQL amb un camp de cada tipus:
 * 
 * int o long, double o float, boolean, char, String i java.sql.Date
 * 
 * Recòrrer el result set i mostrar-lo per la consola com a instancies de la 
 * classe Registre, que tindrà l'estructura de la teva taula.
 * 
 * @author dvali
 */
public class OrmMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection co = DriverManager.getConnection("jdbc:mysql://localhost/cine", "root", "");
//        Statement st = co.createStatement();
//        
//        ResultSet resultado = st.executeQuery("SELECT * FROM pelicula");
//
//        while (resultado.next()) {
//            System.out.println("ID: " + resultado.getObject("idPelicula")
//                    + ", Duracion: " + resultado.getObject("duracionPelicula")
//                    + ", Está en 3D: " + resultado.getObject("pelicula3D")
//                    + ", Sala: " + resultado.getObject("salaCine")
//                    + ", Nombre de la película: " + resultado.getObject("nombrePelicula")
//                    + ", Fecha de estreno: " + resultado.getObject("fechaEstreno"));
//        }
//        resultado.close();

          Registre r = new Registre("select * from pelicula","jdbc:mysql://localhost/cine" , "root", "");
          r.campos();
          
    }
        
 }



