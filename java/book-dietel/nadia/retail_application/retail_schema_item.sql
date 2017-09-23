DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `ItemId` int(11) NOT NULL AUTO_INCREMENT,
  `ItemName` varchar(20) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `Currency` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ItemId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `item` VALUES (1,'Watch',457,'PKR'),(2,'MobilePhone',9000,'PKR'),(3,'AC',80000,'PKR'),(4,'TV',10000,'PKR'),(5,'Generator',15000,'PKR'),(6,'Refregator',25000,'PKR'),(7,'Microwave Oven',30000,'PKR'),(8,'Juicer',20000,'PKR'),(9,'Laptop',15000,'PKR'),(10,'Fan',3000,'PKR'),(11,'Charger',800,'PKR');
