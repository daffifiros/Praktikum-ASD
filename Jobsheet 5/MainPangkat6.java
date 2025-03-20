import java.util.Scanner;

public class MainPangkat6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = input.nextInt();

        Pangkat17[] png = new Pangkat17[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Basis Elemen Ke-" + (i + 1) + ": ");
            int basis = input.nextInt();

            System.out.print("Masukkan Pangkat Basis Elemen Ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();

            png[i] = new Pangkat17(basis, pangkat);
        }

        System.out.println("\nHASIL PANGKAT BRUTE FORCE:");
        for (Pangkat17 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("\nHASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat17 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }


    }
}
