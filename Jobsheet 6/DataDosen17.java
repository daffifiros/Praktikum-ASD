public class DataDosen17 {
    Dosen17[] daftarDosen = new Dosen17[10];
    int jumlah = 0;

    void tambahDosen(Dosen17 dosen) {
        if (jumlah < daftarDosen.length) {
            daftarDosen[jumlah] = dosen;
            jumlah++;
        } else {
            System.out.println("Kapasitas data dosen penuh!");
        }
    }

    void tampilkanSemua() {
        if (jumlah == 0) {
            System.out.println("Tidak ada data dosen.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                daftarDosen[i].tampilkanInfo();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - 1 - i; j++) {
                if (daftarDosen[j].usia > daftarDosen[j + 1].usia) {
                    Dosen17 temp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < jumlah - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < jumlah; j++) {
                if (daftarDosen[j].usia > daftarDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen17 temp = daftarDosen[maxIndex];
            daftarDosen[maxIndex] = daftarDosen[i];
            daftarDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < jumlah; i++) {
            Dosen17 temp = daftarDosen[i];
            int j = i;
            while (j > 0 && daftarDosen[j - 1].usia < temp.usia) {
                daftarDosen[j] = daftarDosen[j - 1];
                j--;
            }
            daftarDosen[j] = temp;
        }
    }
}