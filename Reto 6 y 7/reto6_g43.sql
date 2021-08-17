-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 17, 2021 at 02:34 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `reto6_g43`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_cat`
--

CREATE TABLE `tb_cat` (
  `id` int(11) NOT NULL,
  `breed` varchar(50) NOT NULL,
  `id_pet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_cat`
--

INSERT INTO `tb_cat` (`id`, `breed`, `id_pet`) VALUES
(4, 'Gato habana', 6),
(5, 'Gato asher', 7),
(6, 'Gato habana', 8);

-- --------------------------------------------------------

--
-- Table structure for table `tb_doctor`
--

CREATE TABLE `tb_doctor` (
  `id` int(11) NOT NULL,
  `doctor` varchar(30) NOT NULL,
  `document_type` varchar(15) NOT NULL,
  `document` int(11) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `id_hospital` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_doctor`
--

INSERT INTO `tb_doctor` (`id`, `doctor`, `document_type`, `document`, `phone`, `id_hospital`) VALUES
(1, 'Dr. Felipe', 'C.C.', 10538181, '0', 1),
(2, 'Dr. Alejandro', 'C.C.', 10539292, '0', 2),
(3, 'Dr. Esteban', 'C.C.', 10537373, '0', 1),
(4, 'Federico', 'Pasaporte', 10536464, '0', 2),
(5, 'juan felipe', 'C.C.', 1054571033, '129863', 2),
(6, 'Maria', 'C.C.', 30389874, '3140332202', 2),
(12, 'Alexander Bonilla', 'C.C.', 100259823, '312833220', 2),
(13, 'Alexander ', 'C.C.', 100259, '312833', 2),
(14, 'juan felipe lopez', 'C.C.', 1054571044, '3148332101', 5),
(15, 'pedro', 'Pasaporte', 100249286, '120393732', 3),
(16, 'lorenso', 'N.U.I.P', 1029362, '12121212', 2),
(17, 'Dr. Alejandro', 'C.C.', 10539292, '21212', 1),
(18, 'juan felipe rosa', 'C.C.', 1054571, '129863', 5);

-- --------------------------------------------------------

--
-- Table structure for table `tb_dog`
--

CREATE TABLE `tb_dog` (
  `id` int(11) NOT NULL,
  `breed` varchar(50) NOT NULL,
  `pedigree` tinyint(1) NOT NULL DEFAULT 0,
  `id_pet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_dog`
--

INSERT INTO `tb_dog` (`id`, `breed`, `pedigree`, `id_pet`) VALUES
(1, 'Pincher', 1, 1),
(2, 'Boxer', 0, 2),
(3, 'Pincher', 1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `tb_hospital`
--

CREATE TABLE `tb_hospital` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `address` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_hospital`
--

INSERT INTO `tb_hospital` (`id`, `name`, `address`) VALUES
(1, 'San Miguel', 'Calle 5A'),
(2, 'Mascoticas', 'Calle 6B'),
(3, 'San felix', 'carrera 12A'),
(5, 'San lorenzo', 'transversal 2'),
(6, 'margarita', 'carrera 2'),
(7, 'Manizalez', 'Calle 44 # 22-12');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pet`
--

CREATE TABLE `tb_pet` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `breed` varchar(30) NOT NULL,
  `born_year` int(11) NOT NULL,
  `health_state` varchar(50) NOT NULL,
  `id_owner_pet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pet`
--

INSERT INTO `tb_pet` (`id`, `name`, `breed`, `born_year`, `health_state`, `id_owner_pet`) VALUES
(1, 'Juano', 'Bulldog', 2010, 'En hospitalización', 1),
(2, 'Poli', 'Pincher', 2014, 'Cita médica', 8),
(4, 'Choko lila', 'Cocker spaniel', 2018, 'Cita médica', 4),
(6, 'loki', 'Pincher', 2015, 'En laboratorio', 7),
(7, 'conni', 'Pincher', 2014, 'Cita médica', 4),
(8, 'larry', 'Gato habana', 2017, 'Cita médica', 1),
(9, 'milan', 'Pug', 2015, 'En laboratorio', 4),
(10, 'Aemon', 'Bulldog', 2020, 'En hospitalización', 7),
(12, 'juanita', 'Criollo', 2014, 'En control de vacunas', 4),
(13, 'conni lopes', 'Pastor Aleman', 2018, 'En hospitalización', 8),
(14, 'Sofi', 'Bulldog frances', 2017, 'En laboratorio', 4);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pet_hospital`
--

CREATE TABLE `tb_pet_hospital` (
  `id` int(11) NOT NULL,
  `id_pet` int(11) NOT NULL,
  `id_hospital` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pet_hospital`
--

INSERT INTO `tb_pet_hospital` (`id`, `id_pet`, `id_hospital`) VALUES
(1, 1, 2),
(2, 2, 1),
(4, 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pet_owners`
--

CREATE TABLE `tb_pet_owners` (
  `id` int(11) NOT NULL,
  `owner` varchar(100) NOT NULL,
  `document_type` varchar(15) NOT NULL,
  `document` int(15) NOT NULL,
  `contact` int(15) NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pet_owners`
--

INSERT INTO `tb_pet_owners` (`id`, `owner`, `document_type`, `document`, `contact`, `gender`) VALUES
(1, 'Juan', 'C.C.', 10538181, 2147483647, 'Masculino'),
(2, 'Manuel', 'C.C.', 10539292, 12121212, 'Masculino'),
(3, 'Valeria', 'C.E.', 10537373, 2147483647, 'Femenino'),
(4, 'Federico', 'Pasaporte', 10536464, 2147483647, 'Masculino'),
(7, 'Andrey Bonilla', 'C.C.', 10545710, 30543888, 'Masculino'),
(8, 'lola', 'T.I.', 1054571033, 31483322, 'Femenino'),
(9, 'carlos', 'N.U.I.P', 1002581637, 305438754, 'Masculino'),
(11, 'Stiven', 'C.E.', 123456, 8765432, 'Masculino'),
(12, 'Michel bonilla', 'T.I.', 1002581637, 305438757, 'Femenino');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_cat`
--
ALTER TABLE `tb_cat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pet` (`id_pet`);

--
-- Indexes for table `tb_doctor`
--
ALTER TABLE `tb_doctor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_hospital` (`id_hospital`);

--
-- Indexes for table `tb_dog`
--
ALTER TABLE `tb_dog`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pet` (`id_pet`);

--
-- Indexes for table `tb_hospital`
--
ALTER TABLE `tb_hospital`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_pet`
--
ALTER TABLE `tb_pet`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_owner_pet` (`id_owner_pet`);

--
-- Indexes for table `tb_pet_hospital`
--
ALTER TABLE `tb_pet_hospital`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_pet` (`id_pet`),
  ADD KEY `id_hospital` (`id_hospital`);

--
-- Indexes for table `tb_pet_owners`
--
ALTER TABLE `tb_pet_owners`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_cat`
--
ALTER TABLE `tb_cat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tb_doctor`
--
ALTER TABLE `tb_doctor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `tb_dog`
--
ALTER TABLE `tb_dog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_hospital`
--
ALTER TABLE `tb_hospital`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_pet`
--
ALTER TABLE `tb_pet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tb_pet_hospital`
--
ALTER TABLE `tb_pet_hospital`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_pet_owners`
--
ALTER TABLE `tb_pet_owners`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_cat`
--
ALTER TABLE `tb_cat`
  ADD CONSTRAINT `tb_cat_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `tb_pet` (`id`);

--
-- Constraints for table `tb_doctor`
--
ALTER TABLE `tb_doctor`
  ADD CONSTRAINT `tb_doctor_ibfk_1` FOREIGN KEY (`id_hospital`) REFERENCES `tb_hospital` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tb_dog`
--
ALTER TABLE `tb_dog`
  ADD CONSTRAINT `tb_dog_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `tb_pet` (`id`);

--
-- Constraints for table `tb_pet`
--
ALTER TABLE `tb_pet`
  ADD CONSTRAINT `tb_pet_ibfk_1` FOREIGN KEY (`id_owner_pet`) REFERENCES `tb_pet_owners` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tb_pet_hospital`
--
ALTER TABLE `tb_pet_hospital`
  ADD CONSTRAINT `tb_pet_hospital_ibfk_1` FOREIGN KEY (`id_pet`) REFERENCES `tb_pet` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_pet_hospital_ibfk_2` FOREIGN KEY (`id_hospital`) REFERENCES `tb_hospital` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
