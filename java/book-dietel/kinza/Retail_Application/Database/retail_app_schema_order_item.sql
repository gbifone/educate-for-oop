
-- Table structure for table `order_item`
--

DROP TABLE IF EXISTS `order_item`;

CREATE TABLE `order_item` (
  `order_Item_ID` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
