
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_ID` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `cnic` varchar(30) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`user_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;

INSERT INTO `user` VALUES (1,'nadia','345678987','nadia@gmail.com'),(2,'kinza','45678654324','kinza@gmail.com'),(4,'inam','34567899','inam@gmail.com'),(5,'laraib','34567890','rola@gmail.com'),(6,'hira','2345678','hira@gmail.com'),(7,'sana','76543234','sanny@gmail.com'),(9,'mady','45678764','maliha@gmail.com');
