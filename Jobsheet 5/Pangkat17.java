public class Pangkat17 {
    int nilai, pangkat;


    public Pangkat17(int n, int p) {
        nilai = n;
        pangkat = p;
    }
    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            int halfPower = pangkatDC(a, n / 2);
            if (n % 2 == 1) {
                return halfPower * halfPower * a;
            } else {
                return halfPower * halfPower;
            }
        }
    }
}