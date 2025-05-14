import java.util.Scanner;

public class MainSurat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat17 stack = new StackSurat17(10); 
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin (berdasarkan nama mahasiswa)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat17 surat = new Surat17(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    Surat17 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh : " + terakhir.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}
