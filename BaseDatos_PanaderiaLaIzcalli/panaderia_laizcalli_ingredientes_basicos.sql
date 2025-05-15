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
-- Table structure for table `ingredientes_basicos`
--

DROP TABLE IF EXISTS `ingredientes_basicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingredientes_basicos` (
  `idIngredientes` int NOT NULL AUTO_INCREMENT,
  `IB_Nombre` varchar(45) DEFAULT NULL,
  `IB_UnidadMedida` varchar(45) DEFAULT NULL,
  `IB_Cantidad` int DEFAULT '0',
  `IB_FechaIngreso` date DEFAULT '2025-05-14',
  PRIMARY KEY (`idIngredientes`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingredientes_basicos`
--

LOCK TABLES `ingredientes_basicos` WRITE;
/*!40000 ALTER TABLE `ingredientes_basicos` DISABLE KEYS */;
INSERT INTO `ingredientes_basicos` VALUES (1,'Harina','25 kg',186,'2025-03-01'),(2,'Azúcar','25 kg',83,'2025-03-01'),(3,'Sal','1 kg',6,'2025-02-14'),(4,'Levadura','400 gr',3,'2025-03-10'),(5,'Mantequilla','5 kg',24,'2025-02-20'),(6,'Huevos','Casillero',50,'2025-03-10'),(7,'Leche','4 Lt',31,'2025-03-05'),(8,'Aceite','20 Lt',10,'2025-02-01'),(9,'Vainilla','4 Lt',5,'2025-02-28'),(10,'Ajonjoli','1 kg',17,'2025-05-07'),(11,'Grasa Vegetal','1 kg',18,'2025-05-07');
/*!40000 ALTER TABLE `ingredientes_basicos` ENABLE KEYS */;
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
