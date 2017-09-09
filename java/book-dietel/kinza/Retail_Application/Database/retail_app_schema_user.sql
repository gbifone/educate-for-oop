DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_ID` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `cnic` varchar(30) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`user_ID`)
) 