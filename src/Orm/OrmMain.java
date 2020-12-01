/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

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
       
        List<Registre> peliculas = new ArrayList();
        DataBaseConexion conect = new DataBaseConexion();
        Connection co = conect.conn();
        Statement st = co.createStatement();
        ResultSet resultado = st.executeQuery("SELECT * FROM pelicula");
        
        
        while(resultado.next()){
          peliculas.add(new Registre(resultado.getInt("idPelicula"), 
                  resultado.getDouble("duracionPelicula"), resultado.getBoolean("pelicula3D"), 
                  resultado.getString("salaCine").charAt(0), resultado.getString("nombrePelicula"), resultado.getDate("fechaEstreno")));  
        
        } resultado.close();
        
        for(Iterator i = peliculas.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
        
    }
        
 }



