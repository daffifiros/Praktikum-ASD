import java.util.Scanner;
public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            Double ipk = Double.parseDouble(sc.nextLine());
            list.tambah(new Mahasiswa17(nim, nama, kelas, ipk));
        }
        
        list.tampil();

        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, list.listMhs.length - 1);
        int pss2 = (int) posisi2; 
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
