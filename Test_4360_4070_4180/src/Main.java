/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dindhino
 */
public class Main {
    public static void main (String[] args) {
        Dosen d = new Dosen();
        d.setName("Dindin");
        d.setTipe("Dosen");
        
        Matakuliah m = new Matakuliah();
        m.setNamaMK("PBO");
        
        Matakuliah x = new Matakuliah();
        x.setNamaMK("DAP");
        
        Matakuliah y = new Matakuliah();
        y.setNamaMK("ASD");
        
        Matakuliah z = new Matakuliah();
        z.setNamaMK("BDR");
        
        Kelas k = new Kelas();
        k.setMataKuliah(m);
        k.setDosen(d);
        
        Kelas l = new Kelas();
        l.setMataKuliah(x);
        l.setDosen(d);
        
        Kelas p = new Kelas();
        p.setMataKuliah(y);
        p.setDosen(d);
        
        Kelas q = new Kelas();
        q.setMataKuliah(z);
        q.setDosen(d);
        
        Mahasiswa n = new Mahasiswa();
        n.setName("Dhino");
        n.setTipe("Mahasiswa");
        n.setMaxPilihan(4);
        
        
        System.out.println("Mahasiswa : " + n.getName());
        System.out.println("");
        System.out.println("    ---- ADD 4 PILIHAN ----");
        
        n.addPilihan(k);
        n.addPilihan(l);
        n.addPilihan(p);
        n.addPilihan(q);

        for (int a=0; a<n.getJumlahPilihan(); a++) {
            System.out.println("    Pilihan Ke-" + (a+1) + " : "+ n.getPilihan(a).getMataKuliah().getNamaMK());
            System.out.println("        Dosen : " + n.getPilihan(a).getDosen().getName());
        }
        
        System.out.println("");
        System.out.println("    ---- REMOVE 1 PILIHAN ----");
        
        n.removePilihan(q);
        
        for (int a=0; a<n.getJumlahPilihan(); a++) {
            System.out.println("    Pilihan Ke-" + (a+1) + " : "+ n.getPilihan(a).getMataKuliah().getNamaMK());
            System.out.println("        Dosen : " + n.getPilihan(a).getDosen().getName());
        }
        
        System.out.println("");
        System.out.println("    ---- CEK ERROR ----");
        
        n.removePilihan(q);
        
        for (int a=0; a<n.getJumlahPilihan(); a++) {
            System.out.println("    Pilihan Ke-" + (a+1) + " : "+ n.getPilihan(a).getMataKuliah().getNamaMK());
            System.out.println("        Dosen : " + n.getPilihan(a).getDosen().getName());
        }
    }
    
}
