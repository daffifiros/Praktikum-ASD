import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("    Program Pencarian Plat Nomor Kota           ");
        System.out.println("========================================");
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kodePlat.length; i++) {
            if (kodePlat[i] == inputKode) {
                System.out.println("Kota yang sesuai: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan. Silakan coba lagi.");
        }

        System.out.println("========================================");
        System.out.println("          Terima Kasih!                ");
        System.out.println("========================================");
        scanner.close();
    }
}