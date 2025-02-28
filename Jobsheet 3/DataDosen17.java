public class DataDosen17 {
    public static void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen17 d : arrayOfDosen) {
            if (d.isPria()) pria++;
            else wanita++;
        }
        System.out.println("\n=== JUMLAH DOSEN BERDASARKAN JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;

        for (Dosen17 d : arrayOfDosen) {
            if (d.isPria()) {
                totalPria += d.getUsia();
                countPria++;
            } else {
                totalWanita += d.getUsia();
                countWanita++;
            }
        }

        double rataPria = countPria > 0 ? (double) totalPria / countPria : 0;
        double rataWanita = countWanita > 0 ? (double) totalWanita / countWanita : 0;

        System.out.println("\n=== RATA-RATA USIA DOSEN ===");
        System.out.println("Pria   : " + rataPria);
        System.out.println("Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen17[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen17 tertua = arrayOfDosen[0];

        for (Dosen17 d : arrayOfDosen) {
            if (d.getUsia() > tertua.getUsia()) tertua = d;
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.tampilkanInfo(1);
    }

    public static void infoDosenPalingMuda(Dosen17[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen17 termuda = arrayOfDosen[0];

        for (Dosen17 d : arrayOfDosen) {
            if (d.getUsia() < termuda.getUsia()) termuda = d;
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.tampilkanInfo(1);
    }
}
