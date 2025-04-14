public class DataDosen17 {
    Dosen17[] dosen;
    int jml;

    public DataDosen17(int jumlah) {
        dosen = new Dosen17[jumlah];
        jml = 0;
    }

    public void tambah(Dosen17 d) {
        if(jml < dosen.length) {
            dosen[jml] = d;
            jml++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        int jmlLaki = 0, jmlPerempuan = 0;
        
        for(int i = 0; i < jml; i++) {
            System.out.println("\nData Dosen ke-" + (i+1));
            System.out.println("Nama: " + dosen[i].nama);
            System.out.println("Usia: " + dosen[i].usia);
            System.out.println("NIP: " + dosen[i].nip);
            System.out.println("Jenis Kelamin: " + dosen[i].jenisKelamin);
            System.out.println("-------------------------");

            if(dosen[i].jenisKelamin.equalsIgnoreCase("L")) {
                jmlLaki++;
            } else if(dosen[i].jenisKelamin.equalsIgnoreCase("P")) {
                jmlPerempuan++;
            }
        }

        System.out.println("\nJumlah Dosen Berdasarkan Jenis Kelamin:");
        System.out.println("Laki-laki: " + jmlLaki + " orang");
        System.out.println("Perempuan: " + jmlPerempuan + " orang");
    }

    public void tampilkanInfo() {
        for(int i = 0; i < jml; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.println("Nama: " + dosen[i].nama);
            System.out.println("Usia: " + dosen[i].usia);
            System.out.println("NIP: " + dosen[i].nip);
            System.out.println("-------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin() {
        int jmlLaki = 0, jmlPerempuan = 0;
        for(int i = 0; i < jml; i++) {
            if(dosen[i].jenisKelamin.equalsIgnoreCase("L")) {
                jmlLaki++;
            } else if(dosen[i].jenisKelamin.equalsIgnoreCase("P")) {
                jmlPerempuan++;
            }
        }
        System.out.println("Jumlah dosen laki-laki: " + jmlLaki);
        System.out.println("Jumlah dosen perempuan: " + jmlPerempuan);
    }

    public void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
        
        System.out.println("\nHasil Pencarian untuk nama: " + nama);
        System.out.println("===========================================");
        
        for(int i = 0; i < jml; i++) {
            if(dosen[i].nama.equalsIgnoreCase(nama)) {
                if (jumlahDitemukan == 0) {
                    System.out.println("Data ditemukan pada indeks berikut:");
                }
                jumlahDitemukan++;
                System.out.println("\nData ke-" + jumlahDitemukan + " pada indeks " + i);
                System.out.println("Nama: " + dosen[i].nama);
                System.out.println("Usia: " + dosen[i].usia);
                System.out.println("NIP: " + dosen[i].nip);
                System.out.println("Jenis Kelamin: " + dosen[i].jenisKelamin);
                ditemukan = true;
            }
        }
        
        if(!ditemukan) {
            System.out.println("Data " + nama + " tidak ditemukan!");
        } else if(jumlahDitemukan > 1) {
            System.out.println("\n[PERINGATAN] Ditemukan " + jumlahDitemukan + " data dengan nama yang sama!");
        }
    }

    public void sortingAsc() {
        for(int i = 0; i < jml-1; i++) {
            for(int j = 0; j < jml-i-1; j++) {
                if(dosen[j].usia > dosen[j+1].usia) {
            
                    Dosen17 tmp = dosen[j];
                    dosen[j] = dosen[j+1];
                    dosen[j+1] = tmp;
                }
            }
        }
        System.out.println("Data telah diurutkan berdasarkan usia secara ascending!");
    }

    public void insertionSort() {
        for(int i = 1; i < jml; i++) {
            Dosen17 temp = dosen[i];
            int j = i;
            while(j > 0 && dosen[j-1].usia > temp.usia) {
                dosen[j] = dosen[j-1];
                j--;
            }
            dosen[j] = temp;
        }
    }

    public void pencarianDataBinary(int usia) {
        insertionSort(); 
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
        int awal = 0, akhir = jml - 1;
        
        System.out.println("\nHasil Pencarian untuk usia: " + usia);
        System.out.println("===========================================");
        
        while(awal <= akhir) {
            int tengah = (awal + akhir) / 2;
            if(dosen[tengah].usia == usia) {
                jumlahDitemukan++;
                if (jumlahDitemukan == 1) {
                    System.out.println("Data ditemukan pada indeks berikut:");
                }
                
                System.out.println("\nData ke-" + jumlahDitemukan + " pada indeks " + tengah);
                System.out.println("Nama: " + dosen[tengah].nama);
                System.out.println("Usia: " + dosen[tengah].usia);
                System.out.println("NIP: " + dosen[tengah].nip);
                System.out.println("Jenis Kelamin: " + dosen[tengah].jenisKelamin);
                ditemukan = true;
                
    
                int temp = tengah - 1;
                while(temp >= 0 && dosen[temp].usia == usia) {
                    jumlahDitemukan++;
                    System.out.println("\nData ke-" + jumlahDitemukan + " pada indeks " + temp);
                    System.out.println("Nama: " + dosen[temp].nama);
                    System.out.println("Usia: " + dosen[temp].usia);
                    System.out.println("NIP: " + dosen[temp].nip);
                    System.out.println("Jenis Kelamin: " + dosen[temp].jenisKelamin);
                    temp--;
                }
                
        
                temp = tengah + 1;
                while(temp < jml && dosen[temp].usia == usia) {
                    jumlahDitemukan++;
                    System.out.println("\nData ke-" + jumlahDitemukan + " pada indeks " + temp);
                    System.out.println("Nama: " + dosen[temp].nama);
                    System.out.println("Usia: " + dosen[temp].usia);
                    System.out.println("NIP: " + dosen[temp].nip);
                    System.out.println("Jenis Kelamin: " + dosen[temp].jenisKelamin);
                    temp++;
                }
                
                if(jumlahDitemukan > 1) {
                    System.out.println("\n[PERINGATAN] Ditemukan " + jumlahDitemukan + " data dengan usia yang sama!");
                }
                break;
            } else if(dosen[tengah].usia > usia) {
                akhir = tengah - 1;
            } else {
                awal = tengah + 1;
            }
        }
        if(!ditemukan) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan!");
        }
    }
} 