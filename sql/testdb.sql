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

 Date: 13/04/2023 17:27:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for std_actv
-- ----------------------------
DROP TABLE IF EXISTS `std_actv`;
CREATE TABLE `std_actv`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `stdid` int NULL DEFAULT NULL COMMENT '学生id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `actvname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '活动名称',
  `attempt` int NULL DEFAULT NULL COMMENT '应参加人数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 901 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of std_actv
-- ----------------------------
INSERT INTO `std_actv` VALUES (751, 301, '俞泰宁', 'python答辩', 4);
INSERT INTO `std_actv` VALUES (752, 301, '俞泰宁', 'linux答辩', 4);
INSERT INTO `std_actv` VALUES (753, 301, '俞泰宁', '青年下乡', 4);
INSERT INTO `std_actv` VALUES (754, 302, '家勇', '就业招聘会', 2);
INSERT INTO `std_actv` VALUES (755, 302, '家勇', '军事实习', 2);
INSERT INTO `std_actv` VALUES (756, 302, '家勇', '就业招聘会', 2);
INSERT INTO `std_actv` VALUES (757, 303, '罗晋鹏', '课外实习', 3);
INSERT INTO `std_actv` VALUES (758, 303, '罗晋鹏', '文艺表演', 3);
INSERT INTO `std_actv` VALUES (759, 303, '罗晋鹏', 'linux答辩', 3);
INSERT INTO `std_actv` VALUES (760, 304, '隆朋义', '大扫除', 4);
INSERT INTO `std_actv` VALUES (761, 304, '隆朋义', '军训', 4);
INSERT INTO `std_actv` VALUES (762, 304, '隆朋义', '军训', 4);
INSERT INTO `std_actv` VALUES (763, 305, '濮玉韵', '大扫除', 4);
INSERT INTO `std_actv` VALUES (764, 305, '濮玉韵', '军训', 4);
INSERT INTO `std_actv` VALUES (765, 305, '濮玉韵', '课外实习', 4);
INSERT INTO `std_actv` VALUES (766, 306, '封康成', 'hadoop答辩', 4);
INSERT INTO `std_actv` VALUES (767, 306, '封康成', 'linux答辩', 4);
INSERT INTO `std_actv` VALUES (768, 306, '封康成', 'hadoop答辩', 4);
INSERT INTO `std_actv` VALUES (769, 307, '王文虹', '文艺表演', 1);
INSERT INTO `std_actv` VALUES (770, 307, '王文虹', '就业训练', 1);
INSERT INTO `std_actv` VALUES (771, 307, '王文虹', '青年下乡', 1);
INSERT INTO `std_actv` VALUES (772, 308, '井开济', 'hadoop答辩', 4);
INSERT INTO `std_actv` VALUES (773, 308, '井开济', 'hadoop答辩', 4);
INSERT INTO `std_actv` VALUES (774, 308, '井开济', 'linux答辩', 4);
INSERT INTO `std_actv` VALUES (775, 309, '璩浩博', '课业实习', 3);
INSERT INTO `std_actv` VALUES (776, 309, '璩浩博', '课外实习', 3);
INSERT INTO `std_actv` VALUES (777, 309, '璩浩博', '就业训练', 3);
INSERT INTO `std_actv` VALUES (778, 310, '车峻熙', 'hadoop答辩', 2);
INSERT INTO `std_actv` VALUES (779, 310, '车峻熙', 'Java答辩', 2);
INSERT INTO `std_actv` VALUES (780, 310, '车峻熙', 'linux答辩', 2);
INSERT INTO `std_actv` VALUES (781, 311, '宰丽', '心理健康测试', 4);
INSERT INTO `std_actv` VALUES (782, 311, '宰丽', '军训', 4);
INSERT INTO `std_actv` VALUES (783, 311, '宰丽', '就业训练', 4);
INSERT INTO `std_actv` VALUES (784, 312, '归华奥', '入学体检', 4);
INSERT INTO `std_actv` VALUES (785, 312, '归华奥', '课业实习', 4);
INSERT INTO `std_actv` VALUES (786, 312, '归华奥', '文艺表演', 4);
INSERT INTO `std_actv` VALUES (787, 313, '宗天磊', 'linux答辩', 3);
INSERT INTO `std_actv` VALUES (788, 313, '宗天磊', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (789, 313, '宗天磊', '文艺表演', 3);
INSERT INTO `std_actv` VALUES (790, 314, '乐彭泽', '就业训练', 1);
INSERT INTO `std_actv` VALUES (791, 314, '乐彭泽', '大扫除', 1);
INSERT INTO `std_actv` VALUES (792, 314, '乐彭泽', '大扫除', 1);
INSERT INTO `std_actv` VALUES (793, 315, '岑泰宁', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (794, 315, '岑泰宁', '课外实习', 3);
INSERT INTO `std_actv` VALUES (795, 315, '岑泰宁', 'linux答辩', 3);
INSERT INTO `std_actv` VALUES (796, 316, '古睿慈', '课业实习', 4);
INSERT INTO `std_actv` VALUES (797, 316, '古睿慈', '青年下乡', 4);
INSERT INTO `std_actv` VALUES (798, 316, '古睿慈', '课业实习', 4);
INSERT INTO `std_actv` VALUES (799, 317, '梅蕴和', '心理健康测试', 1);
INSERT INTO `std_actv` VALUES (800, 317, '梅蕴和', '心理健康测试', 1);
INSERT INTO `std_actv` VALUES (801, 317, '梅蕴和', 'hadoop答辩', 1);
INSERT INTO `std_actv` VALUES (802, 318, '漆雕高格', '课业实习', 3);
INSERT INTO `std_actv` VALUES (803, 318, '漆雕高格', '文艺表演', 3);
INSERT INTO `std_actv` VALUES (804, 318, '漆雕高格', '军事实习', 3);
INSERT INTO `std_actv` VALUES (805, 319, '公孙智宸', '大扫除', 1);
INSERT INTO `std_actv` VALUES (806, 319, '公孙智宸', 'python答辩', 1);
INSERT INTO `std_actv` VALUES (807, 319, '公孙智宸', '青年下乡', 1);
INSERT INTO `std_actv` VALUES (808, 320, '宰涛', '军训', 3);
INSERT INTO `std_actv` VALUES (809, 320, '宰涛', '青年下乡', 3);
INSERT INTO `std_actv` VALUES (810, 320, '宰涛', 'hadoop答辩', 3);
INSERT INTO `std_actv` VALUES (811, 321, '闻人伟', '大扫除', 3);
INSERT INTO `std_actv` VALUES (812, 321, '闻人伟', '课业实习', 3);
INSERT INTO `std_actv` VALUES (813, 321, '闻人伟', 'python答辩', 3);
INSERT INTO `std_actv` VALUES (814, 322, '贺和安', '心理健康测试', 1);
INSERT INTO `std_actv` VALUES (815, 322, '贺和安', '军事实习', 1);
INSERT INTO `std_actv` VALUES (816, 322, '贺和安', '军训', 1);
INSERT INTO `std_actv` VALUES (817, 323, '宁勇', '入学体检', 3);
INSERT INTO `std_actv` VALUES (818, 323, '宁勇', 'linux答辩', 3);
INSERT INTO `std_actv` VALUES (819, 323, '宁勇', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (820, 324, '葛凯安', '青年下乡', 3);
INSERT INTO `std_actv` VALUES (821, 324, '葛凯安', '军事实习', 3);
INSERT INTO `std_actv` VALUES (822, 324, '葛凯安', '军事实习', 3);
INSERT INTO `std_actv` VALUES (823, 325, '巫马景同', '心理健康测试', 3);
INSERT INTO `std_actv` VALUES (824, 325, '巫马景同', '就业训练', 3);
INSERT INTO `std_actv` VALUES (825, 325, '巫马景同', '文艺表演', 3);
INSERT INTO `std_actv` VALUES (826, 326, '毋建明', 'linux答辩', 4);
INSERT INTO `std_actv` VALUES (827, 326, '毋建明', '心理健康测试', 4);
INSERT INTO `std_actv` VALUES (828, 326, '毋建明', '课外实习', 4);
INSERT INTO `std_actv` VALUES (829, 327, '羊舌昊然', '军事实习', 4);
INSERT INTO `std_actv` VALUES (830, 327, '羊舌昊然', '入学体检', 4);
INSERT INTO `std_actv` VALUES (831, 327, '羊舌昊然', '课业实习', 4);
INSERT INTO `std_actv` VALUES (832, 328, '闾丘瑾瑜', '大扫除', 2);
INSERT INTO `std_actv` VALUES (833, 328, '闾丘瑾瑜', '青年下乡', 2);
INSERT INTO `std_actv` VALUES (834, 328, '闾丘瑾瑜', 'Java答辩', 2);
INSERT INTO `std_actv` VALUES (835, 329, '成越彬', '就业招聘会', 2);
INSERT INTO `std_actv` VALUES (836, 329, '成越彬', '就业招聘会', 2);
INSERT INTO `std_actv` VALUES (837, 329, '成越彬', 'hadoop答辩', 2);
INSERT INTO `std_actv` VALUES (838, 330, '熊昊然', '课外实习', 3);
INSERT INTO `std_actv` VALUES (839, 330, '熊昊然', '文艺表演', 3);
INSERT INTO `std_actv` VALUES (840, 330, '熊昊然', '课业实习', 3);
INSERT INTO `std_actv` VALUES (841, 331, '慎熠彤', '入学体检', 3);
INSERT INTO `std_actv` VALUES (842, 331, '慎熠彤', 'python答辩', 3);
INSERT INTO `std_actv` VALUES (843, 331, '慎熠彤', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (844, 332, '麹强', '就业训练', 3);
INSERT INTO `std_actv` VALUES (845, 332, '麹强', 'python答辩', 3);
INSERT INTO `std_actv` VALUES (846, 332, '麹强', '就业训练', 3);
INSERT INTO `std_actv` VALUES (847, 333, '赖雨泽', '青年下乡', 2);
INSERT INTO `std_actv` VALUES (848, 333, '赖雨泽', '文艺表演', 2);
INSERT INTO `std_actv` VALUES (849, 333, '赖雨泽', 'hadoop答辩', 2);
INSERT INTO `std_actv` VALUES (850, 334, '武咏德', 'linux答辩', 2);
INSERT INTO `std_actv` VALUES (851, 334, '武咏德', '入学体检', 2);
INSERT INTO `std_actv` VALUES (852, 334, '武咏德', 'linux答辩', 2);
INSERT INTO `std_actv` VALUES (853, 335, '熊娟', 'Java答辩', 1);
INSERT INTO `std_actv` VALUES (854, 335, '熊娟', '大扫除', 1);
INSERT INTO `std_actv` VALUES (855, 335, '熊娟', '青年下乡', 1);
INSERT INTO `std_actv` VALUES (856, 336, '蒙丽', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (857, 336, '蒙丽', 'Java答辩', 3);
INSERT INTO `std_actv` VALUES (858, 336, '蒙丽', 'Java答辩', 3);
INSERT INTO `std_actv` VALUES (859, 337, '上官伟', 'spark答辩', 4);
INSERT INTO `std_actv` VALUES (860, 337, '上官伟', '入学体检', 4);
INSERT INTO `std_actv` VALUES (861, 337, '上官伟', '课外实习', 4);
INSERT INTO `std_actv` VALUES (862, 338, '刘伟祺', '入学体检', 3);
INSERT INTO `std_actv` VALUES (863, 338, '刘伟祺', '军事实习', 3);
INSERT INTO `std_actv` VALUES (864, 338, '刘伟祺', '入学体检', 3);
INSERT INTO `std_actv` VALUES (865, 339, '钱正志', '就业招聘会', 4);
INSERT INTO `std_actv` VALUES (866, 339, '钱正志', '课业实习', 4);
INSERT INTO `std_actv` VALUES (867, 339, '钱正志', '就业训练', 4);
INSERT INTO `std_actv` VALUES (868, 340, '孟明达', 'linux答辩', 4);
INSERT INTO `std_actv` VALUES (869, 340, '孟明达', '课外实习', 4);
INSERT INTO `std_actv` VALUES (870, 340, '孟明达', '就业训练', 4);
INSERT INTO `std_actv` VALUES (871, 341, '吕远航', '青年下乡', 3);
INSERT INTO `std_actv` VALUES (872, 341, '吕远航', '课业实习', 3);
INSERT INTO `std_actv` VALUES (873, 341, '吕远航', '就业训练', 3);
INSERT INTO `std_actv` VALUES (874, 342, '栾明辉', 'Java答辩', 3);
INSERT INTO `std_actv` VALUES (875, 342, '栾明辉', '心理健康测试', 3);
INSERT INTO `std_actv` VALUES (876, 342, '栾明辉', '青年下乡', 3);
INSERT INTO `std_actv` VALUES (877, 343, '凤艳', '大扫除', 4);
INSERT INTO `std_actv` VALUES (878, 343, '凤艳', '就业训练', 4);
INSERT INTO `std_actv` VALUES (879, 343, '凤艳', '军事实习', 4);
INSERT INTO `std_actv` VALUES (880, 344, '杭嘉慕', '入学体检', 2);
INSERT INTO `std_actv` VALUES (881, 344, '杭嘉慕', '心理健康测试', 2);
INSERT INTO `std_actv` VALUES (882, 344, '杭嘉慕', '课业实习', 2);
INSERT INTO `std_actv` VALUES (883, 345, '督刚', '军训', 3);
INSERT INTO `std_actv` VALUES (884, 345, '督刚', '军训', 3);
INSERT INTO `std_actv` VALUES (885, 345, '督刚', 'hadoop答辩', 3);
INSERT INTO `std_actv` VALUES (886, 346, '胡艳', '文艺表演', 4);
INSERT INTO `std_actv` VALUES (887, 346, '胡艳', '入学体检', 4);
INSERT INTO `std_actv` VALUES (888, 346, '胡艳', 'hadoop答辩', 4);
INSERT INTO `std_actv` VALUES (889, 347, '慕芳', '心理健康测试', 3);
INSERT INTO `std_actv` VALUES (890, 347, '慕芳', '青年下乡', 3);
INSERT INTO `std_actv` VALUES (891, 347, '慕芳', 'Java答辩', 3);
INSERT INTO `std_actv` VALUES (892, 348, '璩强', '课外实习', 3);
INSERT INTO `std_actv` VALUES (893, 348, '璩强', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (894, 348, '璩强', 'spark答辩', 3);
INSERT INTO `std_actv` VALUES (895, 349, '高星阑', '就业招聘会', 3);
INSERT INTO `std_actv` VALUES (896, 349, '高星阑', '青年下乡', 3);
INSERT INTO `std_actv` VALUES (897, 349, '高星阑', 'Java答辩', 3);
INSERT INTO `std_actv` VALUES (898, 350, '伯杰', 'spark答辩', 2);
INSERT INTO `std_actv` VALUES (899, 350, '伯杰', '青年下乡', 2);
INSERT INTO `std_actv` VALUES (900, 350, '伯杰', 'python答辩', 2);

-- ----------------------------
-- Table structure for std_actvalarm
-- ----------------------------
DROP TABLE IF EXISTS `std_actvalarm`;
CREATE TABLE `std_actvalarm`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `stdid` int NULL DEFAULT NULL COMMENT '学生id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `ifattempt` int NULL DEFAULT NULL COMMENT '学生活动参与率是否足够 1是0否',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 101 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of std_actvalarm
-- ----------------------------
INSERT INTO `std_actvalarm` VALUES (1, 302, '家勇', 1);
INSERT INTO `std_actvalarm` VALUES (2, 301, '俞泰宁', 0);
INSERT INTO `std_actvalarm` VALUES (3, 303, '罗晋鹏', 0);
INSERT INTO `std_actvalarm` VALUES (4, 304, '隆朋义', 0);
INSERT INTO `std_actvalarm` VALUES (5, 350, '伯杰', 1);
INSERT INTO `std_actvalarm` VALUES (6, 346, '胡艳', 0);
INSERT INTO `std_actvalarm` VALUES (7, 347, '慕芳', 0);
INSERT INTO `std_actvalarm` VALUES (8, 344, '杭嘉慕', 1);
INSERT INTO `std_actvalarm` VALUES (9, 349, '高星阑', 0);
INSERT INTO `std_actvalarm` VALUES (10, 345, '督刚', 0);
INSERT INTO `std_actvalarm` VALUES (11, 341, '吕远航', 0);
INSERT INTO `std_actvalarm` VALUES (12, 342, '栾明辉', 0);
INSERT INTO `std_actvalarm` VALUES (13, 348, '璩强', 0);
INSERT INTO `std_actvalarm` VALUES (14, 337, '上官伟', 0);
INSERT INTO `std_actvalarm` VALUES (15, 338, '刘伟祺', 0);
INSERT INTO `std_actvalarm` VALUES (16, 340, '孟明达', 0);
INSERT INTO `std_actvalarm` VALUES (17, 343, '凤艳', 0);
INSERT INTO `std_actvalarm` VALUES (18, 328, '闾丘瑾瑜', 1);
INSERT INTO `std_actvalarm` VALUES (19, 330, '熊昊然', 0);
INSERT INTO `std_actvalarm` VALUES (20, 336, '蒙丽', 0);
INSERT INTO `std_actvalarm` VALUES (21, 339, '钱正志', 0);
INSERT INTO `std_actvalarm` VALUES (22, 325, '巫马景同', 0);
INSERT INTO `std_actvalarm` VALUES (23, 326, '毋建明', 0);
INSERT INTO `std_actvalarm` VALUES (24, 335, '熊娟', 1);
INSERT INTO `std_actvalarm` VALUES (25, 327, '羊舌昊然', 0);
INSERT INTO `std_actvalarm` VALUES (26, 324, '葛凯安', 0);
INSERT INTO `std_actvalarm` VALUES (27, 319, '公孙智宸', 1);
INSERT INTO `std_actvalarm` VALUES (28, 334, '武咏德', 1);
INSERT INTO `std_actvalarm` VALUES (29, 323, '宁勇', 0);
INSERT INTO `std_actvalarm` VALUES (30, 315, '岑泰宁', 0);
INSERT INTO `std_actvalarm` VALUES (31, 318, '漆雕高格', 0);
INSERT INTO `std_actvalarm` VALUES (32, 322, '贺和安', 1);
INSERT INTO `std_actvalarm` VALUES (33, 314, '乐彭泽', 1);
INSERT INTO `std_actvalarm` VALUES (34, 333, '赖雨泽', 1);
INSERT INTO `std_actvalarm` VALUES (35, 312, '归华奥', 0);
INSERT INTO `std_actvalarm` VALUES (36, 332, '麹强', 0);
INSERT INTO `std_actvalarm` VALUES (37, 321, '闻人伟', 0);
INSERT INTO `std_actvalarm` VALUES (38, 310, '车峻熙', 1);
INSERT INTO `std_actvalarm` VALUES (39, 308, '井开济', 0);
INSERT INTO `std_actvalarm` VALUES (40, 331, '慎熠彤', 0);
INSERT INTO `std_actvalarm` VALUES (41, 320, '宰涛', 0);
INSERT INTO `std_actvalarm` VALUES (42, 307, '王文虹', 1);
INSERT INTO `std_actvalarm` VALUES (43, 329, '成越彬', 1);
INSERT INTO `std_actvalarm` VALUES (44, 313, '宗天磊', 0);
INSERT INTO `std_actvalarm` VALUES (45, 317, '梅蕴和', 1);
INSERT INTO `std_actvalarm` VALUES (46, 306, '封康成', 0);
INSERT INTO `std_actvalarm` VALUES (47, 316, '古睿慈', 0);
INSERT INTO `std_actvalarm` VALUES (48, 311, '宰丽', 0);
INSERT INTO `std_actvalarm` VALUES (49, 309, '璩浩博', 0);
INSERT INTO `std_actvalarm` VALUES (50, 305, '濮玉韵', 0);

-- ----------------------------
-- Table structure for std_allinfo
-- ----------------------------
DROP TABLE IF EXISTS `std_allinfo`;
CREATE TABLE `std_allinfo`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `classname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生所在班级',
  `inschool` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生是否在校 1是0否',
  `academy` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生所在学院',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 351 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of std_allinfo
-- ----------------------------
INSERT INTO `std_allinfo` VALUES (301, '俞泰宁', '大数据1903', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (302, '家勇', '软工1902', '0', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (303, '罗晋鹏', '计科1901', '0', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (304, '隆朋义', '软工1903', '0', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (305, '濮玉韵', '大数据2004', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (306, '封康成', '大数据2002', '1', '土木工程与建筑学院');
INSERT INTO `std_allinfo` VALUES (307, '王文虹', '计科2004', '1', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (308, '井开济', '大数据1904', '0', '机械工程学院');
INSERT INTO `std_allinfo` VALUES (309, '璩浩博', '软工2004', '1', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (310, '车峻熙', '大数据2002', '1', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (311, '宰丽', '计科1901', '0', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (312, '归华奥', '大数据1901', '1', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (313, '宗天磊', '大数据2003', '1', '机械工程学院');
INSERT INTO `std_allinfo` VALUES (314, '乐彭泽', '大数据1901', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (315, '岑泰宁', '大数据1904', '0', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (316, '古睿慈', '大数据1901', '1', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (317, '梅蕴和', '软工2001', '0', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (318, '漆雕高格', '软工1903', '1', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (319, '公孙智宸', '软工1902', '0', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (320, '宰涛', '大数据2001', '0', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (321, '闻人伟', '大数据2001', '0', '机械工程学院');
INSERT INTO `std_allinfo` VALUES (322, '贺和安', '软工1902', '0', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (323, '宁勇', '大数据1904', '1', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (324, '葛凯安', '计科1901', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (325, '巫马景同', '计科1902', '1', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (326, '毋建明', '软工1903', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (327, '羊舌昊然', '软工1901', '0', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (328, '闾丘瑾瑜', '计科1903', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (329, '成越彬', '大数据1904', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (330, '熊昊然', '计科1901', '1', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (331, '慎熠彤', '软工2002', '1', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (332, '麹强', '计科1902', '0', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (333, '赖雨泽', '计科2003', '0', '土木工程与建筑学院');
INSERT INTO `std_allinfo` VALUES (334, '武咏德', '计科1901', '1', '机械工程学院');
INSERT INTO `std_allinfo` VALUES (335, '熊娟', '大数据2001', '0', '机械工程学院');
INSERT INTO `std_allinfo` VALUES (336, '蒙丽', '大数据2001', '1', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (337, '上官伟', '计科1901', '1', '土木工程与建筑学院');
INSERT INTO `std_allinfo` VALUES (338, '刘伟祺', '大数据2003', '1', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (339, '钱正志', '软工1904', '1', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (340, '孟明达', '大数据1904', '0', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (341, '吕远航', '软工1903', '0', '土木工程与建筑学院');
INSERT INTO `std_allinfo` VALUES (342, '栾明辉', '大数据1904', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (343, '凤艳', '软工1904', '0', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (344, '杭嘉慕', '计科1904', '1', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (345, '督刚', '大数据1903', '1', '化学与环境工程学院');
INSERT INTO `std_allinfo` VALUES (346, '胡艳', '软工2002', '0', '经济与管理学院');
INSERT INTO `std_allinfo` VALUES (347, '慕芳', '大数据2004', '1', '电气与电子工程学院');
INSERT INTO `std_allinfo` VALUES (348, '璩强', '软工2001', '1', '土木工程与建筑学院');
INSERT INTO `std_allinfo` VALUES (349, '高星阑', '计科1901', '0', '数学与计算机学院');
INSERT INTO `std_allinfo` VALUES (350, '伯杰', '软工2003', '0', '化学与环境工程学院');

-- ----------------------------
-- Table structure for std_exam
-- ----------------------------
DROP TABLE IF EXISTS `std_exam`;
CREATE TABLE `std_exam`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '考试信息id',
  `stdid` int NULL DEFAULT NULL COMMENT '学生id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生名称',
  `examclass` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '考试科目',
  `score` int NULL DEFAULT NULL COMMENT '成绩',
  `academy` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3050 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of std_exam
-- ----------------------------
INSERT INTO `std_exam` VALUES (2900, 301, '俞泰宁', 'linux', 51, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2901, 301, '俞泰宁', '人工智能', 77, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2902, 301, '俞泰宁', '大学物理', 68, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2903, 302, '家勇', '计算机概论', 82, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2904, 302, '家勇', '网络编程', 71, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2905, 302, '家勇', '离散数学', 84, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2906, 303, '罗晋鹏', '计算机组成原理', 82, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2907, 303, '罗晋鹏', '高等数学', 62, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2908, 303, '罗晋鹏', '高等数学2', 44, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2909, 304, '隆朋义', '网络编程', 78, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2910, 304, '隆朋义', '计算机网络', 77, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2911, 304, '隆朋义', 'linux', 87, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2912, 305, '濮玉韵', 'python', 51, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2913, 305, '濮玉韵', '人工智能', 54, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2914, 305, '濮玉韵', '计算机网络', 90, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2915, 306, '封康成', '网络编程', 77, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (2916, 306, '封康成', '高等数学', 43, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (2917, 306, '封康成', '网络编程', 56, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (2918, 307, '王文虹', '计算机理论', 90, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2919, 307, '王文虹', '概率论', 44, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2920, 307, '王文虹', '计算机概论', 68, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2921, 308, '井开济', 'hadoop', 89, '机械工程学院');
INSERT INTO `std_exam` VALUES (2922, 308, '井开济', '计算机理论', 54, '机械工程学院');
INSERT INTO `std_exam` VALUES (2923, 308, '井开济', '高等数学', 76, '机械工程学院');
INSERT INTO `std_exam` VALUES (2924, 309, '璩浩博', '高等数学2', 47, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2925, 309, '璩浩博', 'linux', 53, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2926, 309, '璩浩博', '计算机组成原理', 56, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2927, 310, '车峻熙', '概率论', 59, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2928, 310, '车峻熙', '概率论', 66, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2929, 310, '车峻熙', '高等数学2', 55, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2930, 311, '宰丽', '大学物理', 84, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2931, 311, '宰丽', '概率论', 78, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2932, 311, '宰丽', '计算机组成原理', 85, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2933, 312, '归华奥', '大学物理', 86, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2934, 312, '归华奥', 'python', 78, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2935, 312, '归华奥', '数据库与数据库实践', 53, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2936, 313, '宗天磊', '人工智能', 73, '机械工程学院');
INSERT INTO `std_exam` VALUES (2937, 313, '宗天磊', '计算机理论', 70, '机械工程学院');
INSERT INTO `std_exam` VALUES (2938, 313, '宗天磊', '大学物理', 66, '机械工程学院');
INSERT INTO `std_exam` VALUES (2939, 314, '乐彭泽', '大学物理', 89, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2940, 314, '乐彭泽', '离散数学', 75, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2941, 314, '乐彭泽', '计算机组成原理', 75, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2942, 315, '岑泰宁', 'spark', 45, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2943, 315, '岑泰宁', '大学物理', 88, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2944, 315, '岑泰宁', 'spark', 41, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2945, 316, '古睿慈', '大学物理', 53, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2946, 316, '古睿慈', 'spark', 67, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2947, 316, '古睿慈', '数据库与数据库实践', 43, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2948, 317, '梅蕴和', 'c语言', 77, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2949, 317, '梅蕴和', '高等数学', 89, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2950, 317, '梅蕴和', '计算机概论', 49, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2951, 318, '漆雕高格', '离散数学', 84, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2952, 318, '漆雕高格', '神经网络', 60, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2953, 318, '漆雕高格', '离散数学', 73, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2954, 319, '公孙智宸', '离散数学', 81, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2955, 319, '公孙智宸', 'spark', 77, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2956, 319, '公孙智宸', '计算机网络', 85, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2957, 320, '宰涛', 'python', 40, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2958, 320, '宰涛', '计算机概论', 48, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2959, 320, '宰涛', '网络编程', 40, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2960, 321, '闻人伟', 'flink', 44, '机械工程学院');
INSERT INTO `std_exam` VALUES (2961, 321, '闻人伟', '离散数学', 90, '机械工程学院');
INSERT INTO `std_exam` VALUES (2962, 321, '闻人伟', 'hadoop', 56, '机械工程学院');
INSERT INTO `std_exam` VALUES (2963, 322, '贺和安', '数据库与数据库实践', 47, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2964, 322, '贺和安', '计算机组成原理', 89, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2965, 322, '贺和安', '计算机组成原理', 48, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (2966, 323, '宁勇', '网络编程', 40, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2967, 323, '宁勇', '计算机理论', 74, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2968, 323, '宁勇', '计算机概论', 42, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2969, 324, '葛凯安', '大学物理', 83, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2970, 324, '葛凯安', 'c语言', 93, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2971, 324, '葛凯安', '高等数学2', 55, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2972, 325, '巫马景同', '高等数学2', 66, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2973, 325, '巫马景同', '神经网络', 42, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2974, 325, '巫马景同', '计算机组成原理', 87, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2975, 326, '毋建明', 'linux', 60, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2976, 326, '毋建明', '大学物理', 53, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2977, 326, '毋建明', '线性代数', 46, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2978, 327, '羊舌昊然', '大学物理', 80, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2979, 327, '羊舌昊然', '大学物理', 44, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2980, 327, '羊舌昊然', '人工智能', 60, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2981, 328, '闾丘瑾瑜', '计算机概论', 53, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2982, 328, '闾丘瑾瑜', '概率论', 57, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2983, 328, '闾丘瑾瑜', '网络编程', 43, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2984, 329, '成越彬', '线性代数', 51, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2985, 329, '成越彬', 'spark', 50, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2986, 329, '成越彬', '大学物理', 85, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (2987, 330, '熊昊然', '概率论', 78, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2988, 330, '熊昊然', '高等数学2', 54, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2989, 330, '熊昊然', '神经网络', 40, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2990, 331, '慎熠彤', '高等数学', 85, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2991, 331, '慎熠彤', '计算机组成原理', 57, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2992, 331, '慎熠彤', '计算机组成原理', 87, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (2993, 332, '麹强', 'hadoop', 41, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2994, 332, '麹强', '概率论', 55, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2995, 332, '麹强', '人工智能', 80, '经济与管理学院');
INSERT INTO `std_exam` VALUES (2996, 333, '赖雨泽', '计算机网络', 49, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (2997, 333, '赖雨泽', '大学物理', 51, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (2998, 333, '赖雨泽', 'linux', 93, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (2999, 334, '武咏德', '计算机网络', 40, '机械工程学院');
INSERT INTO `std_exam` VALUES (3000, 334, '武咏德', '数据库与数据库实践', 44, '机械工程学院');
INSERT INTO `std_exam` VALUES (3001, 334, '武咏德', '大学物理2', 42, '机械工程学院');
INSERT INTO `std_exam` VALUES (3002, 335, '熊娟', '数据库与数据库实践', 60, '机械工程学院');
INSERT INTO `std_exam` VALUES (3003, 335, '熊娟', '人工智能', 55, '机械工程学院');
INSERT INTO `std_exam` VALUES (3004, 335, '熊娟', '大学物理', 59, '机械工程学院');
INSERT INTO `std_exam` VALUES (3005, 336, '蒙丽', 'python', 52, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3006, 336, '蒙丽', '概率论', 47, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3007, 336, '蒙丽', '计算机网络', 50, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3008, 337, '上官伟', '大学物理', 61, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3009, 337, '上官伟', '计算机概论', 84, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3010, 337, '上官伟', 'c语言', 71, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3011, 338, '刘伟祺', '计算机概论', 77, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3012, 338, '刘伟祺', '线性代数', 57, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3013, 338, '刘伟祺', 'spark', 78, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3014, 339, '钱正志', 'linux', 68, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3015, 339, '钱正志', '大学物理', 80, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3016, 339, '钱正志', 'linux', 93, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3017, 340, '孟明达', 'spark', 84, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3018, 340, '孟明达', '大学物理', 44, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3019, 340, '孟明达', '大学物理', 65, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3020, 341, '吕远航', '高等数学', 80, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3021, 341, '吕远航', 'flink', 91, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3022, 341, '吕远航', '人工智能', 82, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3023, 342, '栾明辉', '数据库与数据库实践', 42, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3024, 342, '栾明辉', '神经网络', 85, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3025, 342, '栾明辉', '数据库与数据库实践', 71, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3026, 343, '凤艳', '人工智能', 84, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3027, 343, '凤艳', '高等数学2', 71, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3028, 343, '凤艳', 'python', 48, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3029, 344, '杭嘉慕', '人工智能', 83, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3030, 344, '杭嘉慕', '线性代数', 45, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3031, 344, '杭嘉慕', '人工智能', 74, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3032, 345, '督刚', 'flink', 46, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3033, 345, '督刚', '计算机理论', 91, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3034, 345, '督刚', '大学物理', 67, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3035, 346, '胡艳', '网络编程', 72, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3036, 346, '胡艳', '高等数学2', 53, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3037, 346, '胡艳', 'linux', 81, '经济与管理学院');
INSERT INTO `std_exam` VALUES (3038, 347, '慕芳', '线性代数', 75, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3039, 347, '慕芳', '线性代数', 72, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3040, 347, '慕芳', '大学物理', 58, '电气与电子工程学院');
INSERT INTO `std_exam` VALUES (3041, 348, '璩强', '网络编程', 67, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3042, 348, '璩强', '计算机概论', 69, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3043, 348, '璩强', '人工智能', 63, '土木工程与建筑学院');
INSERT INTO `std_exam` VALUES (3044, 349, '高星阑', '离散数学', 40, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3045, 349, '高星阑', '概率论', 90, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3046, 349, '高星阑', 'linux', 78, '数学与计算机学院');
INSERT INTO `std_exam` VALUES (3047, 350, '伯杰', '大学物理2', 80, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3048, 350, '伯杰', 'flink', 81, '化学与环境工程学院');
INSERT INTO `std_exam` VALUES (3049, 350, '伯杰', '大学物理', 91, '化学与环境工程学院');

-- ----------------------------
-- Table structure for std_info
-- ----------------------------
DROP TABLE IF EXISTS `std_info`;
CREATE TABLE `std_info`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `classname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生所在班级',
  `inschool` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生是否在校 1是0否',
  `passrate` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生考试通过率',
  `actvrate` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学生活动参与率',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1100 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of std_info
-- ----------------------------
INSERT INTO `std_info` VALUES (301, '俞泰宁', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (302, '家勇', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (303, '罗晋鹏', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (304, '隆朋义', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (305, '濮玉韵', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (306, '封康成', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (307, '王文虹', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (308, '井开济', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (309, '璩浩博', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (310, '车峻熙', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (311, '宰丽', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (312, '归华奥', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (313, '宗天磊', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (314, '乐彭泽', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (315, '岑泰宁', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (316, '古睿慈', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (317, '梅蕴和', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (318, '漆雕高格', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (319, '公孙智宸', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (320, '宰涛', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (321, '闻人伟', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (322, '贺和安', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (323, '宁勇', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (324, '葛凯安', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (325, '巫马景同', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (326, '毋建明', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (327, '羊舌昊然', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (328, '闾丘瑾瑜', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (329, '成越彬', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (330, '熊昊然', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (331, '慎熠彤', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (332, '麹强', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (333, '赖雨泽', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (334, '武咏德', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (335, '熊娟', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (336, '蒙丽', NULL, NULL, 'Fail', NULL);
INSERT INTO `std_info` VALUES (337, '上官伟', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (338, '刘伟祺', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (339, '钱正志', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (340, '孟明达', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (341, '吕远航', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (342, '栾明辉', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (343, '凤艳', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (344, '杭嘉慕', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (345, '督刚', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (346, '胡艳', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (347, '慕芳', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (348, '璩强', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (349, '高星阑', NULL, NULL, 'Pass', NULL);
INSERT INTO `std_info` VALUES (350, '伯杰', NULL, NULL, 'Pass', NULL);

-- ----------------------------
-- Table structure for std_scorebar
-- ----------------------------
DROP TABLE IF EXISTS `std_scorebar`;
CREATE TABLE `std_scorebar`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '事件id',
  `avgscore` int NULL DEFAULT NULL COMMENT '平均分',
  `academy` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of std_scorebar
-- ----------------------------
INSERT INTO `std_scorebar` VALUES (1, 69, '电气与电子工程学院');
INSERT INTO `std_scorebar` VALUES (2, 66, '数学与计算机学院');
INSERT INTO `std_scorebar` VALUES (3, 60, '经济与管理学院');
INSERT INTO `std_scorebar` VALUES (4, 61, '机械工程学院');
INSERT INTO `std_scorebar` VALUES (5, 69, '化学与环境工程学院');
INSERT INTO `std_scorebar` VALUES (6, 69, '土木工程与建筑学院');

-- ----------------------------
-- Table structure for sys_blog
-- ----------------------------
DROP TABLE IF EXISTS `sys_blog`;
CREATE TABLE `sys_blog`  (
  `userid` int NOT NULL COMMENT '博客创建者id',
  `blogcontent` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '博客内容',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '博客创建时间',
  `blogid` int NOT NULL AUTO_INCREMENT COMMENT '博客识别id 主键',
  `blogtitle` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '博客标题',
  PRIMARY KEY (`blogid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 16 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_blog
-- ----------------------------
INSERT INTO `sys_blog` VALUES (1, 'sadasdasd', '2023-02-20 15:45:03', 1, 'sdads');
INSERT INTO `sys_blog` VALUES (2, 'asdasd', '2023-02-20 15:45:12', 11, 'asdasd');
INSERT INTO `sys_blog` VALUES (2, 'asdsadasdsa', '2023-02-20 15:45:31', 12, 'asdasdada');
INSERT INTO `sys_blog` VALUES (2, 'asdasdasd', '2023-02-20 15:45:42', 13, 'asdasdasd');
INSERT INTO `sys_blog` VALUES (0, '我是丁真', '2023-02-21 10:24:02', 14, '我也是丁真');
INSERT INTO `sys_blog` VALUES (0, '我是丁真111', '2023-02-21 10:55:35', 15, '我也是丁真111');

-- ----------------------------
-- Table structure for sys_blog_comment
-- ----------------------------
DROP TABLE IF EXISTS `sys_blog_comment`;
CREATE TABLE `sys_blog_comment`  (
  `commentid` int NOT NULL AUTO_INCREMENT COMMENT '评论id 主键',
  `blogid` int NULL DEFAULT NULL COMMENT '博客id',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '评论',
  `userid` int NULL DEFAULT NULL COMMENT '评论人id',
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '评论时间',
  PRIMARY KEY (`commentid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_blog_comment
-- ----------------------------
INSERT INTO `sys_blog_comment` VALUES (1, 2, 'asdfasdsa', 2, '2023-02-20 17:42:20');
INSERT INTO `sys_blog_comment` VALUES (2, 2, 'asdadsad', 2, '2023-02-20 17:42:37');
INSERT INTO `sys_blog_comment` VALUES (3, 2, 'sdvzxv', 2, '2023-02-20 17:42:44');

-- ----------------------------
-- Table structure for sys_homepagemsg
-- ----------------------------
DROP TABLE IF EXISTS `sys_homepagemsg`;
CREATE TABLE `sys_homepagemsg`  (
  `msgcontent` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '消息内容',
  `msgid` int NOT NULL AUTO_INCREMENT COMMENT '消息id 主键自增',
  `msgcreatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '消息创建时间',
  PRIMARY KEY (`msgid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_homepagemsg
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '角色',
  `description` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'ROLE_CODER', '编码人员');
INSERT INTO `sys_role` VALUES (2, 'ROLE_ADMIN', '管理员');
INSERT INTO `sys_role` VALUES (3, 'ROLE_USER', '一般用户');
INSERT INTO `sys_role` VALUES (4, 'ROLE_NORMAL', '游客');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` bigint NOT NULL COMMENT '角色id',
  `permission_id` bigint NULL DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '角色权限表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `username` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL COMMENT '博客用户账号,非空',
  `password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL COMMENT '博客用户密码,非空',
  `nickname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL COMMENT '博客用户名称,非空',
  `userid` int NOT NULL AUTO_INCREMENT COMMENT '博客用户id,非空',
  `email` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '博客用户邮箱',
  `phonenum` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '博客用户手机号',
  `address` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '博客用户地址',
  `registertime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `useravatar` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '博客用户头像',
  `userrole` int NULL DEFAULT NULL COMMENT '博客用户权限/对应sys_role_id',
  `useronline` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NULL DEFAULT NULL COMMENT '用户是否在线,1在线,0离线',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '用户状态，1-开启-0禁用',
  `passwordNonExpired` tinyint(1) NULL DEFAULT NULL COMMENT '密码是否失效，1-可用，0-失效',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 12 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('akisan', 'baicaiin33', 'aki', 1, NULL, NULL, NULL, '2022-11-14 19:54:38', NULL, NULL, NULL, 1, 1);
INSERT INTO `sys_user` VALUES ('aki33', '$2a$10$mc6KGbvmYsFpe.tYkkRIeuAwZOzwybmiSjUwJ9LFl5VzHBOE6aiYi', 'akijiang', 2, '', '', '', NULL, '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('abc1234', '$2a$10$KyjRdmC/aKIWKSnDMbddVuCC7fUo6HDAs1Qlnt8mRYWkKQLGJI6Pm', 'asdsadas7d', 11, '', '', '', NULL, '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('abc123', '$2a$10$o7iUlfSXFJMfS3/AnEu7E.EYA8jI7xnuw8e1zAPCyahtsWQwl6eUa', 'asdsadasd', 10, '', '', '', NULL, '', 0, '', 1, 1);

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint NOT NULL COMMENT '用户id',
  `role_id` bigint NULL DEFAULT NULL COMMENT '角色id',
  `enabled` tinyint(1) NULL DEFAULT 1 COMMENT '是否有效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户角色关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 1, 1, 1);
INSERT INTO `sys_user_role` VALUES (2, 2, 1, 1);
INSERT INTO `sys_user_role` VALUES (3, 10, 3, 1);
INSERT INTO `sys_user_role` VALUES (4, 11, 3, 1);

-- ----------------------------
-- Table structure for usr_activity
-- ----------------------------
DROP TABLE IF EXISTS `usr_activity`;
CREATE TABLE `usr_activity`  (
  `getpictimes` int NULL DEFAULT NULL COMMENT '接口调用次数',
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `description` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '接口名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of usr_activity
-- ----------------------------
INSERT INTO `usr_activity` VALUES (171, 1, 'lolicon接口调用次数');

-- ----------------------------
-- Table structure for usr_comment_board
-- ----------------------------
DROP TABLE IF EXISTS `usr_comment_board`;
CREATE TABLE `usr_comment_board`  (
  `boardid` int NOT NULL AUTO_INCREMENT COMMENT '留言板id',
  `userid` int NULL DEFAULT NULL COMMENT '留言用户id',
  `boardcontent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '留言板内容',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '留言创建时间',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名字',
  PRIMARY KEY (`boardid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of usr_comment_board
-- ----------------------------
INSERT INTO `usr_comment_board` VALUES (2, 2, 'sadasdadsa', '2023-02-20 17:01:44', NULL);
INSERT INTO `usr_comment_board` VALUES (3, 2, 'sadasdasda', '2023-02-20 17:01:49', NULL);
INSERT INTO `usr_comment_board` VALUES (4, 2, 'xiaolanshab', '2023-02-20 17:22:18', NULL);
INSERT INTO `usr_comment_board` VALUES (5, 2, 'xiaolanshaasdb', '2023-02-21 10:57:15', NULL);

SET FOREIGN_KEY_CHECKS = 1;
