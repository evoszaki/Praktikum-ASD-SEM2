package Pertemuan14;
import java.util.Scanner;

public class BinaryTreeArrayMain17 {
    public static void main(String[] args) {
        BinaryTreeArray17 bta = new BinaryTreeArray17();

        Mahasiswa17 mhs1 = new Mahasiswa17("244160121", "Ali", "A", 3.57);
        Mahasiswa17 mhs2 = new Mahasiswa17("244160185", "Candra", "C", 3.41);
        Mahasiswa17 mhs3 = new Mahasiswa17("244160221", "Badar", "B", 3.75);
        Mahasiswa17 mhs4 = new Mahasiswa17("244160220", "Dewi", "B", 3.35);

        Mahasiswa17 mhs5 = new Mahasiswa17("244160131", "Devi", "A", 3.48);
        Mahasiswa17 mhs6 = new Mahasiswa17("244160205", "Ehsan", "D", 3.61);
        Mahasiswa17 mhs7 = new Mahasiswa17("244160170", "Fizi", "B", 3.86);

        Mahasiswa17[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6; 
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);     

    }
}

