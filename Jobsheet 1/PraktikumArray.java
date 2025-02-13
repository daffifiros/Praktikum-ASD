import java.util.Scanner;

public class PraktikumArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        System.out.println("=====================================");
        System.out.println("       Program Hitung IP Semester    ");
        System.out.println("=====================================");

        double[] nilai = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai untuk " + mataKuliah[i] + ": ");
            nilai[i] = sc.nextDouble();
        }

        System.out.println("=====================================");
        System.out.println("         Hasil Konversi Nilai       ");
        System.out.println("=====================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        int totalSKS = mataKuliah.length;

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = convertNilaiHuruf(nilai[i]);
            bobotNilai[i] = convertBobotNilai(nilaiHuruf);
            totalBobot += bobotNilai[i];

            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mataKuliah[i], nilai[i], nilaiHuruf, bobotNilai[i]);
        }

        System.out.println("=====================================");
        System.out.println("              IP SEMESTER           ");
        System.out.println("=====================================");
        double ipSemester = totalBobot / totalSKS;
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }

    private static String convertNilaiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) return "A";
        else if (nilai > 73 && nilai <= 80) return "B+";
        else if (nilai > 65 && nilai <= 73) return "B";
        else if (nilai > 60 && nilai <= 65) return "C+";
        else if (nilai > 50 && nilai <= 60) return "C";
        else if (nilai > 39 && nilai <= 50) return "D";
        else return "E";
    }

    private static double convertBobotNilai(String nilaiHuruf) {
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