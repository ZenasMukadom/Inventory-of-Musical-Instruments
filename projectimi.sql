-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2018 at 06:32 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectimi`
--

-- --------------------------------------------------------

--
-- Table structure for table `instruments`
--

CREATE TABLE `instruments` (
  `ID` int(11) NOT NULL,
  `Family Name` varchar(255) NOT NULL,
  `Brand Name` varchar(255) NOT NULL,
  `Model Name` varchar(255) NOT NULL,
  `Price` varchar(50) NOT NULL,
  `Shop Name` varchar(255) NOT NULL,
  `Shop Location` varchar(255) NOT NULL,
  `Availability` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instruments`
--

INSERT INTO `instruments` (`ID`, `Family Name`, `Brand Name`, `Model Name`, `Price`, `Shop Name`, `Shop Location`, `Availability`) VALUES
(1, 'Guitar', 'Fender', 'Stratocaster', '20000', 'Furtados', 'Mumbai', '6');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `instruments`
--
ALTER TABLE `instruments`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
