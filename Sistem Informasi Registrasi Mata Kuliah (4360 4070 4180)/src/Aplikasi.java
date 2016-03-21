/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dininuraini, dindhino
 */
import static java.lang.System.exit;
import java.util.Scanner;

public class Aplikasi {

    private Dosen[] daftarDosen;
    private Mahasiswa[] daftarMahasiswa;
    private Kelas daftarKelas;
    private Matakuliah[] daftarMatakuliah;
    private int jmlMhs = 0;
    private int jmlDosen = 0;
    private int jmlMK = 0;

    public void addDosen(Dosen dd) {
        //edited by dindhino
        daftarDosen = new Dosen[100];
        if (jmlDosen < daftarDosen.length) {
            this.daftarDosen[jmlDosen] = dd;
            this.jmlDosen++;
        } else {
            System.out.println("Dosen Penuh");
        }

    }

    public void addMahasiswa(Mahasiswa dm) {
        //edited by dindhino
        daftarMahasiswa = new Mahasiswa[100];
        if (jmlMhs < daftarMahasiswa.length) {
            this.daftarMahasiswa[jmlMhs] = dm;
            this.jmlMhs++;
        } else {
            System.out.println("Mahasiswa Penuh");
        }
    }

    public void addMatakuliah(Mahasiswa dmk) {
        //edited by dindhino
        daftarMahasiswa = new Mahasiswa[100];
        if (jmlMK < daftarMatakuliah.length) {
            this.daftarMahasiswa[jmlMK] = dmk;
            this.jmlMK++;
        } else {
            System.out.println("Mata Kuliah Penuh");
        }
    }

    public Mahasiswa getMahasiswa(long ID) {
        //edited by dindhino
        //return daftarMahasiswa;
        Mahasiswa a = new Mahasiswa();
        for (int i = 0; i < jmlMhs; i++) {
            if (daftarMahasiswa[i].getNIM() == ID) {
                a = daftarMahasiswa[i];
            } else {
                continue;
            }
        }
        return a;
    }

    public void deleteMahasiswa(Mahasiswa ID) {
        //edited by dindhino
        //jmlMhs--;
        for (int i = 0; i < jmlMhs; i++) {
            if (daftarMahasiswa[i] == ID) {
                daftarMahasiswa[i] = null;
                break;
            } else {
                continue;
            }
        }

        int i = 0;

        while ((i < jmlMhs) && (daftarMahasiswa[i] != null)) {
            i++;
        }

        if ((i == (jmlMhs)) && (daftarMahasiswa[i - 1] != null)) {
        } else if ((i == (jmlMhs)) && (daftarMahasiswa[i - 1] == null)) {
            jmlMhs--;
        } else {
            while (i < (jmlMhs - 1)) {
                daftarMahasiswa[i] = daftarMahasiswa[i + 1];
                i++;
            }
            jmlMhs--;
        }
    }

    /*=======================================================================================================================================*/
    //added by dindhino
    public Kelas getDaftarKelas() {
        return daftarKelas;
    }

    public void setDaftarKelas(Kelas daftarKelas) {
        this.daftarKelas = daftarKelas;
    }

    public int getJmlMhs() {
        return jmlMhs;
    }

    public void setJmlMhs(int jmlMhs) {
        this.jmlMhs = jmlMhs;
    }

    public int getJmlDosen() {
        return jmlDosen;
    }

    public void setJmlDosen(int jmlDosen) {
        this.jmlDosen = jmlDosen;
    }

    public int getJmlMK() {
        return jmlMK;
    }

    public void setJmlMK(int jmlMK) {
        this.jmlMK = jmlMK;
    }

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

    /*=============================================================================================================================*/
    Scanner input = new Scanner(System.in);
    private int pilihan;

    public void menuLuar() {
        //added by dindhino
        System.out.println("1. Login");
        System.out.println("2. Registrasi");
        System.out.println("3. Exit");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Asumsi: Sudah Login");
                System.out.println("Press Any Key To Continue...");
                input.nextLine();
                input.nextLine();
                menuSatu();
                break;
            case 2:
                System.out.println("Maintenance");
                System.out.println("Press Any Key To Continue...");
                input.nextLine();
                input.nextLine();
                menuLuar();
                break;
            case 3:
                exit(0);
            default:
                System.out.println("Pilihan Salah");
                System.out.println("Press Any Key To Continue...");
                input.nextLine();
                input.nextLine();
                menuLuar();
                break;
        }

    }

    public void menuSatu() {
        System.out.println("1. Pilih Kelas");
        System.out.println("2. Exit ");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("daftarMahasiswa Kelas");
                menuDua();
                break;
            case 2:
                exit(0);
            default:
                System.out.println("Pilihan Salah");
                System.out.println("Press Any Key To Continue...");
                input.nextLine();
                input.nextLine();
                menuSatu();
                break;
        }
    }

    public void menuDua() {
        System.out.println("1. IF-38-01");
        System.out.println("2. IF-38-02");
        System.out.println("3. IF-38-03");
        System.out.println("4. IF-38-04");
        System.out.println("5. IF-38-05");
        System.out.println("6. Kembali");
        System.out.println("7. Exit");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextInt();
        if ((pilihan >= 1) && (pilihan <= 5)) {
            System.out.println("daftarMahasiswa Mata Kuliah");
            menuTiga();
        } else if (pilihan == 6) {
            menuSatu();
        } else if (pilihan == 7) {
            exit(0);
        } else {
            System.out.println("Inputan Salah");
            System.out.println("Press Any Key To Continue...");
            input.nextLine();
            input.nextLine();
            menuDua();
        }
    }

    public void menuTiga() {
        System.out.println("1. Algoritma Struktur Data");
        System.out.println("2. Basis Data Relasional");
        System.out.println("3. Dasar Algoritma Pemograman");
        System.out.println("4. Bahasa Indonesia");
        System.out.println("5. Bahasa Inggris");
        System.out.println("6. Rekayasa Perangkat Lunak");
        System.out.println("7. Kembali");
        System.out.println("8. Exit");
        System.out.print("Pilih Menu: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Anda Telah Menambahkan Mata Kuliah Algoritma Struktur Data");
                break;
            case 2:
                System.out.println("Anda Telah Menambahkan Mata Kuliah Basis Data Relasional");
                break;
            case 3:
                System.out.println("Anda Telah Menambahkan Mata Kuliah Dasar Algoritma Pemograman");
                break;
            case 4:
                System.out.println("Anda Telah Menambahkan Mata Kuliah Bahasa Indonesia");
                break;
            case 5:
                System.out.println("Anda Telah Menambahkan Mata Kuliah Bahasa Inggris");
                break;
            case 6:
                System.out.println("Anda Telah Menambahkan Mata Kuliah Basis Data Relasional");
                break;
            case 7:
                menuDua();
                break;
            case 8:
                exit(0);
            default:
                break;
        }
    }
}
