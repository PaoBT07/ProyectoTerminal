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
-- Table structure for table `reporteventas`
--

DROP TABLE IF EXISTS `reporteventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reporteventas` (
  `idReporteVentas` int NOT NULL AUTO_INCREMENT,
  `RV_Fecha` date DEFAULT '2025-05-14',
  `RV_Gastos` float DEFAULT '0',
  `RV_PrestamoMonedas` float DEFAULT '0',
  `RV_PrestamoBilletes` int DEFAULT '0',
  `RV_DineroCaja` float DEFAULT '0',
  `RV_TotalCaja` float DEFAULT '0',
  `RV_VentasRegistradas` float DEFAULT '0',
  `RV_VentasRepartos` float DEFAULT '0',
  `RV_TotalVenta` float DEFAULT '0',
  `RV_IDUsuario` int DEFAULT '2',
  PRIMARY KEY (`idReporteVentas`),
  KEY `idUsuario_idx` (`RV_IDUsuario`),
  CONSTRAINT `idUsuar` FOREIGN KEY (`RV_IDUsuario`) REFERENCES `usuario` (`idUsuario`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reporteventas`
--

LOCK TABLES `reporteventas` WRITE;
/*!40000 ALTER TABLE `reporteventas` DISABLE KEYS */;
INSERT INTO `reporteventas` VALUES (1,'2025-01-25',1956,2276.5,1000,10620,15852.5,8009,7897,15906,2),(2,'2025-04-28',2502,586,865,8000,11953,535,0,535,3),(3,'2025-04-28',80,340,300,5000,5720,520,0,520,2),(4,'2025-04-28',80,50,30,2000,2160,30,80,110,1),(5,'2025-04-28',80,480,650,4000,5210,50,0,50,1),(6,'2025-04-28',605,80,70,1500,2255,80,0,80,1),(7,'2025-04-28',780,1759,1000,6740,10279,6550,3725,10275,3),(8,'2025-05-08',1455,3528,2000,8500,15483,6503,9006,15509,2),(9,'2025-05-08',0,0,0,0,0,0,500,500,2),(10,'2025-05-12',1,1,1,1,4,1,0,1,2);
/*!40000 ALTER TABLE `reporteventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-15 17:29:27
