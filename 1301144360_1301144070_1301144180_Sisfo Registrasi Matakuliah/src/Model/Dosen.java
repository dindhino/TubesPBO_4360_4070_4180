/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dindhino
 */
public class Dosen extends Orang {

    private long NIP;
    private String Username;
    private String Password;
    private String Status;

    public Dosen(String Nama, long NIP, String Password) {
        this.setName(Nama);
        this.NIP = NIP;
        this.Username = "DSN" + NIP;
        this.Password = Password;
        this.setTipe("Dosen");
    }
    
    //buat 2 biar gak error dan menggangu kodingan sebelumnya
    public Dosen(String Nama, long NIP, String Password,String Status) {
        this.setName(Nama);
        this.NIP = NIP;
        this.Username = "DSN" + NIP;
        this.Password = Password;
        this.Status = Status;
        this.setTipe("Dosen");
    }
    
    public Dosen(long NIP, String Nama) {
        this.setName(Nama);
        this.NIP = NIP;
        this.Username = "DSN" + NIP;
        this.setTipe("Dosen");
    }

    public Dosen() {
        this.setTipe("Dosen");
    }

    public long getNIP() {
        return NIP;
    }

    public void setNIP(long NIP) {
        this.NIP = NIP;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}
