import java.util.Scanner;
public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\nData Mahasiswa dalam Linked List:");
        sll.print();
        
        input.close();
    }
}