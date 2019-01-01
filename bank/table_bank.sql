/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : shuttle

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-01-01 21:11:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for table_bank
-- ----------------------------
DROP TABLE IF EXISTS `table_bank`;
CREATE TABLE `table_bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `loan` tinyint(2) DEFAULT NULL COMMENT '贷款方式（1.房贷2.保单3.车贷4.全款房信贷5.同行贷6.生意贷7.抵押贷8.全川车子抵押贷）',
  `lending_bank` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '放款银行',
  `day_interst` double(5,2) DEFAULT NULL COMMENT '天/利息（基本单位元）',
  `min_interst` int(11) DEFAULT NULL COMMENT '最小利息（基本单位为厘）',
  `max_interest` int(11) DEFAULT NULL COMMENT '最大利息（基本单位为厘）',
  `area` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地区范围',
  `max_lending_lines` int(32) DEFAULT NULL COMMENT '最大额度(单位为元）',
  `min_lending_lines` int(32) DEFAULT NULL COMMENT '最小额度(单位为元）',
  `lending_limit` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '期限',
  `access` longtext COLLATE utf8_unicode_ci COMMENT '准入条件',
  `credit_conditions` longtext COLLATE utf8_unicode_ci COMMENT '征信条件',
  `min_age` int(11) DEFAULT NULL COMMENT '年龄min',
  `max_age` int(11) DEFAULT NULL COMMENT '年龄max',
  `lending_time` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '放款时间',
  `poundage` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手续费',
  `magnification` int(11) DEFAULT NULL COMMENT '放大倍数',
  `disadvantage` longtext COLLATE utf8_unicode_ci COMMENT '劣势',
  `advantage` longtext COLLATE utf8_unicode_ci COMMENT '优势',
  `special_requirements` longtext COLLATE utf8_unicode_ci COMMENT '特殊要求',
  `mortgage_type` int(2) DEFAULT NULL COMMENT '抵押类型',
  `reimbursement_means` int(2) DEFAULT NULL COMMENT '还款方式',
  `lending_rate` int(11) DEFAULT NULL COMMENT '放款比例',
  `need_information` longtext COLLATE utf8_unicode_ci COMMENT '需要资料',
  `hose_age` longtext COLLATE utf8_unicode_ci COMMENT '房龄要求',
  `customer_request` longtext COLLATE utf8_unicode_ci COMMENT '客户要求',
  `process` longtext COLLATE utf8_unicode_ci COMMENT '流程',
  `need_certificates` tinyint(1) DEFAULT NULL COMMENT '是否压证',
  `evaluate_notary_fees` longtext COLLATE utf8_unicode_ci COMMENT '评估公证费',
  `need_national` tinyint(1) DEFAULT NULL COMMENT '是否看名族',
  `rebates` int(11) DEFAULT NULL COMMENT '返点',
  `gps_fees` longtext COLLATE utf8_unicode_ci COMMENT 'GPS费用',
  `contact` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系人',
  `contact_phone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系人电话',
  `contract_way` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '签约方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
