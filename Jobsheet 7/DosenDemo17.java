import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen17 data = new DataDosen17(100); // Inisialisasi dengan kapasitas maksimal 100
        int menu;
        
        do {
            System.out.println("\n===========================================");
            System.out.println("SISTEM PENGELOLAAN DATA DOSEN");
            System.out.println("===========================================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Cari Data Dosen Menggunakan Nama - Sequential Search");
            System.out.println("4. Cari Data Dosen Menggunakan Usia - Binary Search");
            System.out.println("0. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilih Menu (0-5): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1:
                    System.out.println("\nTambah Data Dosen");
                    System.out.println("===========================================");
                    System.out.print("Masukkan jumlah dosen yang akan ditambahkan: ");
                    int jumlah = sc.nextInt();
                    sc.nextLine();
                    
                    for(int i = 0; i < jumlah; i++) {
                        System.out.println("\nMasukkan data dosen ke-" + (i+1));
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan usia: ");
                        int usia = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan NIP: ");
                        String nip = sc.nextLine();
                        System.out.print("Masukkan jenis kelamin (L/P): ");
                        String jenisKelamin = sc.nextLine();

                        Dosen17 d = new Dosen17(nama, usia, nip, jenisKelamin);
                        data.tambah(d);
                    }
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    System.out.println("===========================================");
                    data.tampil();
                    break;

                case 3:
                    System.out.println("\nPencarian Data Sequential Search");
                    System.out.println("===========================================");
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.pencarianDataSequential(cariNama);
                    break;

                case 4:
                    System.out.println("\nPencarian Data Binary Search");
                    System.out.println("===========================================");
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.pencarianDataBinary(cariUsia);
                    break;


                case 0:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("\nMenu tidak valid!");
            }
        } while(menu != 0);
    }
} 