# Program Evaluasi Akademik Mahasiswa
Program ini adalah sebuah aplikasi sederhana yang memungkinkan mahasiswa untuk mengelola nilai-nilai evaluasi mereka dalam sebuah mata kuliah. Dengan program ini, mahasiswa dapat memasukkan dan melihat nilai-nilai dari beberapa jenis evaluasi seperti quiz, latihan soal, serta UTS dan UAS.

## Fitur Utama
Input Nilai: Mahasiswa dapat memasukkan nilai dari beberapa jenis evaluasi sesuai dengan pertemuan atau jenis ujian.
Tampilan Nilai: Program menampilkan nilai-nilai evaluasi yang telah dimasukkan oleh mahasiswa.
Perhitungan Grade: Untuk nilai UTS dan UAS, program memberikan peringkat grade berdasarkan rentang nilai tertentu.

## Persiapan
Pastikan untuk memiliki lingkungan pengembangan Java yang terpasang di perangkat Anda sebelum menjalankan program ini.

## Cara Menggunakan
Menjalankan Program: Buka program dalam lingkungan pengembangan Java atau IDE, kemudian jalankan kelas Main.
Input Data: Ikuti instruksi yang ditampilkan di layar untuk memasukkan nama, NPM, dan nilai-nilai evaluasi.
Pilih Operasi: Pilih salah satu opsi untuk menampilkan jenis nilai evaluasi yang diinginkan atau keluar dari program.

## Struktur Program
Main Class: Mengelola interaksi dengan pengguna dan menyediakan pilihan untuk menampilkan nilai evaluasi.
Evaluasi (Evaluation): Kelas abstrak yang menjadi dasar untuk jenis-jenis evaluasi seperti quiz, latihan, dan UTS/UAS.
Quiz, Latihan, Grade (Concrete Classes): Implementasi dari jenis-jenis evaluasi yang spesifik.
Operasi Penilaian (EvaluationOperations Interface): Mengatur operasi yang harus diimplementasikan oleh kelas evaluasi.

### Cara Kontribusi
Jika Anda ingin berkontribusi pada proyek ini, Anda dapat melakukan fork pada repositori ini. Silakan kirimkan pull request dengan perubahan yang Anda usulkan.

### Catatan
Program ini dikembangkan sebagai proyek latihan untuk memahami konsep pemrograman berorientasi objek dan interaksi dengan pengguna melalui terminal.
