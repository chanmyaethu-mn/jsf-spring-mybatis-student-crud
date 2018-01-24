/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.7.11-log : Database - students
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`students` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `students`;

/*Table structure for table `student_record` */

DROP TABLE IF EXISTS `student_record`;

CREATE TABLE `student_record` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(100) DEFAULT NULL,
  `student_email` varchar(50) DEFAULT NULL,
  `student_password` varchar(20) DEFAULT NULL,
  `student_gender` varchar(1) DEFAULT NULL,
  `student_address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `student_record` */

insert  into `student_record`(`student_id`,`student_name`,`student_email`,`student_password`,`student_gender`,`student_address`) values (1,'John','john@jcg.com','access@123','M','America'),(2,'Monica','monica@jcg.com','access@123','F','Iceland'),(3,'Raymond','raymond@jcg.com','access@123','M','Greece'),(4,'Jane','jane@jcg.com','access@123','F','Norway'),(5,'Rachel','rachel@jcg.com','access@123','F','France'),(6,'May','may2017@gmail.com','access@123','M','Finland');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
