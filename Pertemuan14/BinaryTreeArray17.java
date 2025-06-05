package Pertemuan14;

public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray17() {
        this.dataMahasiswa = new Mahasiswa17[10];
        this.idxLast = -1; 
    }

    void populateData(Mahasiswa17[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void add(Mahasiswa17 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak dapat menambahkan data.");
        }
    }

    public void traverseInOrder(int idxStart) {
       if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); 
            }
       }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
