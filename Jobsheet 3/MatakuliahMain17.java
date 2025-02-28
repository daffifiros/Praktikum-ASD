    import java.util.Scanner;

    public class MatakuliahMain17 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Matakuliah17[] arrayOfMatakuliah = new Matakuliah17[3];

            String kode, nama, dummy;
            int sks, jumlahJam;

            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
                System.out.print("Kode        : ");
                kode = sc.nextLine();
                System.out.print("Nama        : ");
                nama = sc.nextLine();
                System.out.print("SKS         : ");
                dummy = sc.nextLine();
                sks = Integer.parseInt(dummy);
                System.out.print("Jumlah Jam  : ");
                dummy = sc.nextLine();
                jumlahJam = Integer.parseInt(dummy);
                System.out.println("------------------------");

                arrayOfMatakuliah[i] = new Matakuliah17(kode, nama, sks, jumlahJam);
        }
        System.out.println("\nData Matakuliah yang telah dimasukkan:");
        for (Matakuliah17 mk : arrayOfMatakuliah) {
            mk.cetakInfo();
        }

        Matakuliah17 mkBaru = new Matakuliah17();
        mkBaru.tambahData();

        System.out.println("\nData Matakuliah yang baru ditambahkan:");
        mkBaru.cetakInfo();
    }
}
