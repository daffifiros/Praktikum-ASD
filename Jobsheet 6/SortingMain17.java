public class SortingMain17 {
    public static void main(String[] args) {
        int[] a = {20, 10, 2, 7, 12};
        Sorting17 dataurut1 = new Sorting17(a, a.length);
        dataurut1.bubbleSort();
        System.out.println("Data Sudah Diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println();

        int[] b = {30, 20, 2, 8, 14};
        Sorting17 dataurut2 = new Sorting17(b, b.length);
        dataurut2.selectionSort();
        System.out.println("Data Sudah Diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
        System.out.println();

        int[] c1 = {40, 10, 5, 3, 2};
        Sorting17 dataurut3 = new Sorting17(c1, c1.length);
        dataurut3.insertionSort();
        System.out.println("Data Sudah Diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
