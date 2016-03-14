/*
Navicat MySQL Data Transfer

Source Server         : fero
Source Server Version : 50027
Source Host           profileprofile: localhost:3306
Source Database       : adnature

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2016-03-07 01:16:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `CODE` varchar(6) NOT NULL,
  `NAME` varchar(255) default NULL,
  `PROVINCE` varchar(255) default NULL,
  `CITY` varchar(255) default NULL,
  `LEVEL_CODE` int(1) default NULL,
  PRIMARY KEY  (`CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for advertisement
-- ----------------------------
DROP TABLE IF EXISTS `advertisement`;
CREATE TABLE `advertisement` (
  `ID` varchar(40) NOT NULL,
  `ADVER_CODE` varchar(40) default NULL,
  `TITLE` varchar(255) default NULL,
  `CONNECT_URL` varchar(255) default NULL,
  `DESCRIPTION` longtext,
  `START_AT` datetime default NULL,
  `END_AT` datetime default NULL,
  `AD_PIC` varchar(255) default NULL,
  `OPENS` varchar(255) default NULL,
  `ORDER_NUM` int(10) default NULL,
  `STATUS` varchar(255) default NULL,
  `REMARK` longtext,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  `CREATE_USER_ID` varchar(40) default NULL,
  `UPDATE_USER_ID` varchar(40) default NULL,
  `VERSION` int(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advertisement
-- ----------------------------

-- ----------------------------
-- Table structure for advertising
-- ----------------------------
DROP TABLE IF EXISTS `advertising`;
CREATE TABLE `advertising` (
  `ID` varchar(32) NOT NULL,
  `ADVER_CODE` varchar(255) default NULL,
  `ADVER_NAME` varchar(255) default NULL,
  `REMARK` varchar(255) default NULL,
  `STATUS` varchar(255) default NULL,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  `CREATE_USER_ID` varchar(40) default NULL,
  `UPDATE_USER_ID` varchar(40) default NULL,
  `VERSION` int(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advertising
-- ----------------------------

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `ID` varchar(40) NOT NULL,
  `CATEGORY` varchar(40) default NULL,
  `TITLE` varchar(255) default NULL,
  `CONTENT` longtext,
  `ORDER_NUM` int(10) default NULL,
  `POST_AT` datetime default NULL,
  `RECOMMEND_FLAG` char(1) default NULL,
  `SEO_DESCRIPTION` longtext,
  `SEO_KEYWORDS` varchar(255) default NULL,
  `STATUS` char(1) default NULL,
  `TITLE_PIC` varchar(255) default NULL,
  `VISITS` bigint(20) default NULL,
  `ARTICLE_SOURCE` varchar(255) default NULL,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  `CREATE_USER_ID` varchar(40) default NULL,
  `UPDATE_USER_ID` varchar(40) default NULL,
  `VERSION` int(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `ID` varchar(40) NOT NULL,
  `CATEGORY_CODE` varchar(255) default NULL,
  `CATEGORY_PATH` varchar(255) default NULL,
  `PARENT_CATEGORY` varchar(40) default NULL,
  `TITLE` varchar(255) default NULL,
  `CONTENT` longtext,
  `SEO_DESCRIPTION` varchar(255) default NULL,
  `SEO_KEYWORDS` varchar(255) default NULL,
  `ORDER_NUM` int(10) default NULL,
  `CATEGORY_TYPE` varchar(255) default NULL,
  `TARGET` varchar(255) default NULL,
  `TARGET_URL` varchar(1000) default NULL,
  `PER_PAGE` int(10) default NULL,
  `STATUS` char(1) default NULL,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  `CREATE_USER_ID` varchar(40) default NULL,
  `UPDATE_USER_ID` varchar(40) default NULL,
  `VERSION` int(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for profile
-- ----------------------------
DROP TABLE IF EXISTS `profile`;
CREATE TABLE `profile` (
  `ID` varchar(32) NOT NULL,
  `ADDRESS` varchar(10) default NULL,
  `PROVINCE` varchar(255) default NULL,
  `CITY` varchar(255) default NULL,
  `USER_ID` varchar(32) default NULL,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  `CREATE_USER_ID` varchar(40) default NULL,
  `UPDATE_USER_ID` varchar(40) default NULL,
  `VERSION` int(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of profile
-- ----------------------------
INSERT INTO `profile` VALUES ('40af2ea9faa44e27a4f088b65ef11f5f', null, '1', '123', 'a780d4da5edb49a5ac7240564f91797b', '2016-03-07 00:58:11', '2016-03-07 00:58:11', '123456', '123456', null);

-- ----------------------------
-- Table structure for sport
-- ----------------------------
DROP TABLE IF EXISTS `sport`;
CREATE TABLE `sport` (
  `ID` varchar(32) NOT NULL,
  `NAME` varchar(255) default NULL,
  `FITNESS_LEVEL` varchar(20) default NULL,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  `CREATE_USER_ID` varchar(40) default NULL,
  `UPDATE_USER_ID` varchar(40) default NULL,
  `VERSION` int(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sport
-- ----------------------------
INSERT INTO `sport` VALUES ('1', 'fruit picking', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', null, null, '1');
INSERT INTO `sport` VALUES ('10', 'swimming', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('11', 'casual biking', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('12', 'running', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('13', 'baseball', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('14', 'horseback riding', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('15', 'stand up paddle boarding', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('16', 'basketball', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('17', 'cross-country skiing', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('18', 'soccer', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('19', 'rowing', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('2', 'snow shoeing', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('20', 'canoeing', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('21', 'hiking', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('22', 'road biking', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('23', 'cliff diving', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('24', 'mountain biking', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('25', 'rock climbing', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('26', 'tobaganning', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('27', 'surfing', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('28', 'downhill skiing/snowboarding', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('29', 'waterskiing', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('3', 'walking', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('30', 'wakeboarding', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('31', 'windsurfing', '3', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('4', 'fishing', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('5', 'dog walking', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('6', 'photography', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('7', 'picnicking', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('8', 'camping', '1', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');
INSERT INTO `sport` VALUES ('9', 'kayaking', '2', '2016-03-06 20:54:04', '2016-03-06 20:54:07', '', '', '1');

-- ----------------------------
-- Table structure for sport_user
-- ----------------------------
DROP TABLE IF EXISTS `sport_user`;
CREATE TABLE `sport_user` (
  `ID` varchar(32) NOT NULL,
  `SPORT_ID` varchar(20) default NULL,
  `USER_ID` varchar(255) default NULL,
  `TYPE` varchar(10) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sport_user
-- ----------------------------
INSERT INTO `sport_user` VALUES ('06b1bd46cdc841e4b34a96d6e1b8e200', '1', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('08f5bb5c09d34404811c01b4eeb5bd3a', '456', 'a780d4da5edb49a5ac7240564f91797b', '2');
INSERT INTO `sport_user` VALUES ('3f3464c666914f2e92616e0f439dd402', '23', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('4c4fbc8a7bb04a13bb0805d042f39895', '17', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('88e621eaa14f42f3aaa73447c6a25457', '11', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('921233fad26549e28da31615c5f79fbf', '4', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('9985b2a2c75e40b8a6100d3cda2012e0', '14', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('bb66dcc65c7f4d8eb80a0e69dfdb1519', '123', 'a780d4da5edb49a5ac7240564f91797b', '2');
INSERT INTO `sport_user` VALUES ('daec735232ab4f0e99ddea4c6e4468f6', '26', 'a780d4da5edb49a5ac7240564f91797b', '1');
INSERT INTO `sport_user` VALUES ('f48593e14ae14203b776a67b9c13b7f1', '7', 'a780d4da5edb49a5ac7240564f91797b', '1');

-- ----------------------------
-- Table structure for web_user
-- ----------------------------
DROP TABLE IF EXISTS `web_user`;
CREATE TABLE `web_user` (
  `ID` varchar(32) NOT NULL,
  `LOGIN` varchar(255) default NULL,
  `CELLPHONE` varchar(20) default NULL,
  `EMAIL` varchar(255) default NULL,
  `PASSWORD` varchar(255) default NULL,
  `PASSWORD_SALT` varchar(255) default NULL,
  `CURRENT_LOGIN_AT` datetime default NULL,
  `CURRENT_LOGIN_IP` varchar(255) default NULL,
  `FAILED_LOGIN_COUNT` int(10) default NULL,
  `LAST_LOGIN_AT` datetime default NULL,
  `LAST_LOGIN_IP` varchar(255) default NULL,
  `LOGIN_COUNT` int(10) default NULL,
  `REGIST_IP` varchar(15) default NULL,
  `ACTIVE` bigint(19) default NULL,
  `VALID_FLAG` char(1) default NULL,
  `CREATE_TIME` datetime default NULL,
  `UPDATE_TIME` datetime default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of web_user
-- ----------------------------
INSERT INTO `web_user` VALUES ('a780d4da5edb49a5ac7240564f91797b', '123456', '123456', '123@live.com', '31323334353651785059724e59306e6b767464684c42735441677751737668385534754341376446453356765244484d3352675848434430574533594a74484632587749', 'QxPYrNY0nkvtdhLBsTAgwQsvh8U4uCA7dFE3VvRDHM3RgXHCD0WE3YJtHF2XwI', '2016-03-07 00:57:16', '0:0:0:0:0:0:0:1', '0', '2016-03-07 00:46:35', '0:0:0:0:0:0:0:1', null, null, '1', '1', '2016-03-03 02:30:08', '2016-03-07 00:57:16');
INSERT INTO `web_user` VALUES ('e12c07a0abac480195b43da6176fbf18', '123123', '123123', '123@live.com', '3132333132334c76316f63326376704d4d59394962746833497969566878395253447a564c434c51745935506c6d77484b57615758374244464b71763047563030697639', 'Lv1oc2cvpMMY9Ibth3IyiVhx9RSDzVLCLQtY5PlmwHKWaWX7BDFKqv0GV00iv9', null, null, null, null, null, null, null, '1', '1', '2016-03-04 15:23:58', '2016-03-04 15:23:58');
