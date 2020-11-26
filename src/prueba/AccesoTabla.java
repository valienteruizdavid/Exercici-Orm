package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoTabla {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        
        Class.forName("com.mysql.jdbc.Driver");
        Connection co = DriverManager.getConnection("jdbc:mysql://localhost/supermercado", "root", "");
        Statement st = co.createStatement();
        
        ResultSet resultado = st.executeQuery("SELECT * FROM producto");

        while (resultado.next()) {
            System.out.println("ID=" + resultado.getObject("id")
                    + ", Producto=" + resultado.getObject("nombreProducto")
                    + ", Precio=" + resultado.getObject("precio"));
        }
        resultado.close();

    }

}
