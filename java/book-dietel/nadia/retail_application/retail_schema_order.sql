DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `OrderId` int(11) NOT NULL,
  `DateTime` datetime DEFAULT NULL,
  `UserId` int(11) DEFAULT NULL,
  PRIMARY KEY (`OrderId`),
  KEY `order_user_Id_fk` (`UserId`),
  CONSTRAINT `order_user_Id_fk` FOREIGN KEY (`UserId`) REFERENCES `user` (`Id`)
) 