public class StackSurat17 {
    Surat17[] stack;
    int size, top;

    public StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    
    public void push(Surat17 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack penuh, tidak bisa menerima surat baru.");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            Surat17 s = stack[top];
            top--;
            System.out.println("Surat atas nama " + s.namaMahasiswa + " telah diproses.");
            return s;
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
            return null;
        }
    }


    public Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat di stack.");
            return null;
        }
    }

    
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\nSurat Ditemukan :");
                System.out.println("ID Surat        : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa  : " + stack[i].namaMahasiswa);
                System.out.println("Kelas           : " + stack[i].kelas);
                System.out.println("Jenis Perizinan : " + stack[i].jenisIzin);
                System.out.println("Lama Waktu Izin : " + stack[i].durasi);
                ditemukan = true;
                break; 
            }
        }
        if (!ditemukan) {
            System.out.println("\nSurat atas nama \"" + nama + "\" tidak ditemukan.");    
        }
    }
}