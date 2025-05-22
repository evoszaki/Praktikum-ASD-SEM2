package TJobsheet11;

public class QueueAntrian17 {
    Node17 front, rear;
    int size;
    final int MAX_SIZE = 3;

    public QueueAntrian17() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    public void enqueue(Mahasiswa17 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan mahasiswa.");
            return;
        }
        Node17 newNode = new Node17(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil: " + front.data.nim + " - " + front.data.nama);
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + front.data.nim + " - " + front.data.nama);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: " + rear.data.nim + " - " + rear.data.nama);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void count() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            Node17 current = front;
            while (current != null) {
                System.out.println("- " + current.data.nim + " - " + current.data.nama);
                current = current.next;
            }
        }
    }
}
