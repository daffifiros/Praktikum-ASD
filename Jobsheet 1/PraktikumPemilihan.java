import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();
        System.out.println("==================");
        System.out.println("==================");
        

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }
        
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
        
        String nilaiHuruf;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 58) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        
        System.out.printf("nilai akhir: %.1f\n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        
        System.out.println("==================");
        System.out.println("==================");
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
        scanner.close();
    }
}
