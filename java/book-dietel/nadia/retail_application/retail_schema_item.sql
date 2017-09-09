DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `ItemId` int(11) NOT NULL AUTO_INCREMENT,
  `ItemName` varchar(20) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `Currency` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ItemId`)
) 