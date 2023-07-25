-- MySQL dump 10.13  Distrib 8.0.31, for macos12 (x86_64)
--
-- Host: localhost    Database: biglietteria
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `biglietti`
--

DROP TABLE IF EXISTS `biglietti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `biglietti` (
  `cod_operazione` bigint NOT NULL,
  `COD_CLIENTE` int DEFAULT NULL,
  `COD_REPLICA` int DEFAULT NULL,
  `data_prenotazione` datetime(6) DEFAULT NULL,
  `tipo_pagamento` varchar(255) DEFAULT NULL,
  `quantita` bigint DEFAULT NULL,
  PRIMARY KEY (`cod_operazione`),
  KEY `FKr6khqymabmb504fpbhdxtdspy` (`COD_CLIENTE`),
  KEY `FKp9bfxcuknpd6wfv5yy0dcbihi` (`COD_REPLICA`),
  CONSTRAINT `biglietti_ibfk_1` FOREIGN KEY (`COD_CLIENTE`) REFERENCES `Clienti` (`COD_CLIENTE`),
  CONSTRAINT `biglietti_ibfk_2` FOREIGN KEY (`COD_REPLICA`) REFERENCES `Repliche` (`COD_REPLICA`),
  CONSTRAINT `FKp9bfxcuknpd6wfv5yy0dcbihi` FOREIGN KEY (`COD_REPLICA`) REFERENCES `repliche` (`COD_REPLICA`),
  CONSTRAINT `FKr6khqymabmb504fpbhdxtdspy` FOREIGN KEY (`COD_CLIENTE`) REFERENCES `clienti` (`COD_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biglietti`
--

LOCK TABLES `biglietti` WRITE;
/*!40000 ALTER TABLE `biglietti` DISABLE KEYS */;
INSERT INTO `biglietti` VALUES (586,2,2,'2023-07-25 09:03:09.000000','Carta di Credito',1),(587,2,2,'2023-07-25 09:03:58.000000','Paypal',2),(588,2,3,'2023-07-25 09:04:37.000000','Carta di Credito',3),(589,2,2,'2023-07-25 09:07:05.000000','Paypal',6),(590,2,2,'2023-07-25 09:08:52.000000','Carta di Credito',5),(591,2,7,'2023-07-25 09:09:35.000000','Paypal',4),(592,2,2,'2023-07-25 09:10:03.000000','Paypal',3),(593,1,2,'2023-07-25 09:15:23.000000','Paypal',4),(594,1,10,'2023-07-25 09:15:37.000000','Carta di Credito',10),(595,1,2,'2023-07-25 09:30:34.000000','Paypal',3),(596,2,3,'2023-07-25 09:57:32.000000','Carta di Credito',3),(597,1,7,'2023-07-25 10:15:20.000000','Carta di Credito',3),(598,2,12,'2023-07-25 10:16:01.000000','Carta di Credito',3),(599,3,24,'2023-07-25 10:16:41.000000','Carta di Credito',4),(600,2,2,'2023-07-25 10:23:12.000000','Carta di Credito',3),(601,3,12,'2023-07-25 10:24:41.000000','Carta di Credito',3),(602,3,13,'2023-07-25 10:24:56.000000','Paypal',15),(603,1,18,'2023-07-25 10:27:26.000000','Paypal',3),(604,4,23,'2023-07-25 10:28:21.000000','Paypal',3),(605,1,1,'2023-07-25 17:01:43.000000','Paypal',2),(606,1,7,'2023-07-25 17:03:47.000000','Paypal',4),(607,2,2,'2023-07-25 17:30:29.000000','Paypal',3),(608,4,2,'2023-07-25 17:43:05.000000','Carta di Credito',4),(609,4,11,'2023-07-25 17:43:26.000000','Carta di Credito',3),(610,4,1,'2023-07-25 18:18:53.000000','Carta di Credito',5),(611,4,1,'2023-07-25 18:21:03.000000','Carta di Credito',3),(612,4,7,'2023-07-25 18:22:30.000000','Carta di Credito',3),(613,4,1,'2023-07-25 18:24:56.000000','Carta di Credito',2),(614,4,9,'2023-07-25 18:25:38.000000','Paypal',3),(615,2,7,'2023-07-25 19:02:31.000000','Carta di Credito',3),(616,2,7,'2023-07-25 19:03:56.000000','Carta di Credito',2),(617,1,11,'2023-07-25 19:06:26.000000','Carta di Credito',2),(618,4,2,'2023-07-25 19:37:19.000000','Paypal',3);
/*!40000 ALTER TABLE `biglietti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `biglietti_seq`
--

DROP TABLE IF EXISTS `biglietti_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `biglietti_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biglietti_seq`
--

LOCK TABLES `biglietti_seq` WRITE;
/*!40000 ALTER TABLE `biglietti_seq` DISABLE KEYS */;
INSERT INTO `biglietti_seq` VALUES (701);
/*!40000 ALTER TABLE `biglietti_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Clienti`
--

DROP TABLE IF EXISTS `Clienti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Clienti` (
  `COD_CLIENTE` int NOT NULL,
  `COGNOME` varchar(20) DEFAULT NULL,
  `NOME` varchar(20) DEFAULT NULL,
  `TELEFONO` varchar(14) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`COD_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Clienti`
--

LOCK TABLES `Clienti` WRITE;
/*!40000 ALTER TABLE `Clienti` DISABLE KEYS */;
INSERT INTO `Clienti` VALUES (1,'Alfieri','Valeria','011/4328346','alf@libero.it'),(2,'Bellotti','Cinzia','011/79876658','bel@tin.it'),(3,'Morgeri','Giuseppe','011/76547648','dig@email.it'),(4,'Bastioni','Gianluca','011/76586548','fai@virgilio.it'),(5,'Francini','Massimiliano','011/543326565','fra@libero.it'),(6,'Mattone','Fabrizio','011/98765762','gat@tin.it'),(7,'Maistoni','Ivan','011/5483678','mai@email.it'),(8,'Parenti','Michele','011/5367548','mik@tin.it'),(9,'Morrini','Marco','011/53645872','mor@libero.it'),(10,'Pagini','Giuliana','011/78363459','pag@yahoo.it'),(11,'Picati','Annamaria','011/67598721','pic@email.it'),(12,'Rugliese','Antonio','011/3678465','pug@tin.it'),(13,'Romanotti','Davide','011/34254367','rom@libero.it'),(14,'Straniti','Annamaria','011/845673865','str@libero.it');
/*!40000 ALTER TABLE `Clienti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clienti_seq`
--

DROP TABLE IF EXISTS `clienti_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clienti_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clienti_seq`
--

LOCK TABLES `clienti_seq` WRITE;
/*!40000 ALTER TABLE `clienti_seq` DISABLE KEYS */;
INSERT INTO `clienti_seq` VALUES (1);
/*!40000 ALTER TABLE `clienti_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repliche`
--

DROP TABLE IF EXISTS `repliche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repliche` (
  `COD_REPLICA` int NOT NULL,
  `COD_SPETTACOLO` int DEFAULT NULL,
  `DATA_REPLICA` date DEFAULT NULL,
  PRIMARY KEY (`COD_REPLICA`),
  KEY `FK8exk5i6dd4ownkpbyv5xw1tsj` (`COD_SPETTACOLO`),
  CONSTRAINT `FK8exk5i6dd4ownkpbyv5xw1tsj` FOREIGN KEY (`COD_SPETTACOLO`) REFERENCES `spettacoli` (`COD_SPETTACOLO`),
  CONSTRAINT `repliche_ibfk_1` FOREIGN KEY (`COD_SPETTACOLO`) REFERENCES `Spettacoli` (`COD_SPETTACOLO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repliche`
--

LOCK TABLES `repliche` WRITE;
/*!40000 ALTER TABLE `repliche` DISABLE KEYS */;
INSERT INTO `repliche` VALUES (1,1,'2018-10-05'),(2,1,'2018-10-06'),(3,1,'2018-10-07'),(4,1,'2018-10-08'),(5,1,'2018-10-09'),(6,2,'2018-11-12'),(7,2,'2018-11-13'),(8,2,'2018-11-14'),(9,2,'2018-11-15'),(10,2,'2018-11-16'),(11,3,'2019-01-05'),(12,3,'2019-01-06'),(13,3,'2019-01-07'),(14,3,'2019-01-08'),(15,3,'2019-01-09'),(16,4,'2019-01-12'),(17,4,'2019-01-13'),(18,4,'2019-01-14'),(19,4,'2019-01-15'),(20,4,'2019-01-16'),(21,5,'2018-11-05'),(22,5,'2018-11-06'),(23,5,'2018-11-07'),(24,5,'2018-11-18'),(25,5,'2018-11-19'),(26,6,'2018-12-12'),(27,6,'2018-12-13'),(28,6,'2018-12-14'),(29,6,'2018-12-15'),(30,6,'2018-12-16');
/*!40000 ALTER TABLE `repliche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repliche_seq`
--

DROP TABLE IF EXISTS `repliche_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repliche_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repliche_seq`
--

LOCK TABLES `repliche_seq` WRITE;
/*!40000 ALTER TABLE `repliche_seq` DISABLE KEYS */;
INSERT INTO `repliche_seq` VALUES (1);
/*!40000 ALTER TABLE `repliche_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spettacoli`
--

DROP TABLE IF EXISTS `spettacoli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `spettacoli` (
  `COD_SPETTACOLO` int NOT NULL,
  `titolo` varchar(255) DEFAULT NULL,
  `autore` varchar(255) DEFAULT NULL,
  `regista` varchar(255) DEFAULT NULL,
  `prezzo` double DEFAULT NULL,
  `COD_TEATRO` int DEFAULT NULL,
  PRIMARY KEY (`COD_SPETTACOLO`),
  KEY `FKgdb2hs4ppkg53p3b3pooyk7cd` (`COD_TEATRO`),
  CONSTRAINT `FKgdb2hs4ppkg53p3b3pooyk7cd` FOREIGN KEY (`COD_TEATRO`) REFERENCES `teatri` (`COD_TEATRO`),
  CONSTRAINT `spettacoli_ibfk_1` FOREIGN KEY (`COD_TEATRO`) REFERENCES `Teatri` (`COD_TEATRO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spettacoli`
--

LOCK TABLES `spettacoli` WRITE;
/*!40000 ALTER TABLE `spettacoli` DISABLE KEYS */;
INSERT INTO `spettacoli` VALUES (1,'Appunti per un film sulla lotta di classe','Ascanio Celestini','Ascanio Celestini',20,1),(2,'Il birraio di Preston','Andrea Camilleri','Giuseppe Dipasquale',20,1),(3,'La Traviata','Giuseppe Verdi','Laurent Pelly',40,2),(4,'La Bohème','Giacomo Puccini','Giuseppe Patroni Griffi',40,2),(5,'Poveri, ma belli','Gianni Togni','Massimo Ranieri',25,3),(6,'Il sogno del piccolo imperatore','Gian Mesturino','Alberto Barbi',25,3);
/*!40000 ALTER TABLE `spettacoli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spettacoli_seq`
--

DROP TABLE IF EXISTS `spettacoli_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `spettacoli_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spettacoli_seq`
--

LOCK TABLES `spettacoli_seq` WRITE;
/*!40000 ALTER TABLE `spettacoli_seq` DISABLE KEYS */;
INSERT INTO `spettacoli_seq` VALUES (1);
/*!40000 ALTER TABLE `spettacoli_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Teatri`
--

DROP TABLE IF EXISTS `Teatri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Teatri` (
  `COD_TEATRO` int NOT NULL,
  `NOME` varchar(30) DEFAULT NULL,
  `INDIRIZZO` varchar(30) DEFAULT NULL,
  `CITTA` varchar(25) DEFAULT NULL,
  `PROVINCIA` char(2) DEFAULT NULL,
  `TELEFONO` varchar(14) DEFAULT NULL,
  `POSTI` int DEFAULT NULL,
  PRIMARY KEY (`COD_TEATRO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Teatri`
--

LOCK TABLES `Teatri` WRITE;
/*!40000 ALTER TABLE `Teatri` DISABLE KEYS */;
INSERT INTO `Teatri` VALUES (1,'Teatro Carignano','Piazza Carignano 6','Torino','TO','011/3456759',875),(2,'Teatro Regio','Piazza Castello 2','Torino','TO','011/9870654',1592),(3,'Teatro Alfieri','Piazza Solferino 4','Torino','TO','011/6574895',1500);
/*!40000 ALTER TABLE `Teatri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teatri_seq`
--

DROP TABLE IF EXISTS `teatri_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teatri_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teatri_seq`
--

LOCK TABLES `teatri_seq` WRITE;
/*!40000 ALTER TABLE `teatri_seq` DISABLE KEYS */;
INSERT INTO `teatri_seq` VALUES (1);
/*!40000 ALTER TABLE `teatri_seq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-25 22:16:45
