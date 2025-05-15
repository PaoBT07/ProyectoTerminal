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
-- Table structure for table `listapedido`
--

DROP TABLE IF EXISTS `listapedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listapedido` (
  `idListaPedido` int NOT NULL AUTO_INCREMENT,
  `LP_Fecha` date DEFAULT '2025-05-14',
  `LP_NumNotaRemision` int DEFAULT NULL,
  `LP_TotalPanBlanco` int DEFAULT NULL,
  `LP_TotalPanDulce` int DEFAULT NULL,
  `LP_ImporteTotal` float DEFAULT '0',
  `LP_IDClienteReparto` int DEFAULT NULL,
  `LP_IDUsuario` int DEFAULT NULL,
  PRIMARY KEY (`idListaPedido`),
  KEY `idClienteReparto_idx` (`LP_IDClienteReparto`),
  KEY `idUsuario_idx` (`LP_IDUsuario`),
  CONSTRAINT `idClienteReparto` FOREIGN KEY (`LP_IDClienteReparto`) REFERENCES `clientereparto` (`idClienteReparto`) ON UPDATE CASCADE,
  CONSTRAINT `idUsuario` FOREIGN KEY (`LP_IDUsuario`) REFERENCES `usuario` (`idUsuario`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listapedido`
--

LOCK TABLES `listapedido` WRITE;
/*!40000 ALTER TABLE `listapedido` DISABLE KEYS */;
INSERT INTO `listapedido` VALUES (1,'2025-04-25',1,150,80,800,1,2),(2,'2025-05-02',2,200,230,875,2,2),(3,'2025-05-02',3,70,70,7,3,2),(4,'2025-05-08',4,45,30,452,4,2),(5,'2025-05-08',5,130,90,500,5,3),(6,'2025-05-12',6,40,25,575,6,2),(7,'2025-05-14',7,40,25,500,7,3),(8,'2025-05-14',8,40,25,80,8,3),(9,'2025-05-14',9,100,30,962,9,3),(10,'2025-05-14',10,30,50,80,10,2),(11,'2025-05-14',11,40,40,80,11,2),(12,'2025-05-14',12,80,30,25,12,3),(13,'2025-05-14',13,110,0,774,13,2),(14,'2025-05-14',14,120,50,42,14,3),(15,'2025-05-14',15,12,40,231,15,3),(16,'2025-05-14',16,40,40,54,16,2),(17,'2025-05-14',17,200,80,7,17,2),(18,'2025-05-14',18,150,60,557,18,2),(19,'2025-05-14',19,40,30,1000,19,3),(20,'2025-05-14',20,20,15,98,20,3),(21,'2025-05-14',21,0,0,0,35,2);
/*!40000 ALTER TABLE `listapedido` ENABLE KEYS */;
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
