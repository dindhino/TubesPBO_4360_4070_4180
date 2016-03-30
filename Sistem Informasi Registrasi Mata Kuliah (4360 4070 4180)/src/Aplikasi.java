
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

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
    public void clrscr() {
        try {
            if (System.getProperty("os.name").startsWith("Window")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException e) {
            for (int i = 0; i < 1000; i++) {
                System.out.println();
            }
        }
    }

    //Scanner input = new Scanner(System.in);
    //Scanner inputid = new Scanner(System.in);
    private int pilihan;
    private String inpnama;
    private String inppass;
    private long inpid;
    private int inptipe;
    private String inpuname;

    public void Registrasi() {
        clrscr();
        try {

            System.out.print("Nama: ");
            inpnama = new java.util.Scanner(System.in).nextLine();

            System.out.println("Tipe: ");
            System.out.println("      1. Dosen");
            System.out.println("      2. Mahasiswa");
            System.out.print("Pilih Tipe: ");
            inptipe = new java.util.Scanner(System.in).nextInt();
            switch (inptipe) {
                case 1:
                    System.out.print("NIP: ");
                    inpid = new java.util.Scanner(System.in).nextLong();
                    inpuname = "DSN" + inpid;
                    System.out.println("Username: " + inpuname);
                    System.out.print("Password: ");
                    inppass = new java.util.Scanner(System.in).nextLine();
                    Dosen a = new Dosen(inpnama, inpid, inppass);
                    daftarDosen.add(a);
                    break;
                case 2:
                    System.out.print("NIM: ");
                    inpid = new java.util.Scanner(System.in).nextLong();
                    inpuname = "MHS" + inpid;
                    System.out.println("Username: " + inpuname);
                    System.out.print("Password: ");
                    inppass = new java.util.Scanner(System.in).nextLine();
                    Mahasiswa b = new Mahasiswa(inpnama, inpid, inppass);
                    daftarMahasiswa.add(b);
                    break;
                default:
                    System.out.println("Inputan Salah");
                    new java.util.Scanner(System.in).nextLine();
                    Registrasi();
                    break;
            }
            clrscr();

            System.out.println("Registrasi Berhasil");
            System.out.println("Username: " + inpuname);
            System.out.println("Password: " + inppass);

            new java.util.Scanner(System.in).nextLine();

        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan");
            new java.util.Scanner(System.in).nextLine();
            Registrasi();
        }
    }

    public Mahasiswa login() {
        String usr, psw;

        System.out.print("Username: ");
        usr = new java.util.Scanner(System.in).nextLine();
        System.out.print("Password: ");
        psw = new java.util.Scanner(System.in).nextLine();

        Mahasiswa cek = null;
        for (Mahasiswa x : daftarMahasiswa) {
            if ((x.getUsername().equals(usr)) && (x.getPassword().equals(psw))) {
                cek = x;
                break;
            } else {
                continue;
            }

        }
        return cek;
    }

    public void mainMenu() {
        //added by dindhino
        clrscr();

        System.out.println("1. Login");
        System.out.println("2. Registrasi");
        System.out.println("3. Exit");
        System.out.print("Pilih Menu: ");

        try {
            pilihan = new java.util.Scanner(System.in).nextInt();
            switch (pilihan) {
                case 1:
                    Mahasiswa login = login();
                    if (login == null) {
                        System.out.println("Data Kosong");
                        new java.util.Scanner(System.in).nextLine();
                        mainMenu();
                        break;
                    } else {
                        if (login.getTipe().equals("Mahasiswa")) {
                            menuSatu();
                            break;
                        }
                        break;
                    }
                case 2:
                    Registrasi();
                    mainMenu();
                    break;
                case 3:
                    exit(0);
                default:
                    System.out.println("Pilihan Salah");
                    System.out.println("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    mainMenu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Inputan Salah");
            new java.util.Scanner(System.in).nextLine();
            mainMenu();
        }
    }

    public void menuSatu() {
        clrscr();
        System.out.println("1. Pilih Kelas");
        System.out.println("2. Exit ");
        System.out.print("Pilih Menu: ");

        try {
            pilihan = new java.util.Scanner(System.in).nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("daftarMahasiswa Kelas");
                    menuDua();
                    break;
                case 2:
                    mainMenu();
                default:
                    System.out.println("Pilihan Salah");
                    System.out.println("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Inputan Salah");
            new java.util.Scanner(System.in).nextLine();
            menuSatu();
        }
    }

    public void menuDua() {
        clrscr();
        System.out.println("1. IF-38-01");
        System.out.println("2. IF-38-02");
        System.out.println("3. IF-38-03");
        System.out.println("4. IF-38-04");
        System.out.println("5. IF-38-05");
        System.out.println("6. Kembali");
        System.out.println("7. Exit");
        System.out.print("Pilih Menu: ");
        try {
            pilihan = new java.util.Scanner(System.in).nextInt();
            if ((pilihan >= 1) && (pilihan <= 5)) {
                System.out.println("daftarMahasiswa Mata Kuliah");
                menuTiga();
            } else if (pilihan == 6) {
                menuSatu();
            } else if (pilihan == 7) {
                mainMenu();
            } else {
                System.out.println("Inputan Salah");
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                new java.util.Scanner(System.in).nextLine();
                menuDua();
            }
        } catch (Exception e) {
            System.out.println("Inputan Salah");
            new java.util.Scanner(System.in).nextLine();
            mainMenu();
        }
    }

    public void menuTiga() {
        clrscr();
        System.out.println("1. Algoritma Struktur Data");
        System.out.println("2. Basis Data Relasional");
        System.out.println("3. Dasar Algoritma Pemograman");
        System.out.println("4. Bahasa Indonesia");
        System.out.println("5. Bahasa Inggris");
        System.out.println("6. Rekayasa Perangkat Lunak");
        System.out.println("7. Kembali");
        System.out.println("8. Exit");
        System.out.print("Pilih Menu: ");
        try {
            pilihan = new java.util.Scanner(System.in).nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Anda Telah Menambahkan Mata Kuliah Algoritma Struktur Data");
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
                case 2:
                    System.out.println("Anda Telah Menambahkan Mata Kuliah Basis Data Relasional");
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
                case 3:
                    System.out.println("Anda Telah Menambahkan Mata Kuliah Dasar Algoritma Pemograman");
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
                case 4:
                    System.out.println("Anda Telah Menambahkan Mata Kuliah Bahasa Indonesia");
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
                case 5:
                    System.out.println("Anda Telah Menambahkan Mata Kuliah Bahasa Inggris");
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
                case 6:
                    System.out.println("Anda Telah Menambahkan Mata Kuliah Basis Data Relasional");
                    new java.util.Scanner(System.in).nextLine();
                    menuSatu();
                    break;
                case 7:
                    menuDua();
                    break;
                case 8:
                    mainMenu();
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Inputan Salah");
            new java.util.Scanner(System.in).nextLine();
            menuTiga();
        }
    }
}
