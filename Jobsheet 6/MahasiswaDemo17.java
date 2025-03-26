
import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();

        System.out.println("Data Mahasiswa Sebelum Sorting:");
        list.tampil();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM  : ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK  : ");
            String ipkStr = sc.nextLine().replace(",", ".");
            double ipk = Double.parseDouble(ipkStr);

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println("---------------------------------");
        }

        System.out.println("\nData Mahasiswa Setelah Sorting Berdasarkan IPK (DESC):");
        list.selectionSort();
        list.tampil();
    }
}