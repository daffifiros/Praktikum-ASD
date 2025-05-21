package Tugas;
import java.util.Scanner;
public class LayananKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS17 antrian = new AntrianKRS17(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Lihat 2 Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah yang Sudah Proses KRS");
            System.out.println("8. Lihat Sisa Mahasiswa yang Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); 
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (!antrian.isFull()) {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Prodi: ");
                        String prodi = sc.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = sc.nextLine();
                        Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                        antrian.tambahAntrian(mhs);
                    } else {
                        System.out.println("Antrian penuh!");
                    }
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.lihatDuaTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahDiproses();
                    break;
                case 8:
                    antrian.jumlahBelumDiproses();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}