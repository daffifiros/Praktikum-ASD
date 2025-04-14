public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa17() {
    }

    public Mahasiswa17(String rm, String name, String kls, double ip) {
        nim = rm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}
