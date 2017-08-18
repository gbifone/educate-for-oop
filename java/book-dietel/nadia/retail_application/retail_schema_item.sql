-- Table structure for table `item`

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `ItemId` int(11) NOT NULL,
  `ItemName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;