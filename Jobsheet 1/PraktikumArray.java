import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine();
        String[] mataKuliah = new String[jumlahMK];
        double[] bobotSKS = new double[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = scanner.nextLine();
            
            System.out.print("Masukkan bobot SKS untuk " + mataKuliah[i] + ": ");
            bobotSKS[i] = scanner.nextDouble();
            
            System.out.print("Masukkan nilai Angka untuk " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline
            
            nilaiHuruf[i] = convertToNilaiHuruf(nilaiAngka[i]);
        }
        
        double totalNilai = 0;
        double totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalNilai += convertToBobot(nilaiHuruf[i]) * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        
        double ip = totalNilai / totalSKS;
        System.out.println("\nhasil Konversi Nilai:");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], convertToBobot(nilaiHuruf[i]));
        }
    
        System.out.printf("\nIP = %.2f\n", ip);
        
        scanner.close();
    }

    private static String convertToNilaiHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 58) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }
    

    private static double convertToBobot(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }
}
