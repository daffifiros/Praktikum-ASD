public class StackTugasMahasiswa17 {
    Mahasiswa17[] stack;
    int size, top;

    public StackTugasMahasiswa17(int size) {
        this.size = size;
        stack = new Mahasiswa17[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa17 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa17 pop() {
        if (!isEmpty()) {
            Mahasiswa17 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong, Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa17 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print () {
        for (int i = 0; i <= top; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi17 stack = new StackKonversi17();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
