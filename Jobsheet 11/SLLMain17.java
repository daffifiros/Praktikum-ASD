import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();
        Scanner sc = new Scanner(System.in);

        /*int jml = 100;
         for (int i = 0; i < jml ; i++) {
             System.out.println("Masukkan data mahasiswa ke- " + (i + 1) + " : ");
             System.out.print("NIM: ");
             String nim = sc.nextLine();
             System.out.print("Nama: ");
             String nama = sc.nextLine();
             System.out.print("Kelas: ");
             String kelas = sc.nextLine();
             System.out.print("IPK: ");
             double ipk = sc.nextDouble();
             sc.nextLine();

             Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
             sll.addFirst(mhs);
             System.out.println();
             System.out.print("Apakah mau lanjut? (y/n) : ");
             String jawab = sc.nextLine();
             if (jawab.equalsIgnoreCase("n")) {
                 System.out.println("Terima kasih.");
                 break;
                 }
         }*/

        Mahasiswa17 mhs3 = new Mahasiswa17("22212202", "Cintia", "3C", 3.5);
        Mahasiswa17 mhs2 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);
        Mahasiswa17 mhs1 = new Mahasiswa17("21212203", "Dirga", "4D", 3.6);
        Mahasiswa17 mhs4 = new Mahasiswa17("24212200", "Alvaro", "1A", 4.0);

        sll.addFirst(mhs1);
        sll.addFirst(mhs2);
        sll.addFirst(mhs3);
        sll.addFirst(mhs4);

        System.out.println("data index 1 :");
        sll.getData(1).tampilkanInformasi();
        System.out.println();

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        sc.close();
    }
}