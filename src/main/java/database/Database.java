package java.database;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Database {

    private static Connection conn;

    public static Connection getConnection() {
        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("jdbc/cdek");
            if (conn == null) {
                conn = ds.getConnection();
            }
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
