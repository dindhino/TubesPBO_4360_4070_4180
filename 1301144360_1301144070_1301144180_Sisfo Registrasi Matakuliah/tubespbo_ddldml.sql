-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2016 at 06:16 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubespbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `name` varchar(100) NOT NULL,
  `tipe` varchar(100) NOT NULL,
  `nip` bigint(20) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`name`, `tipe`, `nip`, `username`, `password`) VALUES
('Dini', 'Dosen', 1301144070, 'DSN1301144070', '1301144070'),
('Zulfikar', 'Dosen', 1301144180, 'DSN1301144180', '1301144180');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `matakuliah` varchar(200) NOT NULL,
  `dosen` varchar(200) NOT NULL,
  `namakelas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`matakuliah`, `dosen`, `namakelas`) VALUES
('', '', 'IF-38-01'),
('', '', 'IF-38-02'),
('', '', 'IF-38-03'),
('', '', 'IF-38-04'),
('', '', 'IF-38-05');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `name` varchar(100) NOT NULL,
  `tipe` varchar(100) NOT NULL,
  `nim` bigint(20) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`name`, `tipe`, `nim`, `username`, `password`) VALUES
('Dhino', 'Mahasiswa', 1301144360, 'MHS1301144360', '1301144360');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kodemk` varchar(50) NOT NULL,
  `namamk` varchar(100) NOT NULL,
  `dosenpengampu` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`kodemk`, `namamk`, `dosenpengampu`) VALUES
('ASD', 'ALGORITMA DAN STRUKTUR DATA', ''),
('BDR', 'BASIS DATA RELASIONAL', ''),
('DAP', 'DASAR ALGORITMA DAN PEMROGRAMAN', ''),
('PBO', 'PEMROGRAMAN BERORIENTASI OBJEK', ''),
('RPL', 'REKAYASA PERANGKAT LUNAK', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`namakelas`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kodemk`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
