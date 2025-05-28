public class QueueMahasiswa17 {
    NodeMahasiswa17 front;
    NodeMahasiswa17 rear;
    int size;

    public QueueMahasiswa17() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    
    public boolean isFull() {
        return false; 
    }

    public void enqueue(Mahasiswa17 data) {
        NodeMahasiswa17 newNode = new NodeMahasiswa17(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + data.nama + " ditambahkan ke antrian.");
    }

    public Mahasiswa17 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat memanggil layanan.");
            return null;
        } else {
            Mahasiswa17 served = front.data;
            front = front.next;
            if (front == null) { 
                rear = null;
            }
            size--;
            System.out.println("Memanggil mahasiswa: " + served.nama);
            return served;
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilkanInformasi();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilkanInformasi();
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodeMahasiswa17 temp = front;
            System.out.println("\n===== Daftar Antrian =====");
            int position = 1;
            while (temp != null) {
                System.out.println("Antrian ke-" + position + ":");
                temp.data.tampilkanInformasi();
                temp = temp.next;
                position++;
            }
            System.out.println("==========================");
        }
    }
}