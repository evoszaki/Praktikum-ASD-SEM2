package Pertemuan14;

public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray17() {
        this.dataMahasiswa = new Mahasiswa17[10];
    }

    void populateData(Mahasiswa17[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }
}

