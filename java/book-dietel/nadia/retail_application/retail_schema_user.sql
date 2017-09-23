
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `CNIC` varchar(20) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES (1,'Nadia Gull','2345','nadiagull@gmail.com'),(2,'Inam Ullah Taj','52341268','inamullahtaj@gmail.com'),(4,'Aqsa Rasheed','54678987','aqsarasheed@gmail.com'),(5,'Sadia Gull','347652960','sadiagull@yahoo.com'),(6,'asmat','23456789','asmat@gmail.com'),(7,'Faraz','23456789','farazahmed@gmail.com'),(8,'kinza','74345','kinzafatima@gmail.com');