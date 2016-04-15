/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Dosen;
import Model.Kelas;
import Model.Mahasiswa;
import Model.Matakuliah;

/**
 *
 * @author dindhino
 */

public class SimulasiAwal {

    public static void main(String[] args) {
        Dosen d = new Dosen(123, "Dindin");

        Matakuliah m = new Matakuliah("PBO", "PBO");
        // m.addDosenPengampu(d);

        Matakuliah x = new Matakuliah("DAP", "DAP");
        x.addDosenPengampu(d);

        Matakuliah y = new Matakuliah("ASD", "ASD");
        y.addDosenPengampu(d);

        Matakuliah z = new Matakuliah("BDR", "BDR");
        z.addDosenPengampu(d);

        Kelas k = new Kelas("IF-38-1");
        k.addMatakuliah(m);
        k.addMatakuliah(x);
        k.addMatakuliah(y);
        k.addMatakuliah(z);

        Kelas l = new Kelas("IF-38-2");
        l.addMatakuliah(m);
        l.addMatakuliah(x);
        l.addMatakuliah(y);
        l.addMatakuliah(z);

        Kelas p = new Kelas("IF-38-3");
        p.addMatakuliah(m);
        p.addMatakuliah(x);
        p.addMatakuliah(y);
        p.addMatakuliah(z);

        Kelas q = new Kelas("IF-38-4");
        q.addMatakuliah(m);
        q.addMatakuliah(x);
        q.addMatakuliah(y);
        q.addMatakuliah(z);

        Mahasiswa n = new Mahasiswa(456, "Dhino");

        System.out.println("Mahasiswa : " + n.getName());
        System.out.println("");
        System.out.println("    ---- ADD 4 PILIHAN ----");

        n.addPilihan(k);

        n.addPilihan(l);

        n.addPilihan(p);

        n.addPilihan(q);

        n.getPilihanKelas();

        System.out.println("");

        System.out.println("");
        System.out.println("    ---- REMOVE 1 PILIHAN ----");

        n.removePilihan(q);

        n.getPilihanKelas();

        System.out.println("");

        System.out.println("");
        System.out.println("    ---- CEK ERROR ----");

        n.removePilihan(q);

        n.getPilihanKelas();
    }

}

