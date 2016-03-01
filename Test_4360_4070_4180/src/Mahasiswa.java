/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dindhino
 */
public class Mahasiswa {
    private long NIM;
    private String Username;
    private String Password;
    private String cekPassword;
    private Kelas[] Pilihan;
    private int JumlahPilihan;

    public long getNIM() {
        return NIM;
    }

    public void setNIM(long NIM) {
        this.NIM = NIM;
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

    public String getCekPassword() {
        return cekPassword;
    }

    public void setCekPassword(String cekPassword) {
        this.cekPassword = cekPassword;
    }

    public Kelas getPilihan(int i) {
        return Pilihan[i];
    }

    public void setPilihan(Kelas plhn) {
        if (JumlahPilihan < Pilihan.length) {
            Pilihan[JumlahPilihan] = plhn;
            JumlahPilihan++;
        }
        else
        {
            System.out.println("Pilihan Sudah Penuh");
        }
    }

    public Kelas[] getPilihan() {
        return Pilihan;
    }

    public void setPilihan(Kelas[] Pilihan) {
        this.Pilihan = Pilihan;
    }

    public int getJumlahPilihan() {
        return JumlahPilihan;
    }

    public void setJumlahPilihan(int JumlahPilihan) {
        this.JumlahPilihan = JumlahPilihan;
    }  
    
}
