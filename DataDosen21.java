public class DataDosen21 {

    void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        int no = 1;
        for (Dosen21 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            d.cetakInfo();
            no++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen21 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen21 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        double rataPria = (jmlPria > 0) ? (double) totalPria / jmlPria : 0;
        double rataWanita = (jmlWanita > 0) ? (double) totalWanita / jmlWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        Dosen21 tertua = arrayOfDosen[0];

        for (Dosen21 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        Dosen21 termuda = arrayOfDosen[0];

        for (Dosen21 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}