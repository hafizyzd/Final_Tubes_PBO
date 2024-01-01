-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2024 at 02:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mytubes1`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `kode_admin` int(12) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` int(25) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`kode_admin`, `nama`, `username`, `password`, `email`, `role`) VALUES
(11, 'alex', 'alex1', 1234, 'admin1@email.com', 'admin'),
(22, 'rossi', 'rossi2', 1234, 'admin2@email.com', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `nama` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`nama`, `username`, `password`) VALUES
('dadang sudarmawan', 'dadang', 321),
('kak salsa', 'salsa', 123);

-- --------------------------------------------------------

--
-- Table structure for table `table_dosen`
--

CREATE TABLE `table_dosen` (
  `nip` int(12) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(15) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` int(25) DEFAULT NULL,
  `role` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_dosen`
--

INSERT INTO `table_dosen` (`nip`, `nama`, `username`, `email`, `password`, `role`) VALUES
(123, 'jhon', 'jhoncena', 'jhon@gmai.com', 123, 'dosen');

-- --------------------------------------------------------

--
-- Table structure for table `table_mahasiswa`
--

CREATE TABLE `table_mahasiswa` (
  `nim` int(12) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` int(25) DEFAULT NULL,
  `role` varchar(25) NOT NULL,
  `notif` varchar(255) DEFAULT NULL,
  `nilai_bd` int(11) DEFAULT NULL,
  `nilai_jre` int(11) DEFAULT NULL,
  `nilai_pbo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_mahasiswa`
--

INSERT INTO `table_mahasiswa` (`nim`, `nama`, `username`, `email`, `password`, `role`, `notif`, `nilai_bd`, `nilai_jre`, `nilai_pbo`) VALUES
(1303210006, 'irfan zhara', 'irfanzhr', 'irfan@gmail.com', 123, 'mahasiswa', 'hallo agenda perkuliahan hari ini', 30, 0, 10),
(1303210145, 'frans', 'fransiskus', 'kucinggarong@gmail', 123, 'mahasiswa', 'bayar parkir', 10, 0, 0),
(1303210135, 'lendra', 'lendraaz', 'lendra@gmail.com', 123, 'mahasiswa', 'assalamuallaikum', 20, 50, 99),
(1303213063, 'rafi', 'mhdrafi', 'rafi@gmail.com', 123, 'mahasiswa', 'dl besok', 30, 60, 0),
(1303213026, 'yazidd', 'yazidmhd', 'yazid@gmail.com', 123, 'mahasiswa', 'Semangat ya', 30, 60, 20);

-- --------------------------------------------------------

--
-- Table structure for table `table_quiz`
--

CREATE TABLE `table_quiz` (
  `id` int(11) NOT NULL,
  `matakuliah` varchar(255) NOT NULL,
  `soal` varchar(255) NOT NULL,
  `pilihan1` varchar(250) NOT NULL,
  `pilihan2` varchar(250) NOT NULL,
  `pilihan3` varchar(250) NOT NULL,
  `pilihan4` varchar(250) NOT NULL,
  `jawaban` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `table_quiz`
--

INSERT INTO `table_quiz` (`id`, `matakuliah`, `soal`, `pilihan1`, `pilihan2`, `pilihan3`, `pilihan4`, `jawaban`) VALUES
(2, 'Jaringan Enterprise', 'Apa yang dimaksud dengan jaringan enterprise?', 'Jaringan komputer yang digunakan untuk bermain game online.', 'Jaringan yang hanya terbatas untuk penggunaan pribadi di rumah.', 'Infrastruktur jaringan yang dirancang untuk memenuhi kebutuhan bisnis skala besar.', 'Jaringan sosial yang digunakan untuk berinteraksi dengan teman dan keluarga.', ' Infrastruktur jaringan yang dirancang untuk memenuhi kebutuhan bisnis skala besar.'),
(3, 'Basis Data', 'Apa itu basis data', 'Kumpulan data yang disimpan dalam file teks', 'Kumpulan informasi yang terorganisir dalam satu lokasi untuk pengelolaan efisien', 'Kumpulan perintah SQL untuk manipulasi data', 'Program komputer untuk menyimpan file-file data', 'Kumpulan perintah SQL untuk manipulasi data'),
(4, 'Basis Data', 'Apa perbedaan antara basis data SQL dan NoSQL?', 'SQL menggunakan bahasa query terstruktur, sedangkan NoSQL menggunakan query tanpa struktur', 'SQL hanya cocok untuk data terstruktur, sedangkan NoSQL cocok untuk data terstruktur dan tidak terstruktur', 'SQL hanya dapat digunakan pada server berbasis Windows, sedangkan NoSQL dapat digunakan di berbagai platform', 'SQL memiliki batasan skala yang lebih besar dibandingkan NoSQL', 'SQL hanya cocok untuk data terstruktur, sedangkan NoSQL cocok untuk data terstruktur dan tidak terstruktur'),
(5, 'Basis Data', 'Tuliskan query SQL untuk mendapatkan total jumlah penjualan (sum) untuk setiap produk.', 'SELECT Produk, COUNT(Jumlah) FROM Penjualan GROUP BY Produk;', 'SELECT Produk, AVG(Jumlah) FROM Penjualan GROUP BY Produk;', 'SELECT Produk, MAX(Jumlah) FROM Penjualan GROUP BY Produk;', 'SELECT Produk, SUM(Jumlah) FROM Penjualan GROUP BY Produk;', 'SELECT Produk, SUM(Jumlah) FROM Penjualan GROUP BY Produk;'),
(6, 'Object Oriented Programming', 'Apa kepanjangan dari \"OOP\" dalam Pemrograman Komputer?', 'Object-Oriented Programming', 'Object-Oriented Processing', 'Object-Oriented Protocol', 'Object-Oriented Prototype', 'Object-Oriented Programming'),
(7, 'Obejct Oriented Programing', 'Dalam konsep OOP, apa yang dimaksud dengan \"inheritance\"?', 'Proses membuat objek baru dari kelas yang sudah ada', 'Proses menyimpan data pada objek', 'Proses mewarisi sifat-sifat kelas ke kelas lain', 'Proses mengubah nilai atribut objek', 'Proses mewarisi sifat-sifat kelas ke kelas lain'),
(8, 'Object Oriented Programming', 'Apa tujuan dari \"encapsulation\" dalam OOP?', 'Memisahkan objek menjadi beberapa bagian', 'Menyembunyikan detail implementasi objek', 'Menggabungkan dua kelas menjadi satu', 'Menyimpan data dalam suatu objek', 'Menyembunyikan detail implementasi objek'),
(9, 'Object Oriented Programming', 'Apa yang dimaksud dengan \"polymorphism\" dalam konteks OOP?', 'Kemampuan suatu objek untuk memiliki banyak bentuk', 'Penggunaan hanya satu tipe data dalam program', 'Proses membatasi akses ke atribut objek', 'Kemampuan suatu objek untuk berkomunikasi dengan objek lain', 'Kemampuan suatu objek untuk memiliki banyak bentuk'),
(10, 'Object Oriented Programming', 'Dalam OOP, apa yang dimaksud dengan \"class\"?', 'Instance dari suatu objek', 'Blueprint untuk membuat objek', 'Tipe data primitif', 'Sebuah metode dalam suatu program', 'Blueprint untuk membuat objek'),
(11, 'Jaringan Enterprise', 'Apa yang dimaksud dengan VLAN dalam jaringan enterprise?', 'Virtual Local Area Network', 'Very Large Area Network', 'Variable Local Access Network', 'Visual Local Authentication Network', 'Virtual Local Area Network'),
(12, 'Jaringan Enterprise', ' Protokol yang umum digunakan untuk mengamankan komunikasi di jaringan enterprise adalah?', 'HTTP', 'FTP', 'UDP', 'SSL/TLS', 'SSL/TLS'),
(13, 'Jaringan Enterprise', 'Apa fungsi dari firewall dalam jaringan enterprise?', 'Mempercepat koneksi internet', 'Melindungi jaringan dari serangan dan akses tidak sah', 'Meningkatkan bandwidth', 'Mengelola basis data', 'Melindungi jaringan dari serangan dan akses tidak sah'),
(14, 'Jaringan Enterprise', 'Komponen jaringan yang bertugas mengalirkan data di antara dua subnet adalah?', 'Router', 'Switch', 'Hub', 'Modem', 'Router'),
(15, 'Jaringan Enterprise', 'Apa perbedaan antara VPN (Virtual Private Network) dan VLAN (Virtual Local Area Network)?', 'Lokasi geografis', 'Fungsi keamanan', 'Jenis perangkat yang digunakan', 'Tingkat kecepatan transfer data', 'Lokasi geografis'),
(16, 'Jaringan Enterprise', 'Apa yang dimaksud dengan QoS (Quality of Service) dalam konteks jaringan enterprise?', 'Kualitas pelayanan yang ditawarkan oleh penyedia internet', 'Kualitas koneksi jaringan dalam waktu nyata', 'Kuantitas sumber daya yang tersedia di jaringan', 'Kuantitas data yang dapat ditransfer dalam satu waktu', 'Kualitas koneksi jaringan dalam waktu nyata'),
(17, 'Basis Data', 'Apa konsep utama dari normalisasi dalam desain basis data?', 'Mengurangi redundansi data dan meningkatkan integritas', 'Menambahkan lebih banyak data untuk meningkatkan kapasitas basis data', 'Mengenkripsi semua data untuk keamanan tinggi', 'Menyimpan semua data dalam satu tabel untuk kepraktisan', 'Mengurangi redundansi data dan meningkatkan integritas'),
(18, 'Basis Data', 'Apa perbedaan antara pernyataan SELECT dan pernyataan INSERT dalam SQL?', 'Pernyataan SELECT digunakan untuk menyisipkan data ke dalam tabel, sedangkan pernyataan INSERT digunakan untuk menampilkan data.', 'Pernyataan SELECT digunakan untuk mengambil data dari tabel, sedangkan pernyataan INSERT digunakan untuk memasukkan data baru ke dalam tabel.', 'Pernyataan SELECT hanya dapat digunakan untuk mengambil data dari satu tabel, sedangkan pernyataan INSERT dapat digunakan untuk mengambil data dari beberapa tabel.', 'Pernyataan SELECT dan pernyataan INSERT memiliki fungsi yang sama dalam SQL.', 'Pernyataan SELECT digunakan untuk mengambil data dari tabel, sedangkan pernyataan INSERT digunakan untuk memasukkan data baru ke dalam tabel.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`kode_admin`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `table_dosen`
--
ALTER TABLE `table_dosen`
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `nip` (`nip`);

--
-- Indexes for table `table_mahasiswa`
--
ALTER TABLE `table_mahasiswa`
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `nim` (`nim`);

--
-- Indexes for table `table_quiz`
--
ALTER TABLE `table_quiz`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `table_quiz`
--
ALTER TABLE `table_quiz`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
