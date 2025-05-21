package Tugas;
public class AntrianKRS17 {
    Mahasiswa17[] data;
    int front, rear, size, max;
    int totalDiproses = 0;

    public AntrianKRS17(int max) {
        this.max = max;
        data = new Mahasiswa17[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        totalDiproses = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa17 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa. Tidak bisa proses.");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa17 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (size < 2) {
            System.out.println("Kurang dari dua mahasiswa dalam antrian.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian:");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + totalDiproses);
    }

    public void jumlahBelumDiproses() {
        int sisa = 30 - totalDiproses;
        System.out.println("Sisa mahasiswa yang belum melakukan proses KRS oleh DPA: " + (sisa > 0 ? sisa : 0));
    }
}