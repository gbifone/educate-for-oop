-- Table structure for table `item`

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `ItemId` int(11) NOT NULL AUTO_INCREMENT,
  `ItemName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ItemId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
