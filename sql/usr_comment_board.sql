/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : testdb

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 20/02/2023 17:53:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for usr_comment_board
-- ----------------------------
DROP TABLE IF EXISTS `usr_comment_board`;
CREATE TABLE `usr_comment_board`  (
  `boardid` int NOT NULL AUTO_INCREMENT COMMENT '留言板id',
  `userid` int NULL DEFAULT NULL COMMENT '留言用户id',
  `boardcontent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '留言板内容',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '留言创建时间',
  PRIMARY KEY (`boardid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of usr_comment_board
-- ----------------------------
INSERT INTO `usr_comment_board` VALUES (2, 2, 'sadasdadsa', '2023-02-20 17:01:44');
INSERT INTO `usr_comment_board` VALUES (3, 2, 'sadasdasda', '2023-02-20 17:01:49');
INSERT INTO `usr_comment_board` VALUES (4, 2, 'xiaolanshab', '2023-02-20 17:22:18');

SET FOREIGN_KEY_CHECKS = 1;
