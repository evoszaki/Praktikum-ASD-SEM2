package P1Jobsheet12;

public class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void Tampil() {
        System.out.println("NIM: " + nim + "\nNama: " + nama + "\nKelas: " + kelas + "\nIPK: " + ipk);
    }
}
