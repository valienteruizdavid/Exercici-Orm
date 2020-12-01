

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Registre {
    
    private String consulta;
    private String campo;
    private String url;
    private String nombre;
    
    public Registre(String consulta, String campo, String url, String nombre) {
        this.consulta = consulta;
        this.campo = campo;
        this.url = url;
        this.nombre = nombre;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void campos() throws SQLException{
        Connection co = DriverManager.getConnection(this.url);
        Statement st = co.createStatement();
        
        ResultSet resultado = st.executeQuery(this.consulta);
        
        while (resultado.next()) {
            System.out.println("ID: " + resultado.getObject(this.campo)
                    + ", Duracion: " + resultado.getObject(this.campo)
                    + ", Está en 3D: " + resultado.getObject(this.campo)
                    + ", Sala: " + resultado.getObject(this.campo)
                    + ", Nombre de la película: " + resultado.getObject(this.campo)
                    + ", Fecha de estreno: " + resultado.getObject(this.campo));
        }
        resultado.close();
    }

    @Override
    public String toString() {
        return "Registre{" + "consulta=" + consulta + ", campo=" + campo + ", url=" + url + ", nombre=" + nombre + '}';
    }
    
    
}
