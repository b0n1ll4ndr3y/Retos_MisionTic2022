
package modelo_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author teis_
 */
public class conexion {
    Connection connection;

    public conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto6_g43", "root", "");
            if (connection != null) {
                System.out.println("Conexión exitosa!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la Conexión!");
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
