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
-- Table structure for table `herramientas`
--

DROP TABLE IF EXISTS `herramientas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herramientas` (
  `idHerramientas` int NOT NULL AUTO_INCREMENT,
  `H_Nombre` varchar(45) DEFAULT NULL,
  `H_Cantidad` int DEFAULT '0',
  `H_Material` varchar(45) DEFAULT NULL,
  `H_Estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idHerramientas`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herramientas`
--

LOCK TABLES `herramientas` WRITE;
/*!40000 ALTER TABLE `herramientas` DISABLE KEYS */;
INSERT INTO `herramientas` VALUES (1,'Manga pastelera',10,'Tela','Nuevo'),(2,'Boquillas para decorar',10,'Acero','Nuevo'),(3,'Termómetro de horno',2,'Acero','Usado'),(4,'Espátula angular',3,'Acero','Nuevo'),(5,'Cortador de masa',5,'Acero','Usado'),(6,'Rodillo',2,'Madera','Nuevo'),(7,'Cucharas medidoras',6,'Acero','Usado'),(8,'Cuchillos de pan',5,'Acero','Usado'),(9,'Charolas perforadas',15,'Aluminio','Usado'),(10,'Cepillo para panadería',2,'Madera','Nuevo'),(11,'Espolvoreador de azúcar',2,'Acero','Nuevo'),(12,'Pinzas de cocina',4,'Acero','Usado'),(13,'Cepillo para limpiar moldes',2,'Plástico','Usado'),(14,'Brocha para barnizar',4,'Silicona','Usado'),(15,'Espátula de silicona',10,'Silicona','Usado'),(16,'Soplete de repostería',2,'Metal','Nuevo');
/*!40000 ALTER TABLE `herramientas` ENABLE KEYS */;
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
