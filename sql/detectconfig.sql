/*
 Navicat Premium Data Transfer

 Source Server         : 10.30.40.10
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : 10.30.40.10:3306
 Source Schema         : faceconfig

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 24/02/2023 16:45:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for detectconfig
-- ----------------------------
DROP TABLE IF EXISTS `detectconfig`;
CREATE TABLE `detectconfig`  (
  `id` int NOT NULL COMMENT '唯一id主键',
  `profileFile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用于替换/profile/的文件夹路径',
  `xmlFile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'opencv训练集存放位置',
  `serverURL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '传输图片到服务端的url',
  `focusFile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '重点人群所在文件夹',
  `trainerFile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '公司训练训练集所在文件夹',
  `aloneTrainerFile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '单张图片比对训练集所在文件夹',
  `opencvTrainer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用的训练集',
  `tempFile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '上传时的临时文件夹',
  `serverIP` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '服务端ip',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of detectconfig
-- ----------------------------
INSERT INTO `detectconfig` VALUES (1, '/home/fengqu/cropped', '/home/fengqu/.local/lib/python3.8/site-packages/cv2/data', 'http://10.30.40.20:8080/business/photo/avata:r', '/upload/', '/home/fengqu/faceDetectDemo/trainer/', '/home/fengqu/faceDetectDemo/onePicTrainer', '/home/fengqu/.local/lib/python3.8/site-packages/cv2/data/haarcascade_frontalface_alt.xml', '/temp/', '10.30.40.20');

SET FOREIGN_KEY_CHECKS = 1;
