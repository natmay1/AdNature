/*
Navicat MySQL Data Transfer

Source Server         : fero
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : adnature

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2016-03-03 12:00:14
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
  `ADDRESS` varchar(6) default NULL,
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

-- ----------------------------
-- Table structure for sport_user
-- ----------------------------
DROP TABLE IF EXISTS `sport_user`;
CREATE TABLE `sport_user` (
  `ID` varchar(32) NOT NULL,
  `SPORT_ID` varchar(20) default NULL,
  `USER_ID` varchar(255) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sport_user
-- ----------------------------

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
INSERT INTO `web_user` VALUES ('a780d4da5edb49a5ac7240564f91797b', '123456', '123456', '123@live.com', '31323334353651785059724e59306e6b767464684c42735441677751737668385534754341376446453356765244484d3352675848434430574533594a74484632587749', 'QxPYrNY0nkvtdhLBsTAgwQsvh8U4uCA7dFE3VvRDHM3RgXHCD0WE3YJtHF2XwI', '2016-03-03 02:58:16', '0:0:0:0:0:0:0:1', '0', null, null, null, null, '1', '1', '2016-03-03 02:30:08', '2016-03-03 02:58:16');
