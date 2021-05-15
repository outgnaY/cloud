CREATE DATABASE IF NOT EXISTS `storage`;
use `storage`;
DROP TABLE IF EXISTS `storage_tbl`;
CREATE TABLE `storage_tbl` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `commodity_code` varchar(255) NOT NULL UNIQUE,
    `count` int(11) DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `storage_tbl` (`commodity_code`, `count`) VALUES
('apple', 6);