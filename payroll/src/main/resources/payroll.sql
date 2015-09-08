-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 08, 2015 at 10:27 AM
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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `cutoff`
--

INSERT INTO `cutoff` (`id`, `startdate`, `enddate`, `workingdays`) VALUES
(11, '2015-01-09', '2016-03-09', 11),
(12, '2015-01-09', '2016-03-09', 11);

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE IF NOT EXISTS `groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `group_authorities`
--

CREATE TABLE IF NOT EXISTS `group_authorities` (
  `authority` varchar(255) NOT NULL,
  `group_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `group_members`
--

CREATE TABLE IF NOT EXISTS `group_members` (
  `username` varchar(255) NOT NULL,
  `group_id` int(11) NOT NULL,
  `group_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(2, 'Valen', 'Barcinal', '', 22, 'male', '2015-09-01', 'single', 1, 20000, 0, 5000, 8, 10),
(3, 'Nick', 'Tunac', '', 18, 'Male', '2015-01-09', 'Single', 0, 1111, 2222, 444, 4, 10);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `usercutoff`
--

INSERT INTO `usercutoff` (`id`, `cutoffid`, `userid`, `absence`, `overtime`, `tardiness`, `sss`, `pagibig`, `philhealth`, `basicsalary`, `othertaxable`, `nontaxable`, `numberofdependents`, `totalsalary`, `sickleave`, `vacationleave`) VALUES
(19, 11, 2, 1, 8, 7, 290.65, 200, 218.75, 10000, 0, 2500, 4, 11079.77181818182, 2, 0),
(21, 12, 2, 0, 0, 0, 290.65, 200, 218.75, 10000, 0, 2500, 1, 10769.95, 0, 0),
(22, 12, 3, 0, 0, 0, 18.15, 11.11, 50, 555.5, 1111, 222, 0, 1809.24, 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
