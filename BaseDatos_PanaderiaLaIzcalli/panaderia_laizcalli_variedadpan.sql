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
-- Table structure for table `variedadpan`
--

DROP TABLE IF EXISTS `variedadpan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `variedadpan` (
  `idVariedadPan` int NOT NULL AUTO_INCREMENT,
  `VP_Nombre` varchar(45) DEFAULT NULL,
  `VP_Descripcion` varchar(200) DEFAULT NULL,
  `VP_idTipoPan` int DEFAULT '1',
  PRIMARY KEY (`idVariedadPan`),
  KEY `idTipoPan_idx` (`VP_idTipoPan`),
  CONSTRAINT `idTipoPan` FOREIGN KEY (`VP_idTipoPan`) REFERENCES `tipopan` (`idTipoPan`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `variedadpan`
--

LOCK TABLES `variedadpan` WRITE;
/*!40000 ALTER TABLE `variedadpan` DISABLE KEYS */;
INSERT INTO `variedadpan` VALUES (1,'Telera','Pan suave y ligeramente redondo con tres cortes en la parte superior, ideal para tortas.',1),(2,'Bolillo Liso','Pan crujiente por fuera y suave por dentro, sin cortes en la superficie.',2),(3,'Bolillo Ajonjoli','Similar al bolillo liso, pero con semillas de ajonjolí en la parte superior.',3),(4,'Concha Vainilla','Pan dulce esponjoso con cobertura crujiente sabor vainilla.',4),(5,'Concha Chocolate','Versión de la concha con cobertura sabor chocolate.',4),(6,'Concha Amarilla','Concha con una cobertura amarilla, usualmente sabor mantequilla.',4),(7,'Cuernito','Pan en forma de media luna, hojaldrado y ligeramente dulce.',4),(8,'Hojaldra','Pan hojaldrado, crujiente y con un toque de azúcar encima.',4),(9,'Bisquet','Pan redondo, esponjoso y con una costra ligeramente dorada.',4),(10,'Colchón','Pan suave y esponjoso, similar a un panqué.',4),(11,'Mantecada','Pan pequeño y esponjoso con sabor a mantequilla.',4),(12,'Bigote','Pan en forma de bigote con azúcar encima.',4),(13,'Moño','Pan en forma de lazo, generalmente espolvoreado con azúcar.',4),(14,'Novia','Pan suave con un ligero glaseado de azúcar.',4),(15,'Cocol','Pan dulce con anís y una costra de azúcar en la parte superior.',4),(16,'Mordida','Pan con cobertura crujiente de azúcar y un toque de canela.',4),(17,'Piojosa','Pan dulce con una capa gruesa de azúcar espolvoreada y ajonjoli.',4),(18,'Cema','Pan suave y esponjoso, con un ligero toque de mantequilla y azúcar glas.',4),(19,'Polvoron','Pan dulce seco y crujiente, con un toque de mantequilla y azúcar.',4),(20,'Polvoron Mazapan','Variante del polvorón con sabor a mazapán.',4),(21,'Maria','Galleta tradicional, sencilla y crujiente.',4),(22,'Beso','Dos piezas de pan unidas con mermelada o crema y cubiertas de azúcar.',4),(23,'Almeja','Pan relleno con crema pastelera.',4),(24,'Cacahuate','Pan dulce con trozos de cacahuate.',4),(25,'Hueso','Pan con textura firme y un sabor ligero a manteca.',4),(26,'Rosca','Pan en forma de rosca con un toque de manteca y azúcar.',4),(27,'Empanada','Pan relleno de crema, cajeta, o frutas, con una costra de azúcar.',4),(28,'Piedra','Pan duro y denso.',4),(29,'Ladrillo','Pan grueso y crujiente, con una textura densa.',4),(30,'Galleta Espejo','Galleta con cubierta de chocolate.',4),(31,'Galleta Nuez','Galleta con trozos de nuez y un toque de azúcar.',4),(32,'Galleta Chochito','Galleta con chochitos de chocolate.',4),(33,'Gendarme','Galleta delgada con un toque dulce.',4),(34,'Dona Moka','Dona cubierta con glaseado sabor moka.',5),(35,'Dona Chocolate','Dona cubierta con chocolate.',5),(36,'Dona Azucar','Dona espolvoreada con azúcar granulada.',5),(37,'Dona Glaseada','Dona con una capa de glaseado de azúcar.',5),(38,'Chino','Pan esponjoso con un glaseado dulce.',5),(39,'Japones','Pan suave con una capa crujiente de azúcar y mantequilla.',5),(40,'Muffin','Pan individualmente horneado, esponjoso y con diversos sabores.',5),(41,'Chocolatin Negro','Pan relleno con chocolate oscuro.',5),(42,'Chocolatin Blanco','Pan relleno con chocolate blanco.',5),(43,'Domino','Pan con decorado en forma de fichas de dominó.',5),(44,'Domino Chocolate','Versión del dominó con cobertura de chocolate.',5),(45,'Rebanada','Pan rectangular cubierto con mantequilla y azúcar.',5),(46,'Carioca','Pan relleno de crema pastelera y espolvoreado con azúcar.',5),(47,'Barquillo','Pan delgado y crujiente, enrollado en forma de tubo.',5),(48,'Rol de Canela','Pan en espiral con canela y azúcar, a veces con glaseado.',5),(49,'Trenza','Pan trenzado, ligeramente dulce y esponjoso.',5),(50,'Peineta','Pan en forma de peine con una capa de azúcar.',5),(51,'Oreja','Pan hojaldrado y crujiente en forma de oreja.',5),(52,'Abanico','Similar a la oreja, pero más grande y con una forma abierta.',5),(53,'Taco','Pan doblado con relleno de crema o chocolate.',5),(54,'Canasta','Pan con forma de canasta y relleno de crema o mermelada.',5),(55,'Piña','Pan relleno con mermelada de piña y espolvoreado con azúcar.',5),(56,'Empanada Feite','Empanada rellena de una mezcla de dulce y grasa.',5),(57,'Moño Feite','Pan en forma de moño con una textura crujiente.',5),(58,'Cuadro','Pan cuadrado con una textura densa y dulce.',5),(59,'Banderilla','Pan alargado con una cobertura de azúcar.',5),(60,'Campechana','Pan hojaldrado y crujiente con una capa de azúcar.',5),(61,'Ponciano','Pan estilo mil hojas con mermelada.',5),(62,'Ojo','Pan con una capa de azúcar y relleno de crema o chocolate.',5),(63,'Budin','Pan elaborado con sobras de pan, leche, azúcar y especias.',5);
/*!40000 ALTER TABLE `variedadpan` ENABLE KEYS */;
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
