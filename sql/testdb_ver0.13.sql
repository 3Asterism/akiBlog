/*
 Navicat Premium Data Transfer

 Source Server         : 10.30.2.60
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : testdb

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 08/12/2022 11:47:42
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

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
) ENGINE = MyISAM AUTO_INCREMENT = 11 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_blog
-- ----------------------------

-- ----------------------------
-- Table structure for sys_homepagemsg
-- ----------------------------
DROP TABLE IF EXISTS `sys_homepagemsg`;
CREATE TABLE `sys_homepagemsg`  (
  `msgcontent` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消息内容',
  `msgid` int NOT NULL AUTO_INCREMENT COMMENT '消息id 主键自增',
  `msgcreatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '消息创建时间',
  PRIMARY KEY (`msgid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '角色权限表' ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户角色关联表' ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of usr_activity
-- ----------------------------
INSERT INTO `usr_activity` VALUES (5, 1, 'lolicon接口调用次数');

SET FOREIGN_KEY_CHECKS = 1;
