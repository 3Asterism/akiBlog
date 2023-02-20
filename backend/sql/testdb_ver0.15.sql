/*
 Navicat Premium Data Transfer

 Source Server         : 47.100.215.126
 Source Server Type    : MySQL
 Source Server Version : 50740
 Source Host           : 47.100.215.126:3306
 Source Schema         : testdb

 Target Server Type    : MySQL
 Target Server Version : 50740
 File Encoding         : 65001

 Date: 20/02/2023 17:56:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_blog
-- ----------------------------
DROP TABLE IF EXISTS `sys_blog`;
CREATE TABLE `sys_blog`  (
  `userid` int(11) NOT NULL COMMENT '博客创建者id',
  `blogcontent` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客内容',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '博客创建时间',
  `blogid` int(11) NOT NULL AUTO_INCREMENT COMMENT '博客识别id 主键',
  `blogtitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客标题',
  PRIMARY KEY (`blogid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_blog
-- ----------------------------
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-17 18:45:23', 11, '');
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-17 18:48:18', 12, '');
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-17 19:04:29', 13, '');
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-17 19:15:14', 14, '');
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-17 19:29:55', 15, '');
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-20 14:02:10', 16, '');
INSERT INTO `sys_blog` VALUES (0, '11111', '2023-02-20 14:27:51', 17, '');

-- ----------------------------
-- Table structure for sys_blog_comment
-- ----------------------------
DROP TABLE IF EXISTS `sys_blog_comment`;
CREATE TABLE `sys_blog_comment`  (
  `blogid` int(11) NULL DEFAULT NULL COMMENT '博客id',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '博客评论',
  `userid` int(11) NULL DEFAULT NULL COMMENT '评论人的id',
  `commentid` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`commentid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_blog_comment
-- ----------------------------
INSERT INTO `sys_blog_comment` VALUES (1, 'hahahahah', 1, 1, '2023-01-31 14:42:29');
INSERT INTO `sys_blog_comment` VALUES (0, 'jasdandjfk', 1, 2, '2023-01-31 15:03:12');
INSERT INTO `sys_blog_comment` VALUES (0, '', 0, 3, '2023-02-03 19:52:48');
INSERT INTO `sys_blog_comment` VALUES (0, '222222', 0, 4, '2023-02-03 19:52:52');
INSERT INTO `sys_blog_comment` VALUES (0, '222222', 0, 5, '2023-02-03 19:52:53');
INSERT INTO `sys_blog_comment` VALUES (0, '333333333', 0, 6, '2023-02-03 19:52:57');
INSERT INTO `sys_blog_comment` VALUES (0, '333333333', 0, 7, '2023-02-03 20:16:32');
INSERT INTO `sys_blog_comment` VALUES (0, '23333', 0, 8, '2023-02-03 20:28:13');
INSERT INTO `sys_blog_comment` VALUES (0, '23333', 0, 9, '2023-02-03 20:28:20');
INSERT INTO `sys_blog_comment` VALUES (0, '233333', 0, 10, '2023-02-03 20:29:40');
INSERT INTO `sys_blog_comment` VALUES (0, '1', 0, 11, '2023-02-04 11:12:37');
INSERT INTO `sys_blog_comment` VALUES (0, '2333333', 0, 12, '2023-02-04 11:34:19');
INSERT INTO `sys_blog_comment` VALUES (0, '2333333', 0, 13, '2023-02-04 11:34:24');
INSERT INTO `sys_blog_comment` VALUES (0, '3', 0, 14, '2023-02-18 10:24:48');

-- ----------------------------
-- Table structure for sys_homepagemsg
-- ----------------------------
DROP TABLE IF EXISTS `sys_homepagemsg`;
CREATE TABLE `sys_homepagemsg`  (
  `msgcontent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消息内容',
  `msgid` int(11) NOT NULL AUTO_INCREMENT COMMENT '消息id 主键自增',
  `msgcreatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '消息创建时间',
  PRIMARY KEY (`msgid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_homepagemsg
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

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
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `permission_id` bigint(20) NULL DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '博客用户账号,非空',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '博客用户密码,非空',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '博客用户名称,非空',
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT '博客用户id,非空',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客用户邮箱',
  `phonenum` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客用户手机号',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客用户地址',
  `registertime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `useravatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '博客用户头像',
  `userrole` int(11) NULL DEFAULT NULL COMMENT '博客用户权限/对应sys_role_id',
  `useronline` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户是否在线,1在线,0离线',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '用户状态，1-开启-0禁用',
  `passwordNonExpired` tinyint(1) NULL DEFAULT NULL COMMENT '密码是否失效，1-可用，0-失效',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 63 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('akisan', 'baicaiin33', 'aki', 1, NULL, NULL, NULL, '2022-11-14 19:54:38', NULL, NULL, NULL, 1, 1);
INSERT INTO `sys_user` VALUES ('aki33', '$2a$10$mc6KGbvmYsFpe.tYkkRIeuAwZOzwybmiSjUwJ9LFl5VzHBOE6aiYi', 'akijiang', 2, '', '', '', NULL, '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('abc123', '$2a$10$lJrwxRYd4MJ6cm2oK.ut0OaqhQNNR7HjcWwpJvq/LSthF2kbfdwxO', 'zrj', 56, '', '', '', '2023-01-18 16:51:57', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('', '$2a$10$lekIyV6RBU39UmdooAYJb.dCnvCSzxz02fAuetEOn0nfyJ/apwAni', '', 54, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('', '$2a$10$3zJaArJVUbLxxfecdPrcQeIF/2thZKTK84fvpCcQb194iRYIcpvXS', '', 55, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('abc123c', '$2a$10$Dz1saPvzGzQDwLatx7vY7e0yMFklEUrTQE8ORxCwYT8PuK/T./xm.', 'abc123', 53, '', '', '', '2023-01-17 23:14:22', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('a123456', '$2a$10$C.e6zAMW0PiWVrxGu7LCbOK.5EIbkVVM.COCS7oLAvv.TXLN99mJW', '123', 52, '', '', '', '2023-01-17 22:38:34', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('1234567', '$2a$10$yg9/fBfNy4wosiLorWjgV.kGu3b3VNelbS7AYpR7rLP80r9e.VzCC', 'laochen', 51, '', '', '', '2023-01-17 22:36:33', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('laochen', '$2a$10$Ua.4E0qlwVoJR6f3NAd8tOmCcoTdVKo4ld1.kWQ3b7GIuNw.QiVvG', '1234567', 50, '', '', '', '2023-01-17 22:34:13', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('huaci', '$2a$10$WP1BIbogrz0E7moPEJhbSuMbUksx/M5NcbmmJd9UOFWeUQTfrbYoq', '123', 48, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('???', '$2a$10$hPcxdY/0BhAumxYeZ8SXfuSNXPwxHO.RM5DOUP6ovEqSgO.lNA6hi', '3048098139', 49, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('', '$2a$10$.q4tu18WLKdiI8h1hB/P5eBEbJujOTEEAbWwl6J0994jPkjOhFsMC', '', 47, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('', '$2a$10$yG0FZr3V4xxP2jWWKcN.8eUltwkrouRhGleEbuXfz.YoYQq7BS3L2', '', 46, '', '', '', '2023-01-17 21:08:48', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('NekoAzuki', '$2a$10$vZ9/QPrT4RYxmXfxuoAewe8OUXQcQ8Gd6dJuNwthmZdWhU1oFRNoi', 'NekoAzuki', 57, '', '', '', '2023-01-31 00:20:14', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('a', '$2a$10$zgf6AVbRVJTL9PzXStJgGO7vYwj.HJQZLSdndETXVmdUQYLhUCOoq', '', 58, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('qb123', '$2a$10$lEpbsdz3gYzARLTbmVEq3uyj/EYo52zloa/kWVu3zPQVXiCB.qoUG', 'qb', 59, '', '', '', '2023-02-17 15:53:09', '', 0, '1', 1, 1);
INSERT INTO `sys_user` VALUES ('a', '$2a$10$SzyuKpbTQaY/vaMIlS.G4eM5F/TCs0sQgWEQtC/3ctFrokwo0jJRO', '', 60, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('a', '$2a$10$eCZEyJy/5Ioc4cuywb6R1e/yUbk1b4uz66ZoNAoTNYI5806LoZOBG', '', 61, '', '', '', NULL, '', 0, '', 1, 1);
INSERT INTO `sys_user` VALUES ('a', '$2a$10$zQ5smv31AkdAt16zclTBAeBS.NIkiXHY9T7tak2/UPa6nARKVrWnq', '111', 62, '', '', '', NULL, '', 0, '', 1, 1);

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色id',
  `enabled` tinyint(1) NULL DEFAULT 1 COMMENT '是否有效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 1, 1, 1);
INSERT INTO `sys_user_role` VALUES (2, 2, 1, 1);
INSERT INTO `sys_user_role` VALUES (3, 10, 3, 1);
INSERT INTO `sys_user_role` VALUES (4, 11, 3, 1);
INSERT INTO `sys_user_role` VALUES (5, 12, 3, 1);
INSERT INTO `sys_user_role` VALUES (6, 13, 3, 1);
INSERT INTO `sys_user_role` VALUES (7, 14, 3, 1);
INSERT INTO `sys_user_role` VALUES (8, 15, 3, 1);
INSERT INTO `sys_user_role` VALUES (9, 19, 3, 1);
INSERT INTO `sys_user_role` VALUES (10, 21, 3, 1);
INSERT INTO `sys_user_role` VALUES (11, 22, 3, 1);
INSERT INTO `sys_user_role` VALUES (12, 25, 3, 1);
INSERT INTO `sys_user_role` VALUES (13, 26, 3, 1);
INSERT INTO `sys_user_role` VALUES (14, 28, 3, 1);
INSERT INTO `sys_user_role` VALUES (15, 30, 3, 1);
INSERT INTO `sys_user_role` VALUES (16, 32, 3, 1);
INSERT INTO `sys_user_role` VALUES (17, 33, 3, 1);
INSERT INTO `sys_user_role` VALUES (18, 34, 3, 1);
INSERT INTO `sys_user_role` VALUES (19, 36, 3, 1);
INSERT INTO `sys_user_role` VALUES (20, 37, 3, 1);
INSERT INTO `sys_user_role` VALUES (21, 38, 3, 1);
INSERT INTO `sys_user_role` VALUES (22, 39, 3, 1);
INSERT INTO `sys_user_role` VALUES (23, 40, 3, 1);
INSERT INTO `sys_user_role` VALUES (24, 41, 3, 1);
INSERT INTO `sys_user_role` VALUES (25, 43, 3, 1);
INSERT INTO `sys_user_role` VALUES (26, 45, 3, 1);
INSERT INTO `sys_user_role` VALUES (27, 46, 3, 1);
INSERT INTO `sys_user_role` VALUES (28, 48, 3, 1);
INSERT INTO `sys_user_role` VALUES (29, 49, 3, 1);
INSERT INTO `sys_user_role` VALUES (30, 50, 3, 1);
INSERT INTO `sys_user_role` VALUES (31, 51, 3, 1);
INSERT INTO `sys_user_role` VALUES (32, 52, 3, 1);
INSERT INTO `sys_user_role` VALUES (33, 53, 3, 1);
INSERT INTO `sys_user_role` VALUES (34, 56, 3, 1);
INSERT INTO `sys_user_role` VALUES (35, 57, 3, 1);
INSERT INTO `sys_user_role` VALUES (36, 58, 3, 1);
INSERT INTO `sys_user_role` VALUES (37, 59, 3, 1);

-- ----------------------------
-- Table structure for usr_activity
-- ----------------------------
DROP TABLE IF EXISTS `usr_activity`;
CREATE TABLE `usr_activity`  (
  `getpictimes` int(11) NULL DEFAULT NULL COMMENT '接口调用次数',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id主键',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of usr_activity
-- ----------------------------
INSERT INTO `usr_activity` VALUES (656, 1, 'lolicon接口调用次数');

-- ----------------------------
-- Table structure for usr_comment_board
-- ----------------------------
DROP TABLE IF EXISTS `usr_comment_board`;
CREATE TABLE `usr_comment_board`  (
  `boardid` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言id',
  `userid` int(11) NULL DEFAULT NULL COMMENT '留言人id',
  `boardcontent` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '留言时间',
  PRIMARY KEY (`boardid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of usr_comment_board
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
