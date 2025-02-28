import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        Dosen17[] daftarDosen = new Dosen17[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin  : ");
            String jenisKelaminStr = sc.nextLine();
            boolean jenisKelamin = jenisKelaminStr.equalsIgnoreCase("Pria");
            System.out.print("Usia           : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("=============================");

            daftarDosen[i] = new Dosen17(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== DAFTAR SEMUA DOSEN ===");
        int index = 1;
        for (Dosen17 d : daftarDosen) {
            d.tampilkanInfo(index++);
        }

        DataDosen17.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen17.rerataUsiaPerJenisKelamin(daftarDosen);
        DataDosen17.infoDosenPalingTua(daftarDosen);
        DataDosen17.infoDosenPalingMuda(daftarDosen);
    }
}
