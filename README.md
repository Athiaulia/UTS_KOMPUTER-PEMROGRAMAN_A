# Studi Kasus ke-9: Sistem Absensi Mahasiswa

## Anggota Kelompok:
1) Ardi Nugrahanto (G1A025023)
2) Athiya Rahma Aulia (G1A025031)
3) Suryadi Agusmawanto (G1A025117)
-----
## Overview Sistem
Program ini dibuat untuk mengelola data kehadiran mahasiswa dalam sebuah kelas. Program meminta input berupa nama kelas, jumlah mahasiswa, dan jumlah pertemuan. Setiap mahasiswa kemudian akan diinputkan datanya (nama dan NPM), lalu program akan menanyakan apakah mahasiswa tersebut hadir pada tiap pertemuan. Setelah semua data dimasukkan, program akan menampilkan rekap kehadiran lengkap dalam bentuk tabel, termasuk persentase kehadiran dan status “LULUS / TIDAK LULUS”.

-----
## Penjelasan Tiap File
a. Main.java
File ini berfungsi sebagai program utama (entry point). Isinya:
+ Membaca input dari pengguna menggunakan Scanner.
+ Membuat objek kelas berdasarkan nama kelas yang dimasukkan.
+ Menginput data mahasiswa satu per satu, termasuk absensinya di setiap pertemuan.
+ Menambahkan data mahasiswa tersebut ke dalam objek kelas.

Setelah selesai, menampilkan rekap kehadiran seluruh mahasiswa.

Alur kerja di Main.java:
1. Program mulai → meminta nama kelas.
2. Membuat objek baru dari class kelas.
3. Meminta jumlah mahasiswa dan jumlah pertemuan.
4. Loop sebanyak jumlah mahasiswa:
   + Input nama dan NPM mahasiswa.
   + Loop sebanyak jumlah pertemuan → input kehadiran (true/false).
   + Buat objek mahasiswa dan simpan data absensinya.
   + Tambahkan mahasiswa ke dalam daftar di objek kelas.
5. Setelah semua data diinput, panggil kelas.tampilkanRekap() untuk menampilkan hasilnya.
-----
b. Kelas.java
File ini berfungsi untuk merepresentasikan data satu kelas, yang berisi:
+ Nama kelas.
+ Daftar mahasiswa yang tergabung di kelas tersebut.

## Fungsi utama di **`Kelas.java()`**

* **`tambahMahasiswa()`**
  Menambahkan objek `Mahasiswa` baru ke dalam daftar kelas.
* **`tampilkanRekap()`**
  Menampilkan tabel rekap kehadiran seluruh mahasiswa dalam kelas, termasuk:
  * Nama mahasiswa
  * NPM
  * Persentase kehadiran
  * Status kelulusan (misalnya jika kehadiran < 75%, maka “TIDAK LULUS”).
---
c. Mahasiswa.java
File ini merepresentasikan satu orang mahasiswa.

**Fungsi utama di `Mahasiswa.java`:**

* **`isiAbsensi(int pertemuan, boolean hadir)`**
  Mengisi data kehadiran mahasiswa untuk pertemuan tertentu.
* **`hitungPersentaseKehadiran()`**
  Menghitung persentase kehadiran dari total pertemuan.
* **`getStatus()`**
  Mengembalikan status kelulusan berdasarkan persentase (contoh: ≥75% = “LULUS”).

---

## Alur Program Keseluruhan

1. **User memasukkan data kelas dan jumlah pertemuan.**
2. **User mengisi data tiap mahasiswa:**
   * Nama & NPM
   * Kehadiran di tiap pertemuan (`true` atau `false`)
3. **Program menghitung persentase kehadiran setiap mahasiswa.**
4. **Program menentukan status “LULUS” atau “TIDAK LULUS”.**
5. **Program menampilkan tabel rekap** yang berisi semua data mahasiswa.

---

  


   
