public class Dosen21 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen21(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void cetakInfo() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);

        if (jenisKelamin) {
            System.out.println("Jenis Kelamin  : Pria");
        } else {
            System.out.println("Jenis Kelamin  : Wanita");
        }

        System.out.println("Usia           : " + usia);
        System.out.println("------------------------------------");
    }
}