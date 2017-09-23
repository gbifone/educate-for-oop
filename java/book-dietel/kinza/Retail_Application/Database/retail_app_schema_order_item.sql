
DROP TABLE IF EXISTS `order_item`;

CREATE TABLE `order_item` (
  `order_Item_ID` int(11) NOT NULL AUTO_INCREMENT,
  `order_ID` int(11) DEFAULT NULL,
  `Item_ID` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_Item_ID`),
  KEY `order_Item_order_order_ID_fk` (`order_ID`),
  KEY `order_Item_item_item_ID_fk` (`Item_ID`),
  CONSTRAINT `order_Item_item_item_ID_fk` FOREIGN KEY (`Item_ID`) REFERENCES `item` (`item_ID`) ON DELETE CASCADE,
  CONSTRAINT `order_Item_order_order_ID_fk` FOREIGN KEY (`order_ID`) REFERENCES `order` (`order_ID`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

LOCK TABLES `order_item` WRITE;

INSERT INTO `order_item` VALUES (1,1,1,3);
