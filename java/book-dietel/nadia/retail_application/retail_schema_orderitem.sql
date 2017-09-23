DROP TABLE IF EXISTS `orderitem`;

CREATE TABLE `orderitem` (
  `OrderItemId` int(11) NOT NULL AUTO_INCREMENT,
  `OrderId` int(11) DEFAULT NULL,
  `ItemId` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`OrderItemId`),
  KEY `orderItem_order_OrderId_fk` (`OrderId`),
  KEY `orderItem_item_ItemId_fk` (`ItemId`),
  CONSTRAINT `orderItem_item_ItemId_fk` FOREIGN KEY (`ItemId`) REFERENCES `item` (`ItemId`) ON DELETE CASCADE,
  CONSTRAINT `orderItem_order_OrderId_fk` FOREIGN KEY (`OrderId`) REFERENCES `order` (`OrderId`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

INSERT INTO `orderitem` VALUES (15,13,3,5),(16,13,4,1),(17,18,3,5),(18,19,9,2),(19,21,4,5),(20,21,3,8),(21,21,2,3),(22,22,3,1),(23,22,5,2);
