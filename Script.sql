DROP DATABASE IF EXISTS supermarket;
CREATE DATABASE IF NOT EXISTS supermarket;
SHOW DATABASES ;
USE supermarket;

DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer(
    custId VARCHAR(6),
    custTitle VARCHAR(5),
    custName VARCHAR(30) NOT NULL DEFAULT 'Unknown',
    custAddress VARCHAR(30),
    city VARCHAR(20),
    province VARCHAR(20),
    postalCode VARCHAR(9),
    CONSTRAINT PRIMARY KEY (custId)
    );
SHOW TABLES ;
DESCRIBE customer;

DROP TABLE IF EXISTS orders;
CREATE TABLE IF NOT EXISTS orders(
    orderId VARCHAR(15),
    custId VARCHAR(15),
    orderDate DATE,
    orderTime TIME,
    total DECIMAL(8,2),
    CONSTRAINT PRIMARY KEY (orderId),
    CONSTRAINT FOREIGN KEY (custId) REFERENCES customer (custId) ON DELETE CASCADE ON UPDATE CASCADE
    );
SHOW TABLES ;
DESCRIBE orders;

DROP TABLE IF EXISTS item;
CREATE TABLE IF NOT EXISTS item(
    itemCode VARCHAR(6),
    description VARCHAR(50),
    packSize VARCHAR(20),
    unitPrice DECIMAL(6,2),
    qtyOnHand INT(5),
    CONSTRAINT PRIMARY KEY (itemCode)
    );
SHOW TABLES ;
DESCRIBE item;

DROP TABLE IF EXISTS order_detail;
CREATE TABLE IF NOT EXISTS order_detail(
    orderId VARCHAR(15),
    itemCode VARCHAR(15),
    orderQty INT(11),
    discount DECIMAL(6,2),
    CONSTRAINT PRIMARY KEY (orderId, itemCode),
    CONSTRAINT FOREIGN KEY (itemCode) REFERENCES item (itemCode) ON DELETE CASCADE ON UPDATE CASCADE ,
    CONSTRAINT FOREIGN KEY (orderId) REFERENCES orders (orderId) ON DELETE CASCADE ON UPDATE CASCADE
    );
SHOW TABLES ;
DESCRIBE order_detail;