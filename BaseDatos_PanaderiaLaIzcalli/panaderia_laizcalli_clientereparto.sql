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
-- Table structure for table `clientereparto`
--

DROP TABLE IF EXISTS `clientereparto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientereparto` (
  `idClienteReparto` int NOT NULL AUTO_INCREMENT,
  `CR_Nombre` varchar(150) DEFAULT NULL,
  `CR_Direccion` varchar(200) DEFAULT NULL,
  `CR_Telefono` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idClienteReparto`),
  UNIQUE KEY `CR_Telefono_UNIQUE` (`CR_Telefono`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientereparto`
--

LOCK TABLES `clientereparto` WRITE;
/*!40000 ALTER TABLE `clientereparto` DISABLE KEYS */;
INSERT INTO `clientereparto` VALUES (1,'Morales','Calle Águila Real 123, Col. Lomas Verdes, Naucalpan, Edo. Méx.','4498949312'),(2,'Eva','Avenida San Mateo 456, Col. Boulevares, Naucalpan, Edo. Méx.','5523789012'),(3,'Michelle','Calle Pino 87, Col. La Florida, Naucalpan, Edo. Méx.','5534567890'),(4,'Fabiola','Av. 16 de Septiembre 321, Col. San Lorenzo Totolinga, Naucalpan, Edo. Méx.','5519876543'),(5,'Roberto','Calle Abeto 55, Col. Jardines de San Mateo, Naucalpan, Edo. Méx.','5576543210'),(6,'Campana','Av. Primero de Mayo 102, Col. El Mirador, Naucalpan, Edo. Méx.','5587654321'),(7,'Carmen','Cerrada Encino 9, Col. El Molinito, Naucalpan, Edo. Méx.','5543210987'),(8,'Marina','Calle Magnolia 210, Col. Las Huertas, Naucalpan, Edo. Méx.','5590901122'),(9,'Carlos','Avenida Gustavo Baz 776, Col. Industrial Alce Blanco, Naucalpan, Edo. Méx.','5533445566'),(10,'Jorge','Calle Jacarandas 64, Col. San Rafael Chamapa, Naucalpan, Edo. Méx.','5577889900'),(11,'Raymundo','Calle Sauce 89, Col. Echegaray, Naucalpan, Edo. Méx.','5566778899'),(12,'Fidel','Av. López Mateos 405, Col. Ciudad Satélite, Naucalpan, Edo. Méx.','5524681357'),(13,'Jaime','Calle Ciprés 121, Col. Lomas de Tecamachalco, Naucalpan, Edo. Méx.','5513572468'),(14,'Pablo','Calle Azucena 34, Col. Pastores, Naucalpan, Edo. Méx.','5531415926'),(15,'Teresa','Calle Cedros 78, Col. Colón Echegaray, Naucalpan, Edo. Méx.','5580081350'),(16,'Olivia','Calle Río Hondo 19, Col. Río Hondo, Naucalpan, Edo. Méx.','5550502020'),(17,'Gaspar','Avenida Universidad 159, Col. Ampliación Los Remedios, Naucalpan, Edo. Méx.','5598981212'),(18,'Ericka','Calle Sauce 201, Col. Altamira, Naucalpan, Edo. Méx.','5560607070'),(19,'Esperanza','Calle Fresno 46, Col. Valle Dorado, Naucalpan, Edo. Méx.','5512303210'),(20,'Cristina','Calle Gardenias 88, Col. Prado San Mateo, Naucalpan, Edo. Méx.','5576504321'),(35,'Pao','Nardo 26','5539680195');
/*!40000 ALTER TABLE `clientereparto` ENABLE KEYS */;
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
