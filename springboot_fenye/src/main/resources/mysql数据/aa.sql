/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.62-community : Database - library
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `library`;

/*Table structure for table `ebook_category` */

DROP TABLE IF EXISTS `ebook_category`;

CREATE TABLE `ebook_category` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `ebook_category` */

insert  into `ebook_category`(`id`,`name`) values (1,'科学'),(2,'历史'),(3,'地理'),(4,'生物'),(5,'化学'),(6,'语文'),(7,'英语'),(8,'计算机');

/*Table structure for table `ebook_entry` */

DROP TABLE IF EXISTS `ebook_entry`;

CREATE TABLE `ebook_entry` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自动增长属性赋值',
  `categoryId` int(10) NOT NULL COMMENT '对应分类表的主键',
  `tilte` varchar(50) NOT NULL,
  `summary` varchar(50) DEFAULT NULL,
  `uploaduser` varchar(50) DEFAULT NULL,
  `createdate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `ebook_entry` */

insert  into `ebook_entry`(`id`,`categoryId`,`tilte`,`summary`,`uploaduser`,`createdate`) values (1,2,'中华上下五千年','历史文化','李云龙','2019-09-27'),(2,1,'行为生物科学','行为科学','丁伟','2019-09-27'),(3,5,'化学的魅力','氯化钠','孔捷','2019-09-27'),(4,3,'红高粱','刘慈欣','小张','2019-09-02');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) DEFAULT NULL,
  `COUNT` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`id`,`NAME`,`COUNT`,`price`) values (1,'电视机',100,2000),(2,'洗衣机',200,1000),(3,'空调',300,3000),(4,'投影仪',50,2000),(5,'HP电脑',1000,4000),(6,'苹果手机',100,5000),(7,'缝纫机',60,2000),(8,'小米盒子',100,2200),(9,'饮水机',300,2000),(10,'净水器',200,2000),(11,'电暖器',500,2000),(12,'榨汁机',100,399),(13,'电压力锅',200,498),(14,'电饭煲',300,299),(15,'微波炉',50,1299),(16,'豆浆机',200,199),(17,'电磁炉',300,398),(18,'加湿器',500,99),(19,'剃须刀',250,98),(20,'舒肤佳',1000,16.5),(21,'雕牌',1200,8.8),(22,'立白',1500,9.9);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
