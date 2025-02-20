import java.util.Scanner;
public class MataKuliah17 {
    String kodeMK, nama;
    int sks, jumlahJam;

    void tampilkanInformasi(){
    System.out.println("kodeMK: " + kodeMK);
    System.out.println("Nama: " + nama);
    System.out.println("SKS: " + sks);
    System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS (int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam (int jam) {
        jumlahJam += jam;
    }
    void kurangJam (int jam ) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam yang tersisa tidak mencukupi.");
        } else {
            jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Jumlah jam yang baru: " + jumlahJam);
        }
    }
    public MataKuliah17 () {

    }
    public MataKuliah17 (String kodeMK, String nm, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }


    
}