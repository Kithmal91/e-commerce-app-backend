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
-- Table structure for table `ecommerce_suite_item`
--

DROP TABLE IF EXISTS `ecommerce_suite_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ecommerce_suite_item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) DEFAULT NULL,
  `item_quantity` int(11) DEFAULT NULL,
  `item_retail_price` decimal(10,0) DEFAULT NULL,
  `item_width` decimal(10,0) DEFAULT NULL,
  `item_height` decimal(10,0) DEFAULT NULL,
  `item_weight` decimal(10,0) DEFAULT NULL,
  `item_reference_id` varchar(45) DEFAULT NULL,
  `item_image_reference` varchar(45) DEFAULT NULL,
  `item_status` varchar(45) DEFAULT NULL,
  `item_description` varchar(45) DEFAULT NULL,
  `added_by` varchar(45) DEFAULT NULL,
  `added_date` datetime DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FKta791f23lhtm8isqsafj3e67h` (`category_id`),
  CONSTRAINT `FKta791f23lhtm8isqsafj3e67h` FOREIGN KEY (`category_id`) REFERENCES `ecommerce_suite_category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ecommerce_suite_item`
--

LOCK TABLES `ecommerce_suite_item` WRITE;
/*!40000 ALTER TABLE `ecommerce_suite_item` DISABLE KEYS */;
INSERT INTO `ecommerce_suite_item` VALUES (2,'POLO',1,100,5,10,5,'REF001','IMG001','ACTIVE','POLO Tshirts',NULL,'2017-12-29 18:39:15',NULL,'2017-12-29 18:39:15',6),(3,'RALPH',1,100,5,10,5,'REF002','IMG002','ACTIVE','RALPH Trousers',NULL,'2017-12-29 18:58:21',NULL,'2017-12-29 18:58:21',7),(4,'Giordano',1,150,5,10,5,'REF003','IMG003','ACTIVE','Giordano Tshirts',NULL,'2017-12-29 19:27:13',NULL,'2017-12-29 19:27:13',6);
/*!40000 ALTER TABLE `ecommerce_suite_item` ENABLE KEYS */;
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
