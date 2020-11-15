/*
 Navicat Premium Data Transfer

 Source Server         : mysql8.0
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : managersystem

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 15/11/2020 21:00:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (101, '教学部');
INSERT INTO `department` VALUES (102, '市场部');
INSERT INTO `department` VALUES (103, '教研部');
INSERT INTO `department` VALUES (104, '运营部');
INSERT INTO `department` VALUES (105, '后勤部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` int(0) NULL DEFAULT NULL,
  `departmentId` int(0) NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1017 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1001, 'AA', 'A123456@qq.com', 1, 101, '2020-11-14');
INSERT INTO `employee` VALUES (1002, 'BB', 'B123456@qq.com', 0, 102, '2020-11-14');
INSERT INTO `employee` VALUES (1003, 'CC', 'C123456@qq.com', 1, 103, '2020-11-14');
INSERT INTO `employee` VALUES (1004, 'DD', 'D123456@qq.com', 0, 104, '2020-11-14');
INSERT INTO `employee` VALUES (1005, 'EE', 'E123456@qq.com', 1, 105, '2020-11-14');
INSERT INTO `employee` VALUES (1012, 'TT', '54354543@QQ.COM', 1, 102, '2020-11-14');
INSERT INTO `employee` VALUES (1013, 'athna', '1019010503@njupt.edu.cn', 0, 101, '1997-09-21');
INSERT INTO `employee` VALUES (1014, 'Uirdss', 'aa@163.com1111', 1, 104, '1997-08-21');
INSERT INTO `employee` VALUES (1015, '李四', 'aa@163.com1111', 0, 101, '1997-08-21');
INSERT INTO `employee` VALUES (1016, 'uyuu', 'zhangsan@qq.com', 1, 101, '1997-08-21');

SET FOREIGN_KEY_CHECKS = 1;
