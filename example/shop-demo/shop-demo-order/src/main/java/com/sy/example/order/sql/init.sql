CREATE DATABASE IF NOT EXISTS `order`;
use `order`;
DROP TABLE IF EXISTS `order_tbl`;
CREATE TABLE `order_tbl` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `order_id` varchar(255) NOT NULL,
    `user_id` varchar(255) NOT NULL,
    `commodity_code` varchar(255) NOT NULL,
    `count` int(11) DEFAULT 0,
    `money` int(11) DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;