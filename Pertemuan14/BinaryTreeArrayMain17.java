package Pertemuan14;

public class BinaryTreeArrayMain17 {
    public static void main(String[] args) {
        BinaryTreeArray17 bta = new BinaryTreeArray17();

        // Menambahkan data mahasiswa ke tree array
        bta.add(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa17("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa17("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa17("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa17("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa17("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa17("244160170", "Fizi", "B", 3.86));

        System.out.println("\n[InOrder Traversal Mahasiswa - BinaryTreeArray]");
        bta.traverseInOrder(0);

        System.out.println("\n[PreOrder Traversal Mahasiswa - BinaryTreeArray]");
        bta.traversePreOrder(0);
    }
}
