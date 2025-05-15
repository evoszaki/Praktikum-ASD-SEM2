public class SingleLinkedList17 {
    Node17 head;
    Node17 tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if(!isEmpty()) {
            Node17 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        Node17 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa17 input) {
        if (index < 0) {
            System.out.println("Indexs salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node17 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node17(input, temp.next);
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}