/*
SQLyog v10.2 
MySQL - 5.0.96-community-nt : Database - vodadmin
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vodadmin` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `vodadmin`;

/*Table structure for table `chapter` */

DROP TABLE IF EXISTS `chapter`;

CREATE TABLE `chapter` (
  `chapterID` int(11) NOT NULL,
  `cClick` int(11) default NULL,
  `cCount` int(11) default NULL,
  `cDescript` varchar(255) default NULL,
  `cImg` varchar(255) default NULL,
  `cName` varchar(255) default NULL,
  `cTeacher` varchar(255) default NULL,
  `cTurn` int(11) default NULL,
  `courseID` int(11) default NULL,
  PRIMARY KEY  (`chapterID`),
  KEY `FK2C0C7C4D91FC7999` (`courseID`),
  CONSTRAINT `FK2C0C7C4D91FC7999` FOREIGN KEY (`courseID`) REFERENCES `course` (`courseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chapter` */

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `courseID` int(11) NOT NULL,
  `cClick` int(11) default NULL,
  `courseDescript` varchar(255) default NULL,
  `courseName` varchar(255) default NULL,
  PRIMARY KEY  (`courseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`courseID`,`cClick`,`courseDescript`,`courseName`) values (1,0,'555555','啦啦啦啦'),(2,0,'as大苏打','阿斯达斯的');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `roleID` int(11) NOT NULL,
  `despripe` varchar(255) default NULL,
  `roleCode` varchar(255) default NULL,
  PRIMARY KEY  (`roleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`roleID`,`despripe`,`roleCode`) values (1,NULL,'ROLE_USER');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `uID` int(11) NOT NULL,
  `logcheck` tinyint(1) NOT NULL,
  `passWord` varchar(255) default NULL,
  `studyTime` int(11) default NULL,
  `uClass` varchar(255) default NULL,
  `uDepartment` varchar(255) default NULL,
  `uName` varchar(255) default NULL,
  `uPingYing` varchar(255) default NULL,
  `uSpecialty` varchar(255) default NULL,
  `userName` varchar(255) default NULL,
  PRIMARY KEY  (`uID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`uID`,`logcheck`,`passWord`,`studyTime`,`uClass`,`uDepartment`,`uName`,`uPingYing`,`uSpecialty`,`userName`) values (1,127,'123456',1020,'110','110','110','110','110','user');

/*Table structure for table `student_role` */

DROP TABLE IF EXISTS `student_role`;

CREATE TABLE `student_role` (
  `uID` int(11) NOT NULL,
  `roleID` int(11) NOT NULL,
  KEY `FKFEE0E3FAAD1AE083` (`uID`),
  KEY `FKFEE0E3FA3931318F` (`roleID`),
  CONSTRAINT `FKFEE0E3FA3931318F` FOREIGN KEY (`roleID`) REFERENCES `role` (`roleID`),
  CONSTRAINT `FKFEE0E3FAAD1AE083` FOREIGN KEY (`uID`) REFERENCES `student` (`uID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
