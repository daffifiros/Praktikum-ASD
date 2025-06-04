package Jobsheet12;
public class DoubleLinkedLists17 {
    Node17 head, tail;
    int size;

    public DoubleLinkedLists17() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 item) {
        Node17 newNode = new Node17(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa17 item) {
        Node17 newNode = new Node17(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada data yang bisa dihapus.");
        } else {
            Mahasiswa17 dataTerhapus = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
            System.out.println(dataTerhapus);
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong!");
            return;
        }
        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Node17 search(String nim) {
        Node17 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa17 data) {
        Node17 current = head;

        
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node17 newNode = new Node17(data);

        
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
} 