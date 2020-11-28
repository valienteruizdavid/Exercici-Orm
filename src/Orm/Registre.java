package Orm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Registre {
    
    private String consulta;
    private String database;
    private String user;
    private String password;

    public Registre(String consulta, String database, String user, String password) {
        this.consulta = consulta;
        this.database = database;
        this.user = user;
        this.password = password;
    }
    

    

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public void campos() throws SQLException{
        Connection co = DriverManager.getConnection(this.database,this.user,this.password);
        Statement st = co.createStatement();
        
        ResultSet resultado = st.executeQuery(this.consulta);
        ResultSetMetaData rsmd = resultado.getMetaData();
        int columnas = rsmd.getColumnCount();
        while (resultado.next()) {
            for(int i = 1; i<columnas+1;i++){
               System.out.print(resultado.getObject(i)+", ");
            }
            
        }
        resultado.close();
    }

       
    
}
