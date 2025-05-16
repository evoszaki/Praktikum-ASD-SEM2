public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();

        Mahasiswa17 mhs1 = new Mahasiswa17("101", "Abi", "1A", 4.0);
        Mahasiswa17 mhs2 = new Mahasiswa17("102", "Budi", "2B", 3.8);
        Mahasiswa17 mhs3 = new Mahasiswa17("103", "Cici", "3C", 3.5);
        Mahasiswa17 mhs4 = new Mahasiswa17("104", "Doremi", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Budi berada pada index: " +sll.indexOf("Budi"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
