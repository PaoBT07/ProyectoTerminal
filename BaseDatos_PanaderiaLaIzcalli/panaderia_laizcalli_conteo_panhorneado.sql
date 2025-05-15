-- MySQL dump 10.13  Distrib 9.1.0, for Win64 (x86_64)
--
-- Host: localhost    Database: panaderia_laizcalli
-- ------------------------------------------------------
-- Server version	9.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `conteo_panhorneado`
--

DROP TABLE IF EXISTS `conteo_panhorneado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conteo_panhorneado` (
  `idConteo_PanHorneado` int NOT NULL AUTO_INCREMENT,
  `CPH_Fecha` date DEFAULT '2025-05-14',
  `CPH_TotalPiezasPB` int DEFAULT '0',
  `CPH_TotalPiezasPD` int DEFAULT '0',
  PRIMARY KEY (`idConteo_PanHorneado`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conteo_panhorneado`
--

LOCK TABLES `conteo_panhorneado` WRITE;
/*!40000 ALTER TABLE `conteo_panhorneado` DISABLE KEYS */;
INSERT INTO `conteo_panhorneado` VALUES (1,'2025-03-25',1500,1250),(2,'2025-03-25',23,656),(3,'2025-03-26',1265,154),(4,'2025-03-26',10,20),(5,'2025-03-26',1245,40),(6,'2025-03-26',423,4041),(7,'2025-03-26',4278,4224),(8,'2025-03-26',4,422414),(9,'2025-03-26',441,6353),(10,'2025-03-26',25742,57),(11,'2025-03-26',42,57242),(12,'2025-03-26',242,444222),(13,'2025-03-26',2,444222),(14,'2025-04-23',15623,156),(15,'2025-04-23',120,15),(16,'2025-05-08',50,70),(17,'2025-05-12',8,8);
/*!40000 ALTER TABLE `conteo_panhorneado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-15 17:29:26
