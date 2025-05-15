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
-- Table structure for table `materiales_empaque`
--

DROP TABLE IF EXISTS `materiales_empaque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiales_empaque` (
  `idMateriales_Empaque` int NOT NULL AUTO_INCREMENT,
  `ME_Nombre` varchar(45) DEFAULT NULL,
  `ME_Cantidad` int DEFAULT '0',
  `ME_TipoMaterial` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idMateriales_Empaque`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiales_empaque`
--

LOCK TABLES `materiales_empaque` WRITE;
/*!40000 ALTER TABLE `materiales_empaque` DISABLE KEYS */;
INSERT INTO `materiales_empaque` VALUES (1,'Bolsa chica',500,'Papel'),(2,'Bolsa mediana',500,'Papel'),(3,'Bolsa grande',500,'Papel'),(4,'Bolsa chica',700,'Plástico'),(5,'Bolsa grande',700,'Plástico'),(6,'Cinta adhesiva',3,'Plástico'),(7,'Polipapel',10,'Plástico'),(8,'Caja de huevo',50,'Cartón'),(9,'Caja blanca',20,'Plático'),(10,'Caja bimbo',15,'Plástico');
/*!40000 ALTER TABLE `materiales_empaque` ENABLE KEYS */;
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
