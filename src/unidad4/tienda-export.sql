-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tienda
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `idCategorias` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `Categorias_idCategorias` int NOT NULL,
  PRIMARY KEY (`idCategorias`),
  KEY `fk_Categorias_Categorias1` (`Categorias_idCategorias`),
  CONSTRAINT `fk_Categorias_Categorias1` FOREIGN KEY (`Categorias_idCategorias`) REFERENCES `categorias` (`idCategorias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias_has_producto`
--

DROP TABLE IF EXISTS `categorias_has_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias_has_producto` (
  `Categorias_idCategorias` int NOT NULL,
  `Producto_idProducto` int NOT NULL,
  PRIMARY KEY (`Categorias_idCategorias`,`Producto_idProducto`),
  KEY `fk_Categorias_has_Producto_Producto1` (`Producto_idProducto`),
  CONSTRAINT `fk_Categorias_has_Producto_Categorias1` FOREIGN KEY (`Categorias_idCategorias`) REFERENCES `categorias` (`idCategorias`),
  CONSTRAINT `fk_Categorias_has_Producto_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias_has_producto`
--

LOCK TABLES `categorias_has_producto` WRITE;
/*!40000 ALTER TABLE `categorias_has_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias_has_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `edad` int NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Patricia','bueno',61,'F','enim.mi.tempor@icloud.net','OFO48CRF5IB'),(2,'Jonah Rocha','Neville Harris',48,'M','faucibus.orci@icloud.couk','AVO16EFC7NE'),(3,'Knox Phillips','Jane Mccormick',75,'F','interdum@hotmail.couk','GNY42SUS7QS'),(4,'Lynn Skinner','Anjolie Riddle',70,'F','suspendisse.ac@protonmail.org','VAX14QTI7UO'),(6,'Celeste Ballard','Jemima Briggs',32,'F','mauris.aliquam@icloud.com','MPY43OOL5UN'),(7,'Zachery Cherry','Sydney Farmer',89,'F','nisi.sem@google.net','ICB27CQO5OP'),(8,'Hayes Knapp','Brent Talley',57,'F','quisque.nonummy.ipsum@hotmail.net','HVY27TGV8HZ'),(9,'Clayton Good','Alexander Graves',42,'F','nunc.laoreet.lectus@outlook.net','OPK63XBO7RC'),(10,'Maxwell Vaughan','Steven Roman',28,'M','id.erat@yahoo.org','FFW13GLW5EV'),(11,'Alan Bowers','Kylie Mcleod',61,'F','enim.mi.tempor@icloud.net','OFO48CRF5IB'),(12,'Gavin Carroll','Mechelle Buchanan',86,'M','ultrices@outlook.org','VNT38MYX7ZO'),(13,'Darryl Lynn','Sonia Lara',43,'M','sociosqu.ad.litora@hotmail.net','QQY82UOU8IU'),(14,'Hilary Sexton','Steven Bailey',76,'M','posuere.cubilia@yahoo.couk','YMK21GGH4BP'),(15,'Quinn Ray','Jasmine O\'connor',56,'M','tincidunt.aliquam@aol.edu','TBV97YJQ6EV'),(16,'Lareina Castillo','Gannon Hunt',9,'M','purus@yahoo.net','QSE69ZWV7FT'),(17,'Gay Joseph','Duncan Kaufman',64,'F','integer.sem@yahoo.org','GYP34LIW8OW'),(18,'Hope Keller','Ralph Mckinney',10,'M','donec@icloud.ca','RRU64KAT7VS'),(19,'Winifred Mcclure','MacKenzie Carrillo',13,'M','quam@icloud.com','HBI25TYD5GX'),(20,'Martin Allison','Theodore Gilbert',48,'F','proin.non@aol.ca','KYB17WDZ7UM'),(21,'Maryam Peck','Faith O\'brien',54,'F','massa.non.ante@google.ca','BLR71CON7RX'),(22,'Stone Garner','Tyrone Erickson',14,'F','suspendisse.tristique.neque@aol.couk','UBB51HKF6LC'),(23,'Thomas Peck','Nolan Bolton',47,'M','aliquam.ornare.libero@hotmail.com','EDL13EKS8CR'),(24,'Iliana Delaney','Ahmed Shields',53,'M','lacinia.at@protonmail.org','HKK88ROD2EA'),(25,'John Lara','Quin Maxwell',64,'F','dictum.eu.placerat@hotmail.net','KNF15EJT2VR'),(26,'Mercedes Rojas','Roanna Dudley',52,'F','sed.dictum.eleifend@hotmail.org','XQI82MQH4UF'),(27,'Hamilton Phillips','Hadassah Nixon',27,'M','tellus.imperdiet.non@outlook.couk','XRF55RCE5VI'),(28,'Nehru Oliver','Ila Horton',74,'F','metus.aliquam@yahoo.ca','TIK05XHD7JL'),(29,'Clark Howell','Keegan Orr',87,'F','ad.litora.torquent@yahoo.com','RRW68YYR3YY'),(30,'Ivana Welch','Ross Parks',86,'F','elit@hotmail.couk','CKC44XMF0PG'),(31,'David Wilkerson','Byron Guerra',22,'M','sollicitudin.commodo@google.ca','TFO87CSR9BY'),(32,'Jasmine Graves','Kay Cochran',47,'M','magna.et@protonmail.couk','PKP87BXS4AI'),(33,'Lysandra Montoya','Hilary Kim',37,'M','integer.sem@outlook.edu','DLH03BHI4XE'),(34,'Rajah Craig','Jael Pena',47,'M','mauris.integer.sem@icloud.couk','NGY39WVM8QA'),(35,'Gage Haynes','Slade Hickman',63,'F','quisque.varius.nam@google.org','HKE69JHA1DJ'),(36,'Nelle Warner','Hilel Dudley',64,'M','mauris.molestie@protonmail.org','HLP82PGX3VF'),(37,'Herrod Hinton','Harding Clarke',40,'M','molestie.tortor.nibh@icloud.edu','CMA62NGP2PQ'),(38,'Marcia Riddle','Petra Williams',38,'F','ut.molestie.in@hotmail.org','ZVE37FID7HN'),(39,'Ivory Mcneil','Maxwell Walter',33,'M','in.tempus@hotmail.edu','WPQ36YDP4KT'),(40,'Driscoll Kirkland','Jane Lane',32,'M','metus.aenean@icloud.com','MTY72XVK3KO'),(41,'Dorian Valentine','Phoebe Cohen',33,'F','sit.amet@outlook.ca','HLJ85CYR6BV'),(42,'Sylvester Sargent','Kermit Fitzgerald',20,'M','lorem.ipsum@google.com','WII04NCP8QD'),(43,'Lawrence Ballard','Shana Randall',56,'F','ultrices.posuere@yahoo.edu','NMG26TLW7XA'),(44,'Judah Stark','Nadine Holt',39,'M','adipiscing.lobortis@protonmail.net','LBB06PTC8WP'),(45,'Kitra Beck','Giacomo Mccarty',85,'F','scelerisque.dui.suspendisse@outlook.ca','QXK78GTA6NY'),(46,'Gavin Floyd','Zachery Craig',18,'M','sed.est@yahoo.com','BUS83IFN2YU'),(47,'Drake Ellis','Lael Lynch',41,'M','nec.ante.blandit@outlook.net','SCC71TEI7GC'),(48,'Hedda Hartman','Jameson Douglas',14,'M','etiam.bibendum@aol.ca','UXS69TEI4EN'),(49,'Garrison Macdonald','Amela Goodman',86,'M','suscipit.nonummy.fusce@icloud.net','JIQ92MEI1OG'),(50,'Halee Mcclain','Allegra Lambert',20,'M','eu.lacus.quisque@aol.ca','CHS15SJS3FY'),(51,'Uriel Keith','Irene Taylor',4,'M','magnis.dis.parturient@outlook.net','OYF12QZE4QO'),(52,'Brynne Jones','Yardley Sanchez',50,'F','vivamus@hotmail.ca','ZJN69WFB9BS'),(53,'Levi Bolton','Uriel Carlson',50,'F','nec.leo@protonmail.com','TNR22HTD2HG'),(54,'Theodore Fields','Julie Clements',6,'F','integer.mollis@yahoo.com','LTB72CTU6BI'),(55,'Bruno Tran','Ross Huber',24,'F','sem@yahoo.ca','MFF16EVJ3WK'),(56,'Uriel Stanley','Ian Cabrera',29,'M','fusce.dolor@icloud.net','KLN88JGC3EN'),(57,'Isaiah Buckner','Erich Cantrell',28,'M','ac@icloud.ca','EHW12JZU9PU'),(58,'Wyoming Barrera','Solomon Baxter',26,'F','litora.torquent.per@hotmail.net','NOJ60USC8OV'),(59,'Chantale Logan','Walker Middleton',71,'M','malesuada@outlook.edu','DXM42AIN3AB'),(60,'Arthur Rhodes','Ifeoma Skinner',43,'M','penatibus.et@icloud.net','ELC18FCW7UM'),(61,'Zelenia Mcintyre','Alexa Witt',32,'F','odio.vel@outlook.ca','WYZ32ZJQ6OL'),(62,'Lois Harding','Ingrid Frederick',39,'F','quis.pede.praesent@google.net','FYS56TAV9MG'),(63,'Edan Barker','Bruno Hanson',21,'F','interdum.curabitur@hotmail.ca','VSY55QYT5FK'),(64,'Florence Beasley','Emerson Blankenship',5,'F','consectetuer.mauris.id@protonmail.edu','JIE62ZXG6TH'),(65,'Galena Fletcher','Celeste Huff',75,'M','nunc.mauris@hotmail.edu','DQE35BOE9IY'),(66,'Brent Justice','Neville Casey',24,'M','adipiscing@google.org','TRH35OGD0XB'),(67,'Joy Bowen','Jada Horne',19,'M','consectetuer.adipiscing@aol.couk','KTL10MVW7FX'),(68,'Yoshio Joseph','Tyrone Foreman',8,'F','interdum@hotmail.edu','NIS85PWU5NP'),(69,'Zane Petersen','Uta Haley',40,'F','ac.metus@hotmail.org','BEJ24JCZ1TW'),(70,'Kiayada Foley','Lyle Guerrero',86,'F','enim@icloud.edu','MLX71AHS4EH'),(71,'Hammett Brown','Elijah Pearson',12,'M','quisque@protonmail.couk','XYF13TEI0RO'),(72,'Holmes Burns','Ori Dean',37,'M','nunc.ut@outlook.org','WDC45LOZ6JN'),(73,'Priscilla Flowers','Kylynn Solomon',18,'M','phasellus.nulla@protonmail.couk','UPM03LXL3YP'),(74,'Virginia Bush','Chester Barton',53,'F','suspendisse.non@outlook.org','EHY59XXB8KV'),(75,'Faith Mcneil','Griffin James',27,'F','lobortis@protonmail.com','JBK28UCT8HD'),(76,'Graiden Stephenson','Jackson Mullins',81,'F','justo.eu@hotmail.ca','UYJ65UEP5CG'),(77,'Michelle Wilcox','Yetta Kidd',21,'F','neque@google.edu','FGE16XLF4SR'),(78,'Tiger Walsh','Vivian Hopkins',55,'M','nec@hotmail.couk','GBQ11UPZ7NP'),(79,'Walker Lawrence','Lucas Brown',50,'M','elit@aol.net','RAW29PLO4NS'),(80,'Hanna Flynn','Marvin Bradford',15,'F','scelerisque.lorem.ipsum@aol.ca','ILS15DMB3GI'),(81,'Fuller Aguilar','Charles Vazquez',10,'F','fringilla.porttitor.vulputate@protonmail.com','GOZ46PFI1RV'),(82,'Lee Martin','Zachery Bernard',12,'M','velit.in@aol.couk','UFM63CFT3TI'),(83,'Pandora Barlow','Clayton Peterson',78,'M','enim.etiam@google.edu','VJT69CKT6PN'),(84,'Clinton Alston','Daquan Murray',66,'F','amet.consectetuer.adipiscing@outlook.net','BWE55TZC4BJ'),(85,'Roary Vaughan','Holly Wynn',48,'M','tempus.non.lacinia@outlook.net','RFG22JNG8JW'),(86,'Karen Donovan','Nicholas Warner',39,'F','pede.suspendisse.dui@protonmail.ca','UXT93SLC5TM'),(87,'Flynn Roy','Hashim Rogers',76,'F','amet.risus.donec@icloud.edu','BLY49UFD6FY'),(88,'Yolanda Luna','Cruz Macias',84,'M','blandit.viverra@icloud.com','KLR76KLC6CP'),(89,'Troy O\'connor','Graham Hyde',35,'F','vulputate@google.com','VWF66YOD8GY'),(90,'Arthur Kaufman','Hayfa Kerr',71,'F','velit.eu@outlook.ca','SIN70ZQF4HI'),(91,'Thor Lester','Ira Ellis',75,'M','gravida.non.sollicitudin@google.ca','PCI53RBC2ZY'),(92,'Colette Knapp','Francis Mckenzie',45,'F','nulla.facilisi@protonmail.com','BJO68HPB2JU'),(93,'Brendan Solomon','Grady Daugherty',63,'M','a.felis@protonmail.edu','FBF62KGN3SL'),(94,'Zoe Pearson','Mercedes Maynard',66,'F','metus.eu@outlook.org','FDU15WAV2XW'),(95,'Vernon Holder','Idola Haynes',2,'M','natoque.penatibus@hotmail.edu','SGO06NIF3FT'),(96,'Cole Lindsey','Iona Craft',46,'M','magna.lorem@hotmail.com','VTB87NKM6EJ'),(97,'Aimee Mitchell','Moana Cochran',46,'F','nullam.enim.sed@hotmail.edu','KRR21ITD8VC'),(98,'Giselle Mccray','Dalton Blankenship',86,'M','aliquet.metus@icloud.com','CUW75RUH4FP'),(99,'Cedric Stanley','Tallulah Leblanc',36,'F','augue@icloud.edu','KFJ41WTU5CO'),(100,'Berk Yang','Jaquelyn Wagner',55,'F','urna@yahoo.edu','JKI80FBJ6HY');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_has_direccion`
--

DROP TABLE IF EXISTS `cliente_has_direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_has_direccion` (
  `Cliente_idCliente` int NOT NULL,
  `direccion_iddireccion` int NOT NULL,
  PRIMARY KEY (`Cliente_idCliente`,`direccion_iddireccion`),
  KEY `fk_Cliente_has_direccion_direccion1` (`direccion_iddireccion`),
  CONSTRAINT `fk_Cliente_has_direccion_Cliente` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `fk_Cliente_has_direccion_direccion1` FOREIGN KEY (`direccion_iddireccion`) REFERENCES `direccion` (`iddireccion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_has_direccion`
--

LOCK TABLES `cliente_has_direccion` WRITE;
/*!40000 ALTER TABLE `cliente_has_direccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente_has_direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_has_metodopago`
--

DROP TABLE IF EXISTS `cliente_has_metodopago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_has_metodopago` (
  `Cliente_idCliente` int NOT NULL,
  `MetodoPago_idMetodoPago` int NOT NULL,
  PRIMARY KEY (`Cliente_idCliente`,`MetodoPago_idMetodoPago`),
  KEY `fk_Cliente_has_MetodoPago_MetodoPago1` (`MetodoPago_idMetodoPago`),
  CONSTRAINT `fk_Cliente_has_MetodoPago_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `fk_Cliente_has_MetodoPago_MetodoPago1` FOREIGN KEY (`MetodoPago_idMetodoPago`) REFERENCES `metodopago` (`idMetodoPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_has_metodopago`
--

LOCK TABLES `cliente_has_metodopago` WRITE;
/*!40000 ALTER TABLE `cliente_has_metodopago` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente_has_metodopago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direccion` (
  `iddireccion` int NOT NULL AUTO_INCREMENT,
  `alias` varchar(45) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `provincia` varchar(45) NOT NULL,
  `municipio` varchar(45) NOT NULL,
  `cp` int NOT NULL,
  PRIMARY KEY (`iddireccion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `idFactura` int NOT NULL AUTO_INCREMENT,
  `cif` varchar(45) DEFAULT NULL,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `Cliente_idCliente` int NOT NULL,
  PRIMARY KEY (`idFactura`),
  KEY `fk_Factura_Cliente1` (`Cliente_idCliente`),
  CONSTRAINT `fk_Factura_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,'96824','Oleg Wolf',19),(2,'11893','Tyler Booth',28),(3,'49638','Deacon Combs',61),(4,'42100','Cyrus Page',71),(5,'87023','Drake Miranda',8),(6,'32672','Ray Graham',47),(7,'21833','August Pierce',22),(8,'21034','Jane Porter',38),(9,'8661','Dennis Paul',39),(10,'92327','Otto Moon',71),(11,'15824','Bernard Nixon',57),(12,'17429','Timon Hoover',33),(13,'18688','May Rich',89),(14,'13718','Jenette Wood',49),(15,'54711','Allegra Glover',85),(16,'38842','Fulton Zamora',37),(17,'90302','Tanek Lowery',31),(18,'91854','Jocelyn Copeland',46),(19,'19144','Jorden Mcintosh',7),(20,'31753','Anastasia Reid',35),(21,'69921','Lucy Johnston',67),(22,'68563','Isabelle Bailey',72),(23,'63511','Tallulah Norman',14),(24,'90914','Yael Suarez',36),(25,'74326','Wing Patel',77),(26,'98689','Coby Simpson',38),(27,'72911','Steven Flores',3),(28,'75294','Mason Franklin',65),(29,'20914','Naida Miranda',18),(30,'99646','Ulysses Dominguez',15);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metodopago`
--

DROP TABLE IF EXISTS `metodopago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metodopago` (
  `idMetodoPago` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `tipo` int NOT NULL,
  `coste` float DEFAULT NULL,
  PRIMARY KEY (`idMetodoPago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metodopago`
--

LOCK TABLES `metodopago` WRITE;
/*!40000 ALTER TABLE `metodopago` DISABLE KEYS */;
/*!40000 ALTER TABLE `metodopago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `Producto_idProducto` int NOT NULL,
  `Cliente_idCliente` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  PRIMARY KEY (`Producto_idProducto`,`Cliente_idCliente`),
  KEY `fk_Producto_has_Cliente_Cliente1` (`Cliente_idCliente`),
  CONSTRAINT `fk_Producto_has_Cliente_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `fk_Producto_has_Cliente_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `peso` int DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-13 10:47:52
