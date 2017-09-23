
DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `order_ID` int(11) NOT NULL,
  `dateTime` datetime DEFAULT NULL,
  `user_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_ID`),
  KEY `order_user_user_ID_fk` (`user_ID`),
  CONSTRAINT `order_user_user_ID_fk` FOREIGN KEY (`user_ID`) REFERENCES `user` (`user_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `order` WRITE;

INSERT INTO `order` VALUES (1,'2017-09-15 23:14:44',1);
