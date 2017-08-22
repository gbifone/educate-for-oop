-- Table structure for table `orderitem`

DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `OrderItemId` int(11) NOT NULL,
  `Quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`OrderItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
