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

import Database.Database;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dininuraini, dindhino
 */
public class Aplikasi {

    private ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    private ArrayList<Kelas> daftarKelas = new ArrayList<Kelas>();
    private ArrayList<Matakuliah> daftarMatakuliah = new ArrayList<Matakuliah>();
    Database con = new Database();

    public Aplikasi() {
        con.connect();
    }
    
    

    /*======================================================== DOSEN ========================================================*/
    public void addDosen(String nama, long nip, String password) {
        Dosen d = new Dosen(nama, nip, password);
        daftarDosen.add(d);
        con.saveDosen(d);
    }
    
    //sama dibikin 2 biar gak bentrok dan tidak mengubah kodingan sebelumnya
    public void addDosen(String nama, long nip, String password,String status) {
        Dosen d = new Dosen(nama, nip, password,status);
        daftarDosen.add(d);
        con.saveDosen(d);
    }

    public Dosen getDosen(long id) {
        for (Dosen d : daftarDosen) {
            if (d.getNIP() == id) {
                return d;
            }
        }
        Dosen d = con.getDosen(id);
        daftarDosen.add(d);
        return d;
    }
    
    public Dosen getDosenByUsrnm(String unm) {
        for (Dosen d : daftarDosen) {
            if (d.getUsername().equals(unm)) {
                return d;
            }
        }
        Dosen d = con.getDosenByUsrnm(unm);
        daftarDosen.add(d);
        return d;
    }

    public void deleteDosen(long id) {
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getNIP() == id) {
                daftarDosen.remove(daftarDosen.get(i));
            } else {
                continue;
            }
        }
    }

    /*=======================================================================================================================*/

 /*======================================================= MAHASISWA =====================================================*/
    public void addMahasiswa(String nama, long nip, String password) {
        Mahasiswa m = new Mahasiswa(nama, nip, password);
        daftarMahasiswa.add(m);
        con.saveMahasiswa(m);
    }

    public Mahasiswa getMahasiswa(long id) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNIM() == id) {
                return m;
            }
        }
        Mahasiswa m = con.getMahasiswa(id);
        daftarMahasiswa.add(m);
        return m;
    }
    
    public Mahasiswa getMahasiswaByUsrnm(String unm) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getUsername().equals(unm)) {
                return m;
            }
        }
        Mahasiswa m = con.getMahasiswaByUsrnm(unm);
        daftarMahasiswa.add(m);
        return m;
    }

    public void deleteMahasiswa(long id) {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNIM() == id) {
                daftarMahasiswa.remove(daftarMahasiswa.get(i));
            } else {
                continue;
            }
        }
    }

    /*=======================================================================================================================*/

 /*========================================================= KELAS =======================================================*/
    public void addKelas(Kelas kls) {
        daftarKelas.add(kls);
    }

    public Kelas getKelas(String id) {
        Kelas a = new Kelas();
        for (int i = 0; i < daftarKelas.size(); i++) {
            if (daftarKelas.get(i).getNamaKelas() == id) {
                a = daftarKelas.get(i);
            } else {
                continue;
            }
        }

        return a;
    }

    public void deleteKelas(String id) {
        for (int i = 0; i < daftarKelas.size(); i++) {
            if (daftarKelas.get(i).getNamaKelas() == id) {
                daftarKelas.remove(daftarKelas.get(i));
            } else {
                continue;
            }
        }
    }

    /*=======================================================================================================================*/

 /*======================================================= MATAKULIAH ======================================================*/
    public void addMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public Matakuliah getMatakuliah(String id) {
        Matakuliah a = new Matakuliah();
        for (int i = 0; i < daftarMatakuliah.size(); i++) {
            if (daftarMatakuliah.get(i).getKodeMK() == id) {
                a = daftarMatakuliah.get(i);
            } else {
                continue;
            }
        }

        return a;
    }

    public void deleteMatakuliah(String id) {
        for (int i = 0; i < daftarMatakuliah.size(); i++) {
            if (daftarMatakuliah.get(i).getKodeMK() == id) {
                daftarMatakuliah.remove(daftarMatakuliah.get(i));
            } else {
                continue;
            }
        }
    }

    /*=======================================================================================================================*/


}