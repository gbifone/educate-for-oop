DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_ID` int(11) NOT NULL AUTO_INCREMENT,
  `itemName` varchar(15) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `currency` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`item_ID`)
) 