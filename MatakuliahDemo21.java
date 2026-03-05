import java.util.Scanner;

public class MatakuliahDemo21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Matakuliah21[] arrayOfMatakuliah = new Matakuliah21[jumlah];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {

            arrayOfMatakuliah[i] = new Matakuliah21();

            System.out.println("Masukkan data matakuliah ke-" + (i+1));

            System.out.print("Kode : ");
            kode = sc.nextLine();

            System.out.print("Nama : ");
            nama = sc.nextLine();

            System.out.print("SKS : ");
            sks = sc.nextInt();

            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Matakuliah:");

        for (int i = 0; i < jumlah; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}