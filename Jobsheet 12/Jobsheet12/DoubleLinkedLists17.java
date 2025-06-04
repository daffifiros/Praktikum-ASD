package Jobsheet12;
public class DoubleLinkedLists17 {
    Node17 head;
    int size;

    public DoubleLinkedLists17() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 item) {
        if (isEmpty()) {
            head = new Node17(item);
        } else {
            Node17 newNode = new Node17(item);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa17 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node17 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node17 newNode = new Node17(item);
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node17 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node17 tmp = head;
            System.out.println("Data Mahasiswa:");
            while (tmp != null) {
                tmp.data.tampil();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List kosong");
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
} 