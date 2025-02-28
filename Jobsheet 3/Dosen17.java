public class Dosen17 {
    private String kode;
    private String nama;
    private boolean jenisKelamin;
    private int usia;

    public Dosen17(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public boolean isPria() { return jenisKelamin; }
    public int getUsia() { return usia; }

    public void tampilkanInfo(int index) {
        System.out.println("\nData Dosen ke-" + index);
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
        System.out.println("=============================");
    }
}
