import java.util.Scanner;

public class MainSum17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = input.nextInt();

        Sum17 sm = new Sum17(elemen);

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan Ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total Keuntungan Menggunakan BruteForce: " + sm.totalBF());
        System.out.println("Total Keuntungan Menggunakan Divide And Conquer: " 
                + sm.totalDC(sm.keuntungan, 0, elemen - 1));

        
    }
}
