public class Dosen17 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen17(String kodeDosen, String namaDosen, boolean kelamin, int umur) {
        this.kode = kodeDosen;
        this.nama = namaDosen;
        this.jenisKelamin = kelamin;
        this.usia = umur;
    }

    public void tampilkanInfo() {
        System.out.println("\nInformasi Dosen");
        System.out.println("Kode Dosen     : " + kode);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia + " tahun");
        System.out.println("========================");
    }
}