import java.util.Scanner;
public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc17.nextInt();
        sc17.nextLine(); // consume newline

        for (int i = 0; i < jml; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc17.nextLine();
            System.out.print("Nama: ");
            String nama = sc17.nextLine();
             System.out.print("Kelas: ");
            String kelas = sc17.nextLine();
            System.out.print("IPK: ");
            double ipk = sc17.nextDouble();
            sc17.nextLine();
            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        System.out.println("\nIsi Linked List:");
        sll.print();
    }
}

