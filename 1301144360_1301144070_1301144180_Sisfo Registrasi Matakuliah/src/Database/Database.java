/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Dosen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author dindhino
 */
public class Database {

    private String server = "jdbc:mysql://localhost:3306/tubes", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void saveDosen(Dosen d) {
        try {
            String query = "INSERT INTO `dosen`(`nama`, `tipe`, `nip`,`username`,`password`) VALUES ("
                    + "'" + d.getName() + "',"
                    + "'" + d.getTipe() + "',"
                    + "'" + d.getNIP() + "',"
                    + "'" + d.getUsername() + "',"
                    + "'" + d.getPassword() + "')";
            ResultSet rs = st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Dosen getDosen(int nip) {
        Dosen d = null;
        try {
            String query = "SELECT * FROM `dosen` WHERE `nip` = " + nip;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                d = new Dosen(rs.getLong(3), rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return d;
    }

    public String[] getListNIPDosen() {
        ArrayList<String> listId = new ArrayList<>();
        try {
            String query = "SELECT nip FROM `dosen`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listId.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listId.toArray(new String[0]);
    }
}
