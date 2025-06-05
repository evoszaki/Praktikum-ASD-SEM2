package Pertemuan14;

public class BinaryTree17 {
    Node17 root;

    public BinaryTree17() {
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa17 mahasiswa) {
        Node17 newNode = new Node17(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node17 current = root;
            Node17 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa17.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node17 addRekursif(Node17 current, Mahasiswa17 data) {
        if (current == null) {
            return new Node17(data);
        }
        if (data.ipk < current.mahasiswa17.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public void addRekursif(Mahasiswa17 data) {
        root = addRekursif(root, data);
    }

    public Mahasiswa17 cariMinIPK() {
        if (isEmpty()) return null;
        Node17 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa17;
    }

    public Mahasiswa17 cariMaxIPK() {
        if (isEmpty()) return null;
        Node17 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa17;
    }

    public void tampilMahasiswaIPKdiAtas(Node17 node, double ipkBatas) {
        if (node != null) {
            if (node.mahasiswa17.ipk > ipkBatas) {
                node.mahasiswa17.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    boolean find(double ipk) {
        boolean result = false;
        Node17 current = root;
        while (current != null) {
            if (current.mahasiswa17.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa17.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node17 node) {
        if (node != null) {
            node.mahasiswa17.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa17.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node17 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa17.tampilInformasi();
        }
    }

    Node17 getSuccessor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong.");
            return;
        }

        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa17.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa17.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa17.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
                
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node17 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa17.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}