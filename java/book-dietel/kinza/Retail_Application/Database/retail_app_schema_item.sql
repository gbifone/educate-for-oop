
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `item_ID` int(11) NOT NULL AUTO_INCREMENT,
  `itemName` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`item_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
