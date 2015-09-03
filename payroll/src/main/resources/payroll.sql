-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 03, 2015 at 01:09 PM
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `usercutoff`
--

INSERT INTO `usercutoff` (`id`, `cutoffid`, `userid`, `absence`, `overtime`, `tardiness`, `sss`, `pagibig`, `philhealth`, `basicsalary`, `othertaxable`, `nontaxable`, `numberofdependents`, `totalsalary`) VALUES
(3, 3, 2, 0, 0, 0, 0, 0, 0, 20000, 0, 5000, 1, 0),
(4, 3, 3, 0, 0, 0, 0, 0, 0, 1111, 2222, 444, 0, 0),
(5, 4, 2, 0, 0, 0, 0, 0, 0, 20000, 0, 5000, 1, 0),
(6, 4, 3, 0, 0, 0, 0, 0, 0, 1111, 2222, 444, 0, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
