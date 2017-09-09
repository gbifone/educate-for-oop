DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `order_ID` int(11) NOT NULL,
  `dateTime` datetime DEFAULT NULL,
  `user_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_ID`),
  KEY `order_user_user_ID_fk` (`user_ID`),
  CONSTRAINT `order_user_user_ID_fk` FOREIGN KEY (`user_ID`) REFERENCES `user` (`user_ID`)
) 