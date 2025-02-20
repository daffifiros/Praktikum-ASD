public class DosenMain17 {

    public static void main(String[] args) {
        Dosen17 dsn1 = new Dosen17();
        dsn1.idDosen = "YWS";
        dsn1.nama = "Yan Watequlis Siregar";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2008;
        dsn1.bidangKeahlian = "Machine Learning";
        dsn1.tampilkanInformasi();
        dsn1.hitungMasaKerja(2025);
        
        Dosen17 dsn2 = new Dosen17("WIS", "Wilda Imama Sabilla", false, 2010, "Coding");
        dsn2.tampilkanInformasi ();
        dsn2.setStatusAktif(true);
        dsn2.tampilkanInformasi();
    }
}