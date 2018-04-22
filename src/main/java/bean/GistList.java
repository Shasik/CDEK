package bean;

import database.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GistList {


    private ArrayList<Gist> getGists(String sql) {
        ArrayList<Gist> gistList = new ArrayList<>();
        try {
            Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Gist gist = new Gist();
                gist.setName(rs.getString("name"));
                gist.setId(rs.getString("id"));
                gistList.add(gist);
            }
        } catch (SQLException e) {
            Logger.getLogger(GistList.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
        return gistList;
    }

    public ArrayList<Gist> getGistList() {
        String sql = "SELECT * FROM test_table";
        return getGists(sql);
    }

    public ArrayList<Gist> getGistListBySearch(String search_string) {
        String sql = "SELECT * FROM test_table WHERE name like '%" + search_string + "%';";
        return getGists(sql);
    }
}
