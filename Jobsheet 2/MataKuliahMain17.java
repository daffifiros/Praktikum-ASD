public class MataKuliahMain17 {

    public static void main(String[] args) {
        MataKuliah17 mk01 = new MataKuliah17();
        mk01.kodeMK = "ASD001";
        mk01.nama = "Algoritma dan Struktur Data";
        mk01.sks = 2;
        mk01.jumlahJam = 6;
        mk01.tampilkanInformasi();
        mk01.tambahJam(8);
        mk01.kurangJam(20);
        mk01.ubahSKS(3);
        mk01.tampilkanInformasi();
        
        MataKuliah17 mk02 = new MataKuliah17("ASD002", "Praktikum Algoritma dan Struktur Data",3, 6);
        mk02.tampilkanInformasi();
        mk02.ubahSKS(5);
        mk02.tampilkanInformasi();
    }
}