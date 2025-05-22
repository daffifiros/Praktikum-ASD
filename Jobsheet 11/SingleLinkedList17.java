public class SingleLinkedList17 {
    NodeMahasiswa17 head;
    NodeMahasiswa17 tail;
    
    boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa17 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(Mahasiswa17 input) {
        NodeMahasiswa17 ndInput = new NodeMahasiswa17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa17 input) {
        NodeMahasiswa17 ndInput = new NodeMahasiswa17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa17 input) {
        NodeMahasiswa17 ndInput = new NodeMahasiswa17(input, null);
        NodeMahasiswa17 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
        
    }
    public void insertAt(int index, Mahasiswa17 input) {
        if (index < 0) {
            System.out.println("Indeks Salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa17 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa17(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}

