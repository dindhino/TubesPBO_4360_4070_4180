/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author dindhino
 */
public class Matakuliah {

    private String kodeMK;
    private String namaMK;
    private ArrayList<Dosen> dosenPengampu = new ArrayList<Dosen>();

    public Matakuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }

    public Matakuliah() {

    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public void addDosenPengampu(Dosen dsnpgm) {
        dosenPengampu.add(dsnpgm);
    }

    public void removeDosenPengampu(Dosen dsnpgm) {
        dosenPengampu.remove(dsnpgm);
    }

    public ArrayList<Dosen> getDosenPengampu() {
        return dosenPengampu;
    }

    public void getDosenPengampuNama() {
        for (int i = 0; i < dosenPengampu.size(); i++) {
            System.out.print(dosenPengampu.get(i).getName());
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return namaMK;
    }

}
