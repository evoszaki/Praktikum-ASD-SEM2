package TJobsheet10;
import java.util.Scanner;

class Mahasiswa17 {
    String nim;
    String nama;
    String jurusan;
    String prodi;
    
    public Mahasiswa17(String nim, String nama, String jurusan, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public String getProdi() {
        return prodi;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void tampilkanData() {
        System.out.println("NIM: " + nim + "\nNama: " + nama + "\nJurusan: " + jurusan + 
               "\nProdi: " + prodi);
    }
}