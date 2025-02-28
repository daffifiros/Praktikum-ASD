import java.util.Scanner;

public class Matakuliah17 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public Matakuliah17(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah17() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode matakuliah: ");
        kode = sc.nextLine();
        System.out.print("Masukkan nama matakuliah: ");
        nama = sc.nextLine();
        System.out.print("Masukkan jumlah SKS: ");
        sks = sc.nextInt();
        System.out.print("Masukkan jumlah jam: ");
        jumlahJam = sc.nextInt();
    }

    void cetakInfo() {
        System.out.println("Kode Matakuliah  : " + kode);
        System.out.println("Nama Matakuliah  : " + nama);
        System.out.println("Jumlah SKS       : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
        System.out.println("------------------------------");
    }
}
