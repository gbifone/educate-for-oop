
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `OrderItemId` int(11) NOT NULL AUTO_INCREMENT,
  `OrderId` int(11) DEFAULT NULL,
  `ItemId` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`OrderItemId`),
  KEY `orderItem_order_OrderId_fk` (`OrderId`),
  KEY `orderItem_item_ItemId_fk` (`ItemId`),
  CONSTRAINT `orderItem_item_ItemId_fk` FOREIGN KEY (`ItemId`) REFERENCES `item` (`ItemId`),
  CONSTRAINT `orderItem_order_OrderId_fk` FOREIGN KEY (`OrderId`) REFERENCES `order` (`OrderId`)
) 
