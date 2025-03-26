public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();

        Mahasiswa17 m1 = new Mahasiswa17("123", "Zidan", "2A", 3.2);
        Mahasiswa17 m2 = new Mahasiswa17("124", "Ayu", "2A", 3.5);
        Mahasiswa17 m3 = new Mahasiswa17("125", "Sofi", "2A", 3.1);
        Mahasiswa17 m4 = new Mahasiswa17("126", "Sita", "2A", 3.9);
        Mahasiswa17 m5 = new Mahasiswa17("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting : ");
        list.tampil();

        System.out.println("Data Mahasiswa Sesudah Sorting Berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();
    }
}
