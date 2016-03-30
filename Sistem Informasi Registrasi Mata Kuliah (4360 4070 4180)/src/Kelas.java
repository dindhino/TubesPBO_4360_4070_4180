
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
public class Kelas {

    private ArrayList<Matakuliah> mataKuliah = new ArrayList<Matakuliah>();
    private ArrayList<Dosen> dosen = new ArrayList<Dosen>();
    private String NamaKelas;

    public Kelas() {
    }

    public Kelas(String NamaKelas) {
        this.NamaKelas = NamaKelas;
    }

    public String getNamaKelas() {
        return NamaKelas;
    }

    public void setNamaKelas(String NamaKelas) {
        this.NamaKelas = NamaKelas;
    }

    public void addDosen(Dosen newdosen) {
        dosen.add(newdosen);
    }

    public void addMatakuliah(Matakuliah newmk) {
        mataKuliah.add(newmk);
    }

    public void removeDosen(Dosen newdosen) {
        dosen.remove(newdosen);
    }

    public void removeMatakuliah(Matakuliah newmk) {
        mataKuliah.remove(newmk);
    }

    public ArrayList<Matakuliah> getMataKuliah() {
        return mataKuliah;
    }

    public void getMatakuliah() {
        for (int i = 0; i < mataKuliah.size(); i++) {
            System.out.print("  Matakuliah: ");
            System.out.println(mataKuliah.get(i).getNamaMK());
            System.out.print("    Dosen: ");
            mataKuliah.get(i).getDosenPengampu();
            System.out.println("");
        }
    }

    public void getDosen() {
        for (int i = 0; i < dosen.size(); i++) {
            System.out.print(dosen.get(i).getName());
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return NamaKelas;
    }
}
