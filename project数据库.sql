/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.1.73-community : Database - equip
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`equip` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `equip`;

/*Table structure for table `borrow` */

DROP TABLE IF EXISTS `borrow`;

CREATE TABLE `borrow` (
  `unitno` varchar(255) NOT NULL,
  `unitname` varchar(255) NOT NULL,
  `ID` varchar(255) NOT NULL,
  `recipients` varchar(255) NOT NULL,
  `money` varchar(255) NOT NULL,
  `researchno` varchar(255) NOT NULL,
  `brokerage` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `borrow_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `equipment` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `borrow` */

insert  into `borrow`(`unitno`,`unitname`,`ID`,`recipients`,`money`,`researchno`,`brokerage`) values ('051407','服务计算','201411080001','qiuhui','学习','0001','zhangsan'),('unit01','容错计算','201411120004','邱慧','学习','0023','三胖');

/*Table structure for table `borrowbyuser` */

DROP TABLE IF EXISTS `borrowbyuser`;

CREATE TABLE `borrowbyuser` (
  `borrowman` varchar(255) NOT NULL,
  `profession` varchar(255) NOT NULL,
  `ID` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  `agree` varchar(255) NOT NULL,
  KEY `ID` (`ID`),
  CONSTRAINT `borrowbyuser_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `equipment` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `borrowbyuser` */

insert  into `borrowbyuser`(`borrowman`,`profession`,`ID`,`name`,`time`,`agree`) values ('qq','qq','201411120003','电脑','2013.3.3','0'),('1','1','201411080001','电脑','2014.4.4','0'),('2','2','201411120004','鼠标','2','0');

/*Table structure for table `broken` */

DROP TABLE IF EXISTS `broken`;

CREATE TABLE `broken` (
  `brokeman` varchar(255) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `ID` varchar(255) NOT NULL,
  `brokename` varchar(255) NOT NULL,
  `approval` varchar(255) NOT NULL,
  `broketime` varchar(255) NOT NULL,
  `brokemoney` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `broken_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `equipment` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `broken` */

insert  into `broken`(`brokeman`,`reason`,`ID`,`brokename`,`approval`,`broketime`,`brokemoney`) values ('qiuhui','砸坏','201411080001','电脑','证明','2014.4.4','2000'),('1','1','201411120002','电脑','1','1','1');

/*Table structure for table `equipment` */

DROP TABLE IF EXISTS `equipment`;

CREATE TABLE `equipment` (
  `ID` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `model` varchar(255) NOT NULL,
  `spec` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `vender` varchar(255) NOT NULL,
  `serialnumber` varchar(255) NOT NULL,
  `buydate` varchar(255) NOT NULL,
  `outdate` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `equipment` */

insert  into `equipment`(`ID`,`name`,`model`,`spec`,`price`,`vender`,`serialnumber`,`buydate`,`outdate`,`location`) values ('201411080001','电脑','FR200/300','数据处理',4000,'惠普','0000','2013年3月','2012年3月','实验室'),('201411120002','电脑','rea','数据处理',3500,'戴尔','0001','2014年7月','2011年7月','教室'),('201411120003','电脑','fr200/333','数据处理',10000,'苹果','0345','2013年6月','2012年1月','教室'),('201411120004','鼠标','eww','大型游戏鼠标',100,'戴尔','0002','2010年7月','2011年6月','实验室'),('201411130005','键盘','eee','游戏键盘',99,'小米','0002','2013年9月','2013年8月','寝室'),('201411180006','手机','ert','通话',4000,'apple','6666','2005年1月','2005年1月','实验室');

/*Table structure for table `lost` */

DROP TABLE IF EXISTS `lost`;

CREATE TABLE `lost` (
  `lostman` varchar(255) NOT NULL,
  `ID` varchar(255) NOT NULL,
  `lostname` varchar(255) NOT NULL,
  `losttime` varchar(255) NOT NULL,
  `approval` varchar(255) NOT NULL,
  `lostmoney` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `lost_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `equipment` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `lost` */

insert  into `lost`(`lostman`,`ID`,`lostname`,`losttime`,`approval`,`lostmoney`) values ('qiuhui','201411080001','电脑','2013.4.4','证明','3000'),('三胖','201411120003','电脑','2013.3.3','朝鲜','10000'),('123','201411130005','键盘','2014.5.6','证明','100000');

/*Table structure for table `move` */

DROP TABLE IF EXISTS `move`;

CREATE TABLE `move` (
  `ID` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `from` varchar(255) NOT NULL,
  `to` varchar(255) NOT NULL,
  `moveman` varchar(255) NOT NULL,
  `recieveman` varchar(255) NOT NULL,
  `approval` varchar(255) NOT NULL,
  `movedate` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `move_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `equipment` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `move` */

insert  into `move`(`ID`,`name`,`from`,`to`,`moveman`,`recieveman`,`approval`,`movedate`) values ('201411080001','电脑','实验室','寝室','qiuhui','zhangsan','证明','2014.4.4'),('201411120002','电脑','寝室','教室','1','1','1','1'),('201411120003','电脑','实验室','教室','二娃子','李四','approval','2013.3.3'),('201411120004','鼠标','寝室','实验室','李四','三胖','呵呵','2014.5.6'),('201411180006','手机','家里','实验室','张三','李四','王五','2013.3.5');

/*Table structure for table `number` */

DROP TABLE IF EXISTS `number`;

CREATE TABLE `number` (
  `n` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `number` */

insert  into `number`(`n`) values (7);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `isadmin` int(11) NOT NULL,
  `isedit` int(11) NOT NULL,
  `isuser` int(11) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `user` */

insert  into `user`(`username`,`password`,`sex`,`country`,`email`,`isadmin`,`isedit`,`isuser`) values ('1','1','1','1','1',0,0,1),('2','2','2','2','2',0,1,0),('qh','qh','男','china','947466871@qq.com',1,0,0),('qiuhui','qiuhui','男','china','123@qq.com',0,1,0),('qq','qq','男','china','1@qq.com',0,0,1),('qqq','qqq','qqq','qqq','qqq',0,0,1),('zhangsan','zhangsan','男','china','1@qq.com',0,0,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
