-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 04, 2015 at 08:44 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `payroll`
--

-- --------------------------------------------------------

--
-- Table structure for table `cutoff`
--

CREATE TABLE IF NOT EXISTS `cutoff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  `workingdays` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `middlename` varchar(100) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `dateofbirth` date NOT NULL,
  `maritalstatus` varchar(100) NOT NULL,
  `numberofdependents` int(11) NOT NULL,
  `basicsalary` double NOT NULL,
  `othertaxable` double NOT NULL,
  `nontaxable` double NOT NULL,
  `sickleave` int(11) NOT NULL,
  `vacationleave` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstname`, `lastname`, `middlename`, `age`, `sex`, `dateofbirth`, `maritalstatus`, `numberofdependents`, `basicsalary`, `othertaxable`, `nontaxable`, `sickleave`, `vacationleave`) VALUES
(2, 'Valen', 'Barcinal', '', 22, 'male', '2015-09-01', 'single', 1, 20000, 0, 5000, 10, 10),
(3, 'Nick', 'Tunac', '', 18, 'Male', '2015-01-09', 'Single', 0, 1111, 2222, 444, 10, 10);

-- --------------------------------------------------------

--
-- Table structure for table `usercutoff`
--

CREATE TABLE IF NOT EXISTS `usercutoff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cutoffid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `absence` int(11) NOT NULL,
  `overtime` float NOT NULL,
  `tardiness` float NOT NULL,
  `sss` double NOT NULL,
  `pagibig` double NOT NULL,
  `philhealth` double NOT NULL,
  `basicsalary` double NOT NULL,
  `othertaxable` double NOT NULL,
  `nontaxable` double NOT NULL,
  `numberofdependents` int(11) NOT NULL,
  `totalsalary` double NOT NULL,
  `sickleave` int(11) NOT NULL,
  `vacationleave` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
