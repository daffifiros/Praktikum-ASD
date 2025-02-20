public class Dosen17 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    void tampilkanInformasi (){
        System.out.println("===============================");
        System.out.println("        Informasi Dosen      ");
        System.out.println("===============================");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Ya" : "Tidak"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("===============================");
    }
    void setStatusAktif (boolean Status) {
        statusAktif = Status;
        if (Status == true) {
            System.out.println("Dosen Ini Dinyatakan Aktif"); 
            return;
        } else {
            System.out.println("Dosen Ini Dinyatakan Tidak Aktif");
            return;
        }
        
        
    }
    void hitungMasaKerja (int thnSkrg) {
        System.out.println("Tahun Sekarang: " + thnSkrg);
        int masaKerja = thnSkrg - tahunBergabung ;
        System.out.println("Jumlah Masa Kerja: " + masaKerja + "Tahun");
    }
    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }
    public Dosen17 (){

    }
    public Dosen17 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
       this.idDosen = idDosen;
       this.nama = nama;
       this.statusAktif = statusAktif;
       this.tahunBergabung = tahunBergabung;
       this.bidangKeahlian = bidangKeahlian;
    }

}