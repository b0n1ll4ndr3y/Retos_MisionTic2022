
package modelo_pkg;

/**
 *
 * @author teis_
 */
public class DB_Data {
    private final String Drive = "com.mysql.cj.jdbc.Driver";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/reto6_g43";

    /**
     * @return the Drive
     */
    public String getDrive() {
        return Drive;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    
    
}
