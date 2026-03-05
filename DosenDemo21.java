import java.util.Scanner;

public class DosenDemo21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen21[] arrayOfDosen = new Dosen21[jumlah];

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();

            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        DataDosen21 data = new DataDosen21();

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== RATA-RATA USIA DOSEN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING TUA =====");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}