package TJobsheet10;
import java.util.Scanner;
public class AntrianKRSMenu17 {
    static Scanner sc = new Scanner(System.in);
    static AntrianKRS17 antrianKRS;
    
    public static void main(String[] args) {
        antrianKRS = new AntrianKRS17(10, 30);
        
        int pilihan;
        do {
            tampilMenu();
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            
            prosesMenu(pilihan);
            
        } while (pilihan != 0);
        
        System.out.println("Terima kasih telah menggunakan Sistem Antrian KRS!");
    }
    
    static void tampilMenu() {
        System.out.println("\n====== SISTEM ANTRIAN KRS ======");
        System.out.println("1.  Tambah Mahasiswa ke Antrian");
        System.out.println("2.  Proses KRS (2 Mahasiswa)");
        System.out.println("3.  Tampilkan Semua Antrian");
        System.out.println("4.  Tampilkan 2 Antrian Terdepan");
        System.out.println("5.  Tampilkan Antrian Terakhir");
        System.out.println("6.  Cek Jumlah Antrian");
        System.out.println("7.  Cek Jumlah Yang Sudah Diproses");
        System.out.println("8.  Cek Jumlah Yang Belum Diproses");
        System.out.println("9.  Cek Antrian Kosong");
        System.out.println("10. Cek Antrian Penuh");
        System.out.println("11. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.println("===============================");
    }
    
    static void prosesMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                tambahMahasiswa();
                break;
            case 2:
                antrianKRS.prosesKRS();
                break;
            case 3:
                antrianKRS.tampilan();
                break;
            case 4:
                antrianKRS.tampilkan2Depan();
                break;
            case 5:
                antrianKRS.tampilanTerakhir();
                break;
            case 6:
                System.out.println("Jumlah antrian saat ini: " + antrianKRS.getSize());
                break;
            case 7:
                System.out.println("Jumlah mahasiswa yang sudah diproses: " + antrianKRS.getTotalProses());
                break;
            case 8:
                System.out.println("Jumlah mahasiswa yang belum diproses: " + antrianKRS.hitungBelumProses());
                break;
            case 9:
                if(antrianKRS.isEmpty()) {
                    System.out.println("Antrian kosong!");
                } 
                break;
            case 10:
                if(antrianKRS.isFull()) {
                    System.out.println("Antrian penuh!");
                } 
                break;
            case 11:
                antrianKRS.clear();
                System.out.println("Antrian berhasil dikosongkan!");
                break;
            case 0:
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
    
    static void tambahMahasiswa() {
        if (antrianKRS.isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        }
        
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = sc.nextLine();
        System.out.print("Prodi: ");
        String prodi = sc.nextLine();
        
        Mahasiswa17 mhs = new Mahasiswa17(nim, nama, jurusan, prodi);
        
        if (antrianKRS.enqueue(mhs)) {
            System.out.println("Mahasiswa berhasil ditambahkan ke antrian!");
        } else {
            System.out.println("Gagal menambahkan mahasiswa ke antrian!");
        }
    }
}   