-- Table structure for table `item`

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_ID` int(11) NOT NULL,
  `itemName` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
