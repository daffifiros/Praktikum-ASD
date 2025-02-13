import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       Program Jadwal Kuliah           ");
        System.out.println("========================================");
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String mataKuliah = scanner.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, mataKuliah);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        System.out.println("========================================");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-30s | SKS: %-3d | Semester: %-3d | Hari: %s\n", 
                              nama[i], sks[i], semester[i], hari[i]);
        }
        System.out.println("========================================");
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String cariHari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + cariHari.toUpperCase() + " ===");
        System.out.println("========================================");
        boolean found = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-30s | SKS: %-3d | Semester: %-3d\n", 
                                  nama[i], sks[i], semester[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah di hari " + cariHari);
        }
        System.out.println("========================================");
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + cariSemester + " ===");
        System.out.println("========================================");
        boolean found = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.printf("%-30s | SKS: %-3d | Hari: %s\n", 
                                  nama[i], sks[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah di semester " + cariSemester);
        }
        System.out.println("========================================");
    }

    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String cariNama) {
        System.out.println("\n=== PENCARIAN MATA KULIAH: " + cariNama.toUpperCase() + " ===");
        System.out.println("========================================");
        boolean found = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cariNama)) {
                System.out.printf("%-30s | SKS: %-3d | Semester: %-3d | Hari: %s\n", 
                                  nama[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah " + cariNama + " tidak ditemukan.");
        }
        System.out.println("========================================");
    }
}