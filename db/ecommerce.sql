-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 15, 2020 at 10:28 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `categorie_id` int(11) NOT NULL AUTO_INCREMENT,
  `lable` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `parent_categorie_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`categorie_id`),
  KEY `FK2kynno4wbeck3vjjyyfbtxfkj` (`parent_categorie_id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`categorie_id`, `lable`, `parent_categorie_id`) VALUES
(1, 'Phone', NULL),
(2, 'RDP', NULL),
(3, 'Pc portable', NULL),
(4, 'Pc Gammers', NULL),
(5, 'iphone', 1),
(6, 'ipad', 1),
(7, 'google cloud', 2),
(8, 'dell', 3),
(9, 'dell', 4);

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `user_id` int(11) NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `roles_id` int(11) DEFAULT NULL,
  `adresse` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `info_paiement` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_ah5c1ribskm746956okm9283n` (`username`),
  KEY `FK_fq6i8ebfjus650fdxlcv0dlb3` (`roles_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`user_id`, `password`, `username`, `roles_id`, `adresse`, `created_at`, `email`, `first_name`, `info_paiement`, `last_name`, `phone`, `updated_at`) VALUES
(1, '$2a$10$avLy1oJtIR3DzE4fe98fNu8yIv2m2T0vgXTQONIgCBF7EwNZdyVhG', 'loutfallah', 2, NULL, '2020-05-09 12:45:05', 'loutfallah.25@gmail.com', NULL, NULL, NULL, NULL, '2020-05-09 12:45:05'),
(2, '$2a$10$9G5iLMPgk58sv/RXwOAig.eU0ySOjIaB2dh1bWX0A0ODvT729UU4a', 'test', 2, NULL, '2020-05-11 11:15:25', 'test@gmail.com', NULL, NULL, NULL, NULL, '2020-05-11 11:15:25'),
(3, '$2a$10$FOggYNAenzFVpeTH9hYYpeiWDrB.Yf1y1/Fl8z02Ngqr5FnHqceQq', 'AboJoudat', 2, NULL, '2020-05-12 16:53:55', 'youness@gmail.com', NULL, NULL, NULL, NULL, '2020-05-12 16:53:55');

-- --------------------------------------------------------

--
-- Table structure for table `coupon`
--

DROP TABLE IF EXISTS `coupon`;
CREATE TABLE IF NOT EXISTS `coupon` (
  `coupon_id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `date_expiration` datetime DEFAULT NULL,
  `discount` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `updated_at` datetime NOT NULL,
  `client_id` int(11) NOT NULL,
  PRIMARY KEY (`coupon_id`),
  KEY `FKln8l33vbepeaogo23hojp1sw6` (`client_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `coupon`
--

INSERT INTO `coupon` (`coupon_id`, `code`, `created_at`, `date_expiration`, `discount`, `status`, `updated_at`, `client_id`) VALUES
(1, 'dkazjjazzll11hhz', '2020-05-01 00:00:00', '2020-05-30 00:00:00', 5, 1, '2020-05-20 00:00:00', 2);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(4);

-- --------------------------------------------------------

--
-- Table structure for table `image_produit`
--

DROP TABLE IF EXISTS `image_produit`;
CREATE TABLE IF NOT EXISTS `image_produit` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `alt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lable` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pruduit_id` int(11) NOT NULL,
  PRIMARY KEY (`image_id`),
  KEY `FKoxb3l9l7a049cccsbkifnuvjo` (`pruduit_id`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `image_produit`
--

INSERT INTO `image_produit` (`image_id`, `alt`, `lable`, `pruduit_id`) VALUES
(1, 'aple', 'iphone1.jpg', 1),
(2, 'ipad', 'iphone1.jpg', 1),
(3, 'iphone', 'hover.jpg', 1),
(4, 'iphone', 'hover.jpg', 2),
(5, 'ipad', 'iphone1.jpg', 2),
(6, 'aple', 'iphone2.jpg', 2),
(7, 'dell', 'pc-hover3.jpg', 3),
(8, 'dell', 'pc-hover1.jpg', 3),
(9, 'dell', 'pc1.jpg', 3),
(10, 'asus', 'pc-hover2.jpg', 4),
(11, 'asus', 'pc2.jpeg', 4),
(12, 'asus', 'pc3.jpeg', 4),
(13, 'asus', 'pc1.jpg', 5),
(14, 'asus', 'pc3.jpeg', 5),
(15, 'asus', 'pc-hover1.jpg', 5);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `prix_total` int(11) NOT NULL,
  `updated_at` datetime NOT NULL,
  `status_id` int(11) NOT NULL,
  `shipping_id` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK1abokg3ghque9pf2ujbxakng` (`status_id`),
  KEY `FKsemahq4easllj6if07wtarony` (`shipping_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `order_details`;
CREATE TABLE IF NOT EXISTS `order_details` (
  `order_details_id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `nb_piece` int(11) NOT NULL,
  `updated_at` datetime NOT NULL,
  `client_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `produit_id` int(11) NOT NULL,
  PRIMARY KEY (`order_details_id`),
  KEY `FKewteredd7boscg008qya0u7hi` (`client_id`),
  KEY `FKjyu2qbqt8gnvno9oe9j2s2ldk` (`order_id`),
  KEY `FKgmli0sbkemgctnm1icvtyvxw8` (`produit_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_status`
--

DROP TABLE IF EXISTS `order_status`;
CREATE TABLE IF NOT EXISTS `order_status` (
  `order_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `lable` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`order_status_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `produit`
--

DROP TABLE IF EXISTS `produit`;
CREATE TABLE IF NOT EXISTS `produit` (
  `produit_id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `keyword` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `marque` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `sell_count` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `updated_at` datetime NOT NULL,
  `categorie_id` int(11) NOT NULL,
  `promotion_id` int(11) NOT NULL,
  PRIMARY KEY (`produit_id`),
  KEY `FK5g8mktu27cxxtauk01cf6u3h8` (`categorie_id`),
  KEY `FK93lbkq0vo93p5k6xbdl98hkex` (`promotion_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `produit`
--

INSERT INTO `produit` (`produit_id`, `created_at`, `keyword`, `marque`, `name`, `price`, `sell_count`, `stock`, `updated_at`, `categorie_id`, `promotion_id`) VALUES
(1, '2020-05-15 18:41:39', 'iPhone  Xmax', 'iphone', 'Apple iPhone 11 (128 Go) Noir', 859, NULL, 200, '2020-05-15 18:41:39', 5, 1),
(2, '2020-05-15 18:43:48', 'iPhone  Xmax', 'iphone', ' iPhone 12 por 258 Go', 1059, NULL, 200, '2020-05-15 18:43:48', 5, 1),
(3, '2020-05-15 20:51:14', 'dell', 'dell', 'Dell Latitude E7250 - PC Portable', 1200, NULL, 100, '2020-05-15 20:51:14', 8, 1),
(4, '2020-05-15 20:56:33', 'asus', 'asus', 'ASUS K540BA-DM417T-BE', 1500, NULL, 120, '2020-05-15 20:56:33', 8, 1),
(5, '2020-05-15 20:58:30', 'dell', 'dell', 'TECLAST X6 Pro Tablette PC', 2000, NULL, 120, '2020-05-15 20:58:30', 8, 1);

-- --------------------------------------------------------

--
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
CREATE TABLE IF NOT EXISTS `promotion` (
  `promotion_id` int(11) NOT NULL AUTO_INCREMENT,
  `begin_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `percent` int(11) NOT NULL,
  `status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`promotion_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `promotion`
--

INSERT INTO `promotion` (`promotion_id`, `begin_date`, `end_date`, `percent`, `status`) VALUES
(1, '2020-05-01 00:00:00', '2020-05-30 00:00:00', 10, 'active'),
(2, '2020-05-02 00:00:00', '2020-05-15 00:00:00', 30, 'pending'),
(3, '2020-05-11 17:17:59', '2020-05-11 17:17:59', 0, 'string');

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
CREATE TABLE IF NOT EXISTS `review` (
  `review_id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `rate` int(11) NOT NULL,
  `updated_at` datetime NOT NULL,
  `client_id` int(11) NOT NULL,
  `produit_id` int(11) NOT NULL,
  PRIMARY KEY (`review_id`),
  KEY `FKhr2oxqr7hu3upmi4hvg9g0ghp` (`client_id`),
  KEY `FKlh440to5vqjxswwnr5hop6s58` (`produit_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`review_id`, `comment`, `created_at`, `rate`, `updated_at`, `client_id`, `produit_id`) VALUES
(1, 'naice prod', '2020-05-01 00:00:00', 3, '2020-05-20 00:00:00', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `lable` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`role_id`, `lable`) VALUES
(1, 'admin'),
(2, 'client');

-- --------------------------------------------------------

--
-- Table structure for table `shipping`
--

DROP TABLE IF EXISTS `shipping`;
CREATE TABLE IF NOT EXISTS `shipping` (
  `shipping_id` int(11) NOT NULL AUTO_INCREMENT,
  `lable` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`shipping_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `shipping`
--

INSERT INTO `shipping` (`shipping_id`, `lable`) VALUES
(1, 'fdx');

-- --------------------------------------------------------

--
-- Table structure for table `superviseur`
--

DROP TABLE IF EXISTS `superviseur`;
CREATE TABLE IF NOT EXISTS `superviseur` (
  `user_id` int(11) NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `roles_id` int(11) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_39axsjuyp7twd0mb0gfn067ix` (`username`),
  KEY `FK_1flwatty4ynvef01psdeknrqb` (`roles_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `superviseur`
--

INSERT INTO `superviseur` (`user_id`, `password`, `username`, `roles_id`, `created_at`, `email`, `name`, `updated_at`) VALUES
(1, '2020-05-13 00:00:00', 'loutfallaha', 1, '2020-05-13 00:00:00', 'loutfallah.2@gmail.com', 'lolman', '2020-05-20 00:00:00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
