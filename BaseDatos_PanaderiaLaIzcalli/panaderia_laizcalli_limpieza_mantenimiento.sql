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
-- Table structure for table `limpieza_mantenimiento`
--

DROP TABLE IF EXISTS `limpieza_mantenimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `limpieza_mantenimiento` (
  `idLimpieza_Mantenimiento` int NOT NULL AUTO_INCREMENT,
  `LM_Nombre` varchar(45) DEFAULT NULL,
  `LM_Cantidad` int DEFAULT '0',
  `LM_TipoMaterial` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idLimpieza_Mantenimiento`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `limpieza_mantenimiento`
--

LOCK TABLES `limpieza_mantenimiento` WRITE;
/*!40000 ALTER TABLE `limpieza_mantenimiento` DISABLE KEYS */;
INSERT INTO `limpieza_mantenimiento` VALUES (1,'Cloro',11,'Líquido'),(2,'Jabón para trastes',5,'Líquido'),(3,'Esponjas',4,'Espuma'),(4,'Trapos ',10,'Microfibra'),(5,'Escobas',6,'Plástico y Madera'),(6,'Jaladores',6,'Plástico y Madera'),(7,'Cubetas',15,'Plástico'),(8,'Jergas',8,'Tela'),(9,'Alcohol en gel',2,'Gel'),(10,'Papel higienico',20,'Papel'),(11,'Detergente multiusos',8,'Líquido'),(12,'Cepillos',2,'Plástico'),(13,'Bolsas de basura',50,'Plástico');
/*!40000 ALTER TABLE `limpieza_mantenimiento` ENABLE KEYS */;
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
