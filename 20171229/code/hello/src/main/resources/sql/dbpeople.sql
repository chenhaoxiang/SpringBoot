/*
Navicat MySQL Data Transfer

Source Server         : uifuture
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : dbpeople

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-01-03 21:14:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for people
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `score` double DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of people
-- ----------------------------
INSERT INTO `people` VALUES ('1', '中国', '陈浩翔', null, null);
INSERT INTO `people` VALUES ('2', '湖南', 'c', '20', '23');
INSERT INTO `people` VALUES ('4', '湖南', 'test', '26.3', '20');
INSERT INTO `people` VALUES ('6', '长沙', 'chx', '26.3', '22');
INSERT INTO `people` VALUES ('7', '中', 'test', '26.3', '20');
INSERT INTO `people` VALUES ('8', '湖南', 'test', '26.3', '15');
INSERT INTO `people` VALUES ('9', '中', 'test', '26.3', '20');
INSERT INTO `people` VALUES ('10', '中', 'te', '20', '25');
