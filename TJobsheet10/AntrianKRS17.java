package TJobsheet10;

public class AntrianKRS17 {
    Mahasiswa17[] antrian; 
    int max, front, rear, size, totalProses, maxMahasiswa;        
    
    public AntrianKRS17(int max, int maxMahasiswa) {
        this.max = max;
        this.maxMahasiswa = maxMahasiswa;
        antrian = new Mahasiswa17[max];
        front = 0;
        rear = -1;
        size = 0;
        totalProses = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == max;
    }
    
    public boolean enqueue(Mahasiswa17 mhs) {
        if (isFull()) {
            return false;
        } else {
            if (rear == max - 1) {
                rear = -1;
            }
            antrian[++rear] = mhs;
            size++;
            return true;
        }
    }
    
    public Mahasiswa17 dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Mahasiswa17 temp = antrian[front++];
            if (front == max) {
                front = 0;
            }
            size--;
            return temp;
        }
    }
    
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public Mahasiswa17 getFront() {
        if (isEmpty()) {
            return null;
        }
        return antrian[front];
    }
    
    public Mahasiswa17 getRear() {
        if (isEmpty()) {
            return null;
        }
        return antrian[rear];
    }
    
    public int getSize() {
        return size;
    }
    
    public int getTotalProses() {
        return totalProses;
    }
    
    public void tampilan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("===== DAFTAR ANTRIAN =====");
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.println("Mahasiswa #" + (i + 1));
            System.out.println(antrian[current].toString());
            System.out.println("---------------------------");
            current = (current + 1) % max;
        }
    }
    
    public void tampilkan2Depan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("===== 2 ANTRIAN TERDEPAN =====");
        int count = Math.min(2, size);
        int current = front;
        
        for (int i = 0; i < count; i++) {
            System.out.println("Antrian #" + (i + 1));
            System.out.println(antrian[current].toString());
            System.out.println("---------------------------");
            current = (current + 1) % max;
        }
    }
    
    public void tampilanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("===== ANTRIAN TERAKHIR =====");
        System.out.println(antrian[rear].toString());
        System.out.println("---------------------------");
    }
    
    public int hitungBelumProses() {
        return maxMahasiswa - totalProses;
    }
    
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup! Minimal 2 mahasiswa untuk diproses.");
            return;
        }
        
        if (totalProses >= maxMahasiswa) {
            System.out.println("DPA sudah memproses maksimal mahasiswa!");
            return;
        }
        
        System.out.println("===== PROSES KRS =====");
        for (int i = 0; i < 2; i++) {
            Mahasiswa17 mhs = dequeue();
            System.out.println("Memproses KRS Mahasiswa:");
            System.out.println(mhs.toString());
            System.out.println("---------------------------");
            totalProses++;
            
            if (totalProses >= maxMahasiswa) {
                System.out.println("DPA telah mencapai batas maksimal mahasiswa!");
                break;
            }
        }
        System.out.println("Total mahasiswa yang sudah diproses: " + totalProses);
        System.out.println("Mahasiswa yang belum diproses: " + hitungBelumProses());
    }
}