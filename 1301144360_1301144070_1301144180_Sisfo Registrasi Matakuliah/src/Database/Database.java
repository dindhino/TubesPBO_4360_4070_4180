/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Dosen;
import Model.Mahasiswa;
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

    private String server = "jdbc:mysql://localhost:3306/tubespbo", dbuser = "root", dbpass = "";
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

    public Dosen getDosen(long nip) {
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
    
    public Dosen getDosenByUsrnm(String usnm) {
        Dosen d = null;
        try {
            String query = "SELECT * FROM `dosen` WHERE `username` = " + "'" + usnm + "'";
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
    
    
    public void saveMahasiswa(Mahasiswa m) {
        try {
            String query = "INSERT INTO `mahasiswa`(`nama`, `tipe`, `nim`,`username`,`password`) VALUES ("
                    + "'" + m.getName() + "',"
                    + "'" + m.getTipe() + "',"
                    + "'" + m.getNIM() + "',"
                    + "'" + m.getUsername() + "',"
                    + "'" + m.getPassword() + "')";
            ResultSet rs = st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Mahasiswa getMahasiswa(long nim) {
        Mahasiswa m = null;
        try {
            String query = "SELECT * FROM `mahasiswa` WHERE `nim` = " + nim;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                m = new Mahasiswa(rs.getLong(3), rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return m;
    }
    
    public Mahasiswa getMahasiswaByUsrnm(String usrnm) {
        Mahasiswa m = null;
        try {
            String query = "SELECT * FROM `mahasiswa` WHERE `username` = " + "'" + usrnm + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                m = new Mahasiswa(rs.getLong(3), rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return m;
    }

    public String[] getListNIMMahasiswa() {
        ArrayList<String> listId = new ArrayList<>();
        try {
            String query = "SELECT nim FROM `mahasiswa`";
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
