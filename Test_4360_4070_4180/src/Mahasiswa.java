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
        //System.out.println("Pilihan.length: " + Pilihan.length);
        //System.out.println("Jumlah Pilihan: " + JumlahPilihan);
        for (int i = 0; i < JumlahPilihan; i++) {
            if (Pilihan[i] == plhn) {
                //System.out.println("masuk ke if di for");
                Pilihan[i] = null;
                break;
            } else {
                continue;
                //System.out.println("masuk ke else di for");
            }
        }

        int i = 0;

        while ((i < JumlahPilihan) && (Pilihan[i] != null)) {
            i++;
            //System.out.println(i);
        }

        if ((i == (JumlahPilihan)) && (Pilihan[i-1] != null)) {
            //System.out.println("Masuk ke if setelah while");
        } else {
            if ((i == (JumlahPilihan)) && (Pilihan[i-1] == null)) {
                //System.out.println("Masuk ke else if setelah while");
                JumlahPilihan--;
            } else {
                while (i < (JumlahPilihan - 1)) {
                    Pilihan[i] = Pilihan[i + 1];
                    i++;
                }
                //System.out.println("Masuk ke else else setelah while");
                JumlahPilihan--;
            }
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
