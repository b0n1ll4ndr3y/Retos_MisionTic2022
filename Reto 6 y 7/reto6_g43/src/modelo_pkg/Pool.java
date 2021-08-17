
package modelo_pkg;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author teis_
 */
public class Pool {
    private final String DB = "reto6_g43";
    private final String URL = "jdbc:mysql://localhost:3306/" + DB;
    private final String USER = "root";
    private final String PASS = "";

    public DataSource initilizeDataSource() {
        BasicDataSource inst_basicDataSource = new BasicDataSource();
        inst_basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        inst_basicDataSource.setUrl(URL);
        inst_basicDataSource.setUsername(USER);
        inst_basicDataSource.setPassword(PASS);
        inst_basicDataSource.setMaxActive(50);
        return inst_basicDataSource;
        //return (DataSource) inst_basicDataSource;
    }

}
