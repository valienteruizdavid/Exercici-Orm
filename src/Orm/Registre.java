package Orm;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Registre {
    
   protected int idPelicula;
   private double duracionPelicula;
   private boolean pelicula3D;
   private char salaCine;
   private String nombrePelicula;
   private Date fechaEstreno;

    public Registre(int idPelicula, double duracionPelicula, boolean pelicula3D, char salaCine, String nombrePelicula, Date fechaEstreno) {
        this.idPelicula = idPelicula;
        this.duracionPelicula = duracionPelicula;
        this.pelicula3D = pelicula3D;
        this.salaCine = salaCine;
        this.nombrePelicula = nombrePelicula;
        this.fechaEstreno = fechaEstreno;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public boolean isPelicula3D() {
        return pelicula3D;
    }

    public void setPelicula3D(boolean pelicula3D) {
        this.pelicula3D = pelicula3D;
    }

    public char getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(char salaCine) {
        this.salaCine = salaCine;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    @Override
    public String toString() {
        return "Registre{" + "idPelicula=" + idPelicula + ", duracionPelicula=" + duracionPelicula + 
                ", pelicula3D=" + pelicula3D + ", salaCine=" + salaCine + ", nombrePelicula=" + nombrePelicula + 
                ", fechaEstreno=" + fechaEstreno + '}';
    }
   
   
    

    

    

       
    
}
