package java.bean;

import java.database.Database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GistCreate {

    public static void addGist(String name) {
        try {
            Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeQuery("INSERT INTO test_table (name) VALUE ${name}");
        } catch (SQLException e) {
            Logger.getLogger(GistList.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }
}
