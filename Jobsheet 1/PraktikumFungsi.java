import java.util.Scanner;
public class PraktikumFungsi {
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] stok = new int[4][4];
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        System.out.println("========================================");
        System.out.println("       Input Stok Bunga Cabang         ");
        System.out.println("========================================");
        
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Masukkan stok untuk " + cabang[i] + ":");
            stok[i][0] = inputStok(input, "Aglonema");
            stok[i][1] = inputStok(input, "Keladi");
            stok[i][2] = inputStok(input, "Alocasia");
            stok[i][3] = inputStok(input, "Mawar");
        }

        System.out.println("\n========================================");
        System.out.println("   Pendapatan Jika Semua Bunga Terjual ");
        System.out.println("========================================");
        hitungPendapatan(stok, cabang);

        kurangiStok(stok);

        System.out.println("\n========================================");
        System.out.println("   Stok Setelah Pengurangan Bunga Mati  ");
        System.out.println("========================================");
        tampilkanStok(stok, cabang);

        input.close();
    }

    public static int inputStok(Scanner input, String namaBunga) {
        System.out.print(namaBunga + ": ");
        return input.nextInt();
    }

    public static void hitungPendapatan(int[][] stok, String[] cabang) {
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = (stok[i][0] * HARGA_AGLONEMA) + (stok[i][1] * HARGA_KELADI) +
                             (stok[i][2] * HARGA_ALOCASIA) + (stok[i][3] * HARGA_MAWAR);
            System.out.printf("%-20s : Rp %,d\n", cabang[i], pendapatan);
        }
    }

    public static void kurangiStok(int[][] stok) {
        for (int i = 0; i < stok.length; i++) {
            if (stok[i][0] > 0) stok[i][0] -= 1; 
            if (stok[i][1] > 0) stok[i][1] -= 2;
            if (stok[i][3] > 0) stok[i][3] -= 5;
        }
    }

    public static void tampilkanStok(int[][] stok, String[] cabang) {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n", cabang[i], stok[i][0], stok[i][1], stok[i][2], stok[i][3]);
        }
    }
}