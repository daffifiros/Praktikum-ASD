package Jobsheet12;
import java.util.Scanner;
public class DLLMain17 {
    static Scanner sc = new Scanner(System.in);
    public static Mahasiswa17 inputMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
        return mhs;
    }

    public static void main(String[] args) {
        DoubleLinkedLists17 list = new DoubleLinkedLists17();
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa17 mhs1 = inputMahasiswa();
                    list.addFirst(mhs1);
                    break;
                case 2:
                    Mahasiswa17 mhs2 = inputMahasiswa();
                    list.addLast(mhs2);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String nimCari = sc.nextLine();
                    Node17 found = list.search(nimCari);
                    if (found != null) {
                        System.out.println("Data Mahasiswa ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;
                    case 7:
                    System.out.print("Masukkan NIM setelah mana data akan ditambahkan: ");
                    String nimPatokan = sc.nextLine();
                    Mahasiswa17 mhsBaru = inputMahasiswa();
                    list.insertAfter(nimPatokan, mhsBaru); 
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
        
        sc.close();
    }
} 