import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); // Membersihkan newline

        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan newline

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println();
        }

        // Menampilkan data sebelum sorting
        System.out.println("Data sebelum sorting:");
        list.tampil();

        // Mengurutkan data menggunakan insertion sort (ascending)
        list.insertionSort();

        // Menampilkan data setelah sorting
        System.out.println("\nData setelah sorting (ascending):");
        list.tampil();

        System.out.println("------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan IPK Mahasiswa Yang Ingin Dicari: ");
        double cari = sc.nextDouble();

        System.out.println("\nMenggunakan Binary Search");
        int posisi = list.findBinarySearch(cari, 0, jumMhs-1);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
