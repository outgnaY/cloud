CREATE DATABASE IF NOT EXISTS `account`;
USE `account`;
DROP TABLE IF EXISTS `account_tbl`;
CREATE TABLE `account_tbl` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` varchar(255) NOT NULL UNIQUE,
    `money` int(11) DEFAULT 1,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `account_tbl` (`user_id`, `money`) VALUES
('user_1', 100);