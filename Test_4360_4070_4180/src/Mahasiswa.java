/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dindhino
 */
public class Mahasiswa extends Orang {

    private long NIM;
    private String Username;
    private String Password;
    private String cekPassword;
    private Kelas[] Pilihan;
    private int JumlahPilihan;
    private int MaxPilihan;

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

    public int getMaxPilihan() {
        return MaxPilihan;
    }

    public void setMaxPilihan(int MaxPilihan) {
        this.MaxPilihan = MaxPilihan;
        Pilihan = new Kelas[MaxPilihan];
    }

    public Kelas getPilihan(int i) {
        return Pilihan[i];
    }

    public void addPilihan(Kelas plhn) {
        if (JumlahPilihan < Pilihan.length) {
            Pilihan[JumlahPilihan] = plhn;
            JumlahPilihan++;
        } else {
            System.out.println("Pilihan Sudah Penuh");
        }
    }

    public void removePilihan(Kelas plhn) {
        for (int i = 0; i < Pilihan.length; i++) {
            if (Pilihan[i] == plhn) {
                Pilihan[i] = null;
            }
        }
        int i = 0;
        while ((i < Pilihan.length) && (Pilihan[i] != null)) {
            i++;
        }
        if (i == (Pilihan.length - 1)) {
            JumlahPilihan--;
        } else {
            while (i < (Pilihan.length - 1))  {
                Pilihan[i] = Pilihan[i + 1];
                i++;
            }
            JumlahPilihan--;
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
