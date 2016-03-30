
import java.util.ArrayList;

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
    private ArrayList<Kelas> Pilihan = new ArrayList<Kelas>();

    public Mahasiswa(String Nama, long NIM, String Password) {
        this.setName(Nama);
        this.NIM = NIM;
        this.Username = "MHS" + NIM;
        this.Password = Password;
        this.setTipe("Mahasiswa");
    }

    public Mahasiswa(long NIM, String Nama) {
        this.NIM = NIM;
        this.Username = "MHS" + NIM;
        this.setName(Nama);
        this.setTipe("Mahasiswa");
    }

    public Mahasiswa() {
        this.setTipe("Mahasiswa");
    }

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

    public void addPilihan(Kelas plhn) {
        Pilihan.add(plhn);
    }

    public void removePilihan(Kelas plhn) {
        Pilihan.remove(plhn);
    }

    public void getPilihanKelas() {
        for (int i = 0; i < Pilihan.size(); i++) {
            System.out.print("Kelas: ");
            System.out.println(Pilihan.get(i).getNamaKelas());
            Pilihan.get(i).getMatakuliah();
            System.out.println("");
        }
    }
}
