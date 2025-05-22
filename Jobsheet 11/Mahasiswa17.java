public class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.printf("%-15s %-10s %-5s %-5.1f%n", nama, nim, kelas, ipk);
    }
}

