package P1Jobsheet12;
import java.util.Scanner;

public class DLLMain17 {
    public static void main(String[] args) {
        DoubleLinkedList17 list = new DoubleLinkedList17();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa17 mhs1 = inputMahasiswa(scan);
                    list.addFirst(mhs1);
                    break;
                case 2:
                    Mahasiswa17 mhs2 = inputMahasiswa(scan);
                    list.addLast(mhs2);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                // case 6:
                  //  System.out.print("Masukkan NIM yang dicari: ");
                  //  String nim = scan.nextLine();
                  //  Node17 found = list.search(nim);
                  //  if (found != null) {
                      //  System.out.println("Data ditemukan:");
                      //  found.data.Tampil();
                  //  } else {
                      //  System.out.println("Data tidak ditemukan.");
                  //  }
                  //  break; 
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa17 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 

        return new Mahasiswa17(nim, nama, kelas, ipk);
    }
}
