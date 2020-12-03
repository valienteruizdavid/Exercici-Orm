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
    
    public static List<Registre> peliculas = new ArrayList();
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        DataBaseConexion conect = new DataBaseConexion();
        ResultSet resultado = executeQuery(conect,"select * from pelicula");
        peliculasAdd(resultado);
        imprimir();
        
    }
    
    
    public static ResultSet executeQuery(DataBaseConexion dbc, String consulta) throws SQLException{
        Connection c = dbc.conn();
        Statement st = c.createStatement();
        ResultSet resultado = st.executeQuery(consulta);
        return resultado;
    }
    
    public static void peliculasAdd(ResultSet r) throws SQLException{
        while(r.next()){
          peliculas.add(new Registre(r.getInt("idPelicula"), 
                  r.getDouble("duracionPelicula"), r.getBoolean("pelicula3D"), 
                  r.getString("salaCine").charAt(0), r.getString("nombrePelicula"), r.getDate("fechaEstreno")));  
        
        } r.close();
    }
    
    public static void imprimir(){
         for(Iterator i = peliculas.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
    }
        
 }



