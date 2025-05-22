package Jobsheet12;
import java.util.Scanner;

public class DLLMain17 {
    public static void main(String[] args) {
        DoubleLinkedList17 list = new DoubleLinkedList17();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1.  Tambah di awal");
            System.out.println("2.  Tambah di akhir");
            System.out.println("3.  Hapus dari awal");
            System.out.println("4.  Hapus dari akhir");
            System.out.println("5.  Tampilkan data");
            System.out.println("6.  Sisipkan data setelah NIM tertentu");
            System.out.println("7.  Cari Mahasiswa berdasarkan NIM");
            System.out.println("8.  Tambah data pada indeks tertentu");
            System.out.println("9.  Hapus node setelah NIM tertentu");
            System.out.println("10. Hapus node berdasarkan indeks");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data (size)");
            System.out.println("0.  Keluar");
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
                case 6:
                    System.out.print("Masukkan NIM yang akan disisipkan setelahnya: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa17 mhsInsert = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhsInsert);
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node17 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.Tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break; 
                case 8:
                    System.out.print("Masukkan indeks tempat data disisipkan: ");
                    int indexAdd = scan.nextInt();
                    scan.nextLine(); 
                    Mahasiswa17 mhsAdd = inputMahasiswa(scan);
                    list.add(indexAdd, mhsAdd);
                    break;

                case 9:
                    System.out.print("Masukkan NIM sebelum node yang akan dihapus: ");
                    String keyNimRemove = scan.nextLine();
                    list.removeAfter(keyNimRemove);
                    break;

                case 10:
                    System.out.print("Masukkan indeks node yang akan dihapus: ");
                    int indexRemove = scan.nextInt();
                    scan.nextLine();
                    list.remove(indexRemove);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idx);
                    break;
                case 14:
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;
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
