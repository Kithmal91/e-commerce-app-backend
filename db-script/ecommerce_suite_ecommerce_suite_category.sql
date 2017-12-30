-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: ecommerce_suite
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ecommerce_suite_category`
--

DROP TABLE IF EXISTS `ecommerce_suite_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ecommerce_suite_category` (
  `category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `main_category` varchar(45) DEFAULT NULL,
  `category_name` varchar(45) DEFAULT NULL,
  `category_description` varchar(255) DEFAULT NULL,
  `category_status` varchar(45) DEFAULT NULL,
  `added_by` varchar(45) DEFAULT NULL,
  `added_date` datetime DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ecommerce_suite_category`
--

LOCK TABLES `ecommerce_suite_category` WRITE;
/*!40000 ALTER TABLE `ecommerce_suite_category` DISABLE KEYS */;
INSERT INTO `ecommerce_suite_category` VALUES (6,'Shirts','Long Sleeve Shirts','Long Sleeves','ACTIVE',NULL,'2017-12-29 15:40:41',NULL,'2017-12-29 15:40:41'),(7,'Trousers','Office Trousers','Office Wear Trousers','ACTIVE',NULL,'2017-12-29 15:52:21',NULL,'2017-12-29 15:52:21'),(8,'Underwears','Box underwears','Box Underwears','ACTIVE',NULL,'2017-12-29 16:33:30',NULL,'2017-12-29 16:33:30');
/*!40000 ALTER TABLE `ecommerce_suite_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-30 19:14:11
