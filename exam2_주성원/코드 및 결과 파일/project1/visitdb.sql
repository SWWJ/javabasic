-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        8.0.27 - MySQL Community Server - GPL
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- visitdb 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `visitdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `visitdb`;

-- 테이블 visitdb.tbperson 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbperson` (
  `id` varchar(50) DEFAULT NULL,
  `pw` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 visitdb.tbperson:~0 rows (대략적) 내보내기
DELETE FROM `tbperson`;
/*!40000 ALTER TABLE `tbperson` DISABLE KEYS */;
INSERT INTO `tbperson` (`id`, `pw`, `name`, `email`) VALUES
	('111', '111', '정국', '111@111.com'),
	('222', '222', '제이홉', '222@222.com'),
	('333', '333', '슈가', '333@333.com');
/*!40000 ALTER TABLE `tbperson` ENABLE KEYS */;

-- 테이블 visitdb.tbvisit 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbvisit` (
  `no` int NOT NULL AUTO_INCREMENT,
  `id` varchar(50) DEFAULT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 visitdb.tbvisit:~0 rows (대략적) 내보내기
DELETE FROM `tbvisit`;
/*!40000 ALTER TABLE `tbvisit` DISABLE KEYS */;
INSERT INTO `tbvisit` (`no`, `id`, `memo`, `ts`) VALUES
	(1, '111', '슈가가 1등임', '2022-01-04 11:07:20'),
	(2, '111', '제이홉 왔다감', '2022-01-04 12:24:37'),
	(3, '333', '정국 다녀감', '2022-01-04 12:45:30');
/*!40000 ALTER TABLE `tbvisit` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
