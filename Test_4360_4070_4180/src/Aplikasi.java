import static java.lang.System.exit;
import java.util.Scanner;

public class Aplikasi {
    private Dosen[] daftarDosen;
    private Mahasiswa[] daftarMahasiswa;
    private Kelas daftarKelas;
    private Matakuliah[] daftarMatakuliah;
    private int jmlMhs=0;
    private int jmlDosen=0;
    private int jmlMK=0;
    
    public void addDosen(Dosen dd){
        daftarDosen=new Dosen[100];
        this.daftarDosen[jmlDosen]=dd;
        this.jmlDosen++;
    }
    
    public void addMahasiswa (Mahasiswa dm){
        daftarMahasiswa=new Mahasiswa[100];
        this.daftarMahasiswa[jmlMhs]=dm;
        this.jmlMhs++;
    }
    
    public void addMatakuliah (Mahasiswa dmk){
        daftarMahasiswa=new Mahasiswa[100];
        this.daftarMahasiswa[jmlMK]=dmk;
        this.jmlMK++;
    }
    
    public Mahasiswa[] getMahasiswa(long ID){
        return daftarMahasiswa;
    }
    
    public void deleteMahasiswa(long ID){
        jmlMhs--;
    }

    Scanner input = new Scanner(System.in);
    private int pilihan;
    
    public void menuSatu(){
        System.out.println("1. Pilih Kelas");
        System.out.println("2. Exit ");
        pilihan=input.nextInt();
        if (pilihan==1) {
            System.out.println("Pilihan Kelas");
            menuDua();
        }
        else if(pilihan==2){
            exit(0);
        }
        else {}
    }
      
    public void menuDua(){
        System.out.println("1. IF-38-01");
        System.out.println("2. IF-38-02");
        System.out.println("3. IF-38-03");
        System.out.println("4. IF-38-04");
        System.out.println("5. IF-38-05");
        System.out.println("6. Kembali");
        System.out.println("7. Exit");
        pilihan=input.nextInt();
        if ((pilihan>=1)&&(pilihan<=5)){
            System.out.println("Pilihan Mata Kuliah");
            menuTiga();
        }
        else if (pilihan==6){
            menuSatu();
        }
        else if (pilihan==7){
            exit(0);
        }
        else{}
    }   
        
    public void menuTiga(){
        System.out.println("1. Algoritma Struktur Data");
        System.out.println("2. Basis Data Relasional");
        System.out.println("3. Dasar Algoritma Pemograman");
        System.out.println("4. Bahasa Indonesia");
        System.out.println("5. Bahasa Inggris");
        System.out.println("6. Rekayasa Perangkat Lunak");
        System.out.println("7. Kembali");
        System.out.println("8. Exit");
        pilihan=input.nextInt();
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
    
