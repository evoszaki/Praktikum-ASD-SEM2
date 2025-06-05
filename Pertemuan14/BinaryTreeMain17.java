package Pertemuan14;
import java.util.Scanner;

public class BinaryTreeMain17 {
    public static void main(String[] args) {
        BinaryTree17 bst = new BinaryTree17();

        // Tambah data menggunakan addRekursif
        bst.addRekursif(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa17("244160220", "Dewi", "A", 3.54));
        bst.addRekursif(new Mahasiswa17("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa17("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa17("244160170", "Fizi", "B", 3.46));

        System.out.println("\n[InOrder Traversal]");
        bst.traverseInOrder(bst.root);

        System.out.println("\n[PreOrder Traversal]");
        bst.traversePreOrder(bst.root);

        System.out.println("\n[PostOrder Traversal]");
        bst.traversePostOrder(bst.root);

        System.out.println("\n[Data Mahasiswa dengan IPK Minimum]");
        Mahasiswa17 min = bst.cariMinIPK();
        if (min != null) {
            min.tampilInformasi();
        }

        System.out.println("\n[Data Mahasiswa dengan IPK Maksimum]");
        Mahasiswa17 max = bst.cariMaxIPK();
        if (max != null) {
            max.tampilInformasi();
        }

        System.out.println("\n[Data Mahasiswa dengan IPK di atas 3.50]");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}