import java.util.Scanner;

public class MainQueue17 {

    public static Mahasiswa17 getMahasiswaData(Scanner input) {
        System.out.print("NIM   : ");
        String nim = input.nextLine();
        System.out.print("Nama  : ");
        String nama = input.nextLine();
        System.out.print("Kelas : ");
        String kelas = input.nextLine();

        double ipk;
        while (true) {
            System.out.print("IPK   : ");
            try {
                ipk = input.nextDouble();
                input.nextLine();
                break; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid! Masukkan nilai angka untuk IPK (contoh: 3.5).");
                input.nextLine(); 
            }
        }

        return new Mahasiswa17(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        QueueMahasiswa17 queue = new QueueMahasiswa17();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Menu Layanan Unit Kemahasiswaan =====");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Tambah Antrian (Enqueue)");
            System.out.println("4. Panggil Antrian (Dequeue)");
            System.out.println("5. Lihat Antrian Terdepan");
            System.out.println("6. Lihat Antrian Paling Akhir");
            System.out.println("7. Lihat Jumlah Mahasiswa Mengantre");
            System.out.println("8. Tampilkan Seluruh Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        if (queue.isEmpty()) {
                            System.out.println("Antrian kosong.");
                        } else {
                            System.out.println("Antrian tidak kosong.");
                        }
                        break;
                    case 2:
                         
                        System.out.println("Antrian tidak pernah penuh (berbasis linked list).");
                        break;
                    case 3:
                        System.out.println("\nMasukkan data mahasiswa:");
                        Mahasiswa17 newMahasiswa = getMahasiswaData(sc);
                        queue.enqueue(newMahasiswa);
                        break;
                    case 4:
                        queue.dequeue();
                        break;
                    case 5:
                        queue.peekFront();
                        break;
                    case 6:
                        queue.peekRear();
                        break;
                    case 7:
                        System.out.println("Jumlah mahasiswa dalam antrian: " + queue.size());
                        break;
                     case 8:
                        queue.displayQueue();
                        break;
                    case 9:
                        queue.clear();
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid! Masukkan angka untuk pilihan menu.");
                sc.nextLine(); 
                choice = -1; 
            }

        } while (choice != 0);

        sc.close();
    }
}