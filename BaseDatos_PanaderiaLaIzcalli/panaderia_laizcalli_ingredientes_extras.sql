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
-- Table structure for table `ingredientes_extras`
--

DROP TABLE IF EXISTS `ingredientes_extras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingredientes_extras` (
  `idIngredientes_extras` int NOT NULL AUTO_INCREMENT,
  `IE_Nombre` varchar(45) DEFAULT NULL,
  `IE_UnidadMedida` varchar(45) DEFAULT NULL,
  `IE_Cantidad` int DEFAULT '0',
  `IE_FechaIngreso` date DEFAULT '2025-05-14',
  PRIMARY KEY (`idIngredientes_extras`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingredientes_extras`
--

LOCK TABLES `ingredientes_extras` WRITE;
/*!40000 ALTER TABLE `ingredientes_extras` DISABLE KEYS */;
INSERT INTO `ingredientes_extras` VALUES (1,'Pasas',' 1 kg',5,'2025-01-25'),(2,'Chocolate','1 kg ',10,'2025-03-02'),(3,'Chocolate Blanco','1 kg',10,'2025-03-02'),(4,'Coco Rallado','1 kg',2,'2025-03-08'),(5,'Esencia de Naranja','1 Lt',1,'2025-01-15'),(6,'Cacao en Polvo','1 kg',3,'2025-02-17'),(7,'Azúcar Glas','1 kg',2,'2025-01-31');
/*!40000 ALTER TABLE `ingredientes_extras` ENABLE KEYS */;
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
