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
-- Table structure for table `cliente_diasreparto`
--

DROP TABLE IF EXISTS `cliente_diasreparto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_diasreparto` (
  `idCliente_DiasReparto` int NOT NULL AUTO_INCREMENT,
  `CDR_IDClienteReparto` int DEFAULT '1',
  `CDR_IDDiasReparto` int DEFAULT '1',
  PRIMARY KEY (`idCliente_DiasReparto`),
  KEY `idClienteReparto_idx` (`CDR_IDClienteReparto`),
  KEY `idDiasReparto_idx` (`CDR_IDDiasReparto`),
  CONSTRAINT `idClienteR` FOREIGN KEY (`CDR_IDClienteReparto`) REFERENCES `clientereparto` (`idClienteReparto`) ON UPDATE CASCADE,
  CONSTRAINT `idDiasReparto` FOREIGN KEY (`CDR_IDDiasReparto`) REFERENCES `diasreparto` (`idDiasReparto`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=162 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_diasreparto`
--

LOCK TABLES `cliente_diasreparto` WRITE;
/*!40000 ALTER TABLE `cliente_diasreparto` DISABLE KEYS */;
INSERT INTO `cliente_diasreparto` VALUES (27,5,1),(28,5,2),(29,5,3),(30,5,4),(31,5,5),(32,5,6),(33,5,7),(34,6,1),(35,6,2),(36,6,3),(37,6,4),(38,6,5),(45,8,1),(46,8,2),(47,8,3),(48,8,4),(49,8,5),(50,9,1),(51,9,3),(52,9,5),(56,11,1),(57,11,2),(58,11,3),(59,11,4),(60,11,5),(61,12,2),(62,12,4),(63,12,6),(64,13,1),(65,13,2),(66,13,6),(67,13,7),(75,15,1),(76,15,2),(77,15,3),(78,15,4),(79,15,5),(80,16,1),(81,16,2),(82,16,3),(83,16,4),(84,16,5),(85,17,1),(86,17,2),(87,17,3),(88,17,4),(89,17,5),(90,17,6),(91,17,7),(92,18,2),(93,18,3),(94,18,4),(95,18,5),(96,18,6),(97,19,1),(98,19,2),(99,19,3),(100,19,4),(101,19,5),(102,19,6),(103,19,7),(104,20,1),(105,20,3),(106,20,5),(119,2,1),(120,2,2),(121,2,3),(124,4,1),(125,4,4),(127,14,4),(135,10,3),(136,10,5),(148,3,1),(149,3,2),(153,1,1),(154,1,5),(155,7,1),(156,7,3),(157,7,4),(158,7,5),(159,7,6),(161,35,1);
/*!40000 ALTER TABLE `cliente_diasreparto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-15 17:29:25
