/*
Navicat MySQL Data Transfer

Source Server         : bresil_connexion
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : coupe-bresil

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2014-07-13 02:33:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `equipe`
-- ----------------------------
DROP TABLE IF EXISTS `equipe`;
CREATE TABLE `equipe` (
  `id_equipe` int(3) NOT NULL AUTO_INCREMENT,
  `nom` varchar(60) DEFAULT NULL,
  `id_groupe` char(1) DEFAULT NULL,
  PRIMARY KEY (`id_equipe`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of equipe
-- ----------------------------
INSERT INTO `equipe` VALUES ('1', 'Bresil', '1');
INSERT INTO `equipe` VALUES ('2', 'Algerie', '1');
INSERT INTO `equipe` VALUES ('3', 'Allemagne', '1');
INSERT INTO `equipe` VALUES ('4', 'France', '1');
INSERT INTO `equipe` VALUES ('5', 'Belgique', '2');
INSERT INTO `equipe` VALUES ('6', 'Argetine', '2');
INSERT INTO `equipe` VALUES ('7', 'Mexique', '2');
INSERT INTO `equipe` VALUES ('8', 'Croitie', '2');

-- ----------------------------
-- Table structure for `groupe`
-- ----------------------------
DROP TABLE IF EXISTS `groupe`;
CREATE TABLE `groupe` (
  `id_groupe` int(1) NOT NULL AUTO_INCREMENT,
  `nom` char(1) NOT NULL,
  PRIMARY KEY (`id_groupe`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of groupe
-- ----------------------------
INSERT INTO `groupe` VALUES ('1', 'A');
INSERT INTO `groupe` VALUES ('2', 'B');
INSERT INTO `groupe` VALUES ('3', 'C');
INSERT INTO `groupe` VALUES ('4', 'D');
INSERT INTO `groupe` VALUES ('5', 'E');
INSERT INTO `groupe` VALUES ('6', 'F');
INSERT INTO `groupe` VALUES ('7', 'G');
INSERT INTO `groupe` VALUES ('8', 'H');

-- ----------------------------
-- Table structure for `groupes`
-- ----------------------------
DROP TABLE IF EXISTS `groupes`;
CREATE TABLE `groupes` (
  `id` char(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of groupes
-- ----------------------------
INSERT INTO `groupes` VALUES ('A');
INSERT INTO `groupes` VALUES ('B');

-- ----------------------------
-- Table structure for `match`
-- ----------------------------
DROP TABLE IF EXISTS `match`;
CREATE TABLE `match` (
  `id_match` int(3) NOT NULL AUTO_INCREMENT,
  `id_equipe1` int(3) DEFAULT NULL,
  `id_equipe2` int(3) DEFAULT NULL,
  `id_pronostique` int(3) DEFAULT NULL,
  `score` varchar(3) DEFAULT NULL,
  `date_match` datetime DEFAULT NULL,
  `id_groupe` int(1) DEFAULT NULL,
  PRIMARY KEY (`id_match`),
  KEY `match-groupe-fk` (`id_groupe`),
  CONSTRAINT `match-groupe-fk` FOREIGN KEY (`id_groupe`) REFERENCES `groupe` (`id_groupe`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of match
-- ----------------------------
INSERT INTO `match` VALUES ('1', '1', '2', '1', '2-3', '2014-06-28 19:07:56', '1');
INSERT INTO `match` VALUES ('2', '3', '4', '2', '1-1', '2014-06-15 19:08:51', '1');

-- ----------------------------
-- Table structure for `matchs`
-- ----------------------------
DROP TABLE IF EXISTS `matchs`;
CREATE TABLE `matchs` (
  `id` int(3) NOT NULL,
  `id_groupe` char(1) DEFAULT NULL,
  `score` varchar(3) DEFAULT NULL,
  `groupe_id` char(1) DEFAULT NULL,
  `date_match` datetime DEFAULT NULL,
  `id_equipe1` int(3) DEFAULT NULL,
  `id_equipe2` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `groupe_match_fk` (`id_groupe`),
  KEY `FKBF8D5F4E32B67A70` (`groupe_id`),
  KEY `FKBF8D5F4E824938FF` (`id_equipe2`),
  KEY `FKBF8D5F4E824938FE` (`id_equipe1`),
  CONSTRAINT `FKBF8D5F4E824938FE` FOREIGN KEY (`id_equipe1`) REFERENCES `equipe` (`id_equipe`),
  CONSTRAINT `FKBF8D5F4E32B67A70` FOREIGN KEY (`groupe_id`) REFERENCES `groupes` (`id`),
  CONSTRAINT `FKBF8D5F4E824938FF` FOREIGN KEY (`id_equipe2`) REFERENCES `equipe` (`id_equipe`),
  CONSTRAINT `groupe_match_fk` FOREIGN KEY (`id_groupe`) REFERENCES `groupes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of matchs
-- ----------------------------
INSERT INTO `matchs` VALUES ('1', 'A', '1-2', null, '2014-07-13 01:32:55', '1', '2');
INSERT INTO `matchs` VALUES ('2', 'A', '2-2', null, '2014-07-13 01:33:12', '1', '3');
INSERT INTO `matchs` VALUES ('3', 'A', '1-1', null, '2014-07-13 01:33:16', '1', '4');
INSERT INTO `matchs` VALUES ('4', 'A', '2-3', null, '2014-07-13 01:33:21', '2', '3');
INSERT INTO `matchs` VALUES ('5', 'A', '1-1', null, '2014-07-13 01:37:33', '2', '4');
INSERT INTO `matchs` VALUES ('6', 'A', '0-0', null, '2014-07-13 01:38:32', '3', '4');
INSERT INTO `matchs` VALUES ('7', 'B', '1-3', null, '2014-07-13 01:33:24', '5', '6');
INSERT INTO `matchs` VALUES ('8', 'B', '2-2', null, '2014-07-13 01:33:27', '5', '7');
INSERT INTO `matchs` VALUES ('9', 'B', '1-3', null, '2014-07-13 01:33:30', '5', '8');
INSERT INTO `matchs` VALUES ('10', 'B', '0-0', null, '2014-07-13 01:40:15', '6', '7');
INSERT INTO `matchs` VALUES ('11', 'B', '1-4', null, '2014-07-13 01:40:41', '6', '8');
INSERT INTO `matchs` VALUES ('12', 'B', '0-0', null, '2014-07-13 01:33:33', '7', '8');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for `pronostique`
-- ----------------------------
DROP TABLE IF EXISTS `pronostique`;
CREATE TABLE `pronostique` (
  `id_pronostique` int(3) NOT NULL AUTO_INCREMENT,
  `pronos` varchar(3) DEFAULT NULL,
  `id_pronostiqueur` int(3) DEFAULT NULL,
  PRIMARY KEY (`id_pronostique`),
  KEY `FK93D516475450BBB3` (`id_pronostiqueur`),
  CONSTRAINT `FK93D516475450BBB3` FOREIGN KEY (`id_pronostiqueur`) REFERENCES `pronostiqueur` (`id_pronostiqueur`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pronostique
-- ----------------------------
INSERT INTO `pronostique` VALUES ('1', '1-1', '1');
INSERT INTO `pronostique` VALUES ('2', '2-3', '1');
INSERT INTO `pronostique` VALUES ('3', '2-2', '2');

-- ----------------------------
-- Table structure for `pronostiqueur`
-- ----------------------------
DROP TABLE IF EXISTS `pronostiqueur`;
CREATE TABLE `pronostiqueur` (
  `id_pronostiqueur` int(3) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `mdp` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_pronostiqueur`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pronostiqueur
-- ----------------------------
INSERT INTO `pronostiqueur` VALUES ('1', 'Lakehal', 'Noureddine', 'nour', 'nour');
INSERT INTO `pronostiqueur` VALUES ('2', 'toto', 'titi', 'toto@titi.com', 'dkzdkz');
