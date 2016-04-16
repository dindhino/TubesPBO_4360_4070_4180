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
    public void addDosen(Dosen dsn) {
        daftarDosen.add(dsn);
    }

    public Dosen getDosen(long id) {
        Dosen a = new Dosen();
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getNIP() == id) {
                a = daftarDosen.get(i);
            } else {
                continue;
            }
        }

        return a;
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
    public void addMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public Mahasiswa getMahasiswa(long id) {
        Mahasiswa a = new Mahasiswa();
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNIM() == id) {
                a = daftarMahasiswa.get(i);
            } else {
                continue;
            }
        }

        return a;
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