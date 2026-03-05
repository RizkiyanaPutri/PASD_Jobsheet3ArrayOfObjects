# PASD Jobsheet 3 Array Of Object

## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan

## 3.2.2 Verifikasi Hasil Percobaan
![alt text](image.png)

## 3.2.3 Pertanyaan
## 1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
Sebuah class tidak wajib memiliki method untuk bisa dibuat menjadi array of object. Minimal, class tersebut harus bisa diinstansiasi (dibuat objeknya). Pada praktikum ini, class Mahasiswa21 hanya memiliki atribut (nim, nama, kelas, ipk) tanpa method, tetapi tetap bisa dibuat array of object.
----
## 2. Apa yang dilakukan oleh kode berikut?
```java
Mahasiswa21[] arrayOfMahasiswa = new Mahasiswa21[3];
```
Kode tersebut membuat array yang dapat menyimpan 3 objek Mahasiswa21, tetapi belum membuat objeknya, setiap elemen array masih bernilai null
---
## 3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
 ```java
arrayOfMahasiswa[0] = new Mahasiswa21();
 ```
Di dalam class Mahasiswa21 memang tidak dituliskan konstruktor secara eksplisit. Namun, Java secara otomatis memberikan default constructor jika kita tidak membuat konstruktor sendiri, karena itu pemanggilan tersebut tetap bisa dilakukan

## 4. Apa yang dilakukan oleh kode program berikut?
```java
arrayOfMahasiswa[0] = new Mahasiswa21();
arrayOfMahasiswa[0].nim = "244107060033";
arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
arrayOfMahasiswa[0].kelas = "SIB-1E";
arrayOfMahasiswa[0].ipk = (float)3.75;
```
kode tersebut membuat objek dan mengisi data ke dalam objek

## 5. Mengapa class Mahasiswa21 dan MahasiswaDemo21 dipisahkan?
Karena mengikuti prinsip separation of responsibility.
Mahasiswa21 → berisi blueprint / model data mahasiswa(atribut)
MahasiswaDemo21 → berisi program utama (main method) untuk menjalankan dan menguji class Mahasiswa21. keuntungannya kode lebih rapi, mudah dikembangkan, bisa digunakan kembali.
