CREATE SCHEMA IF NOT EXISTS store_cms_plusplus DEFAULT CHARACTER SET utf8mb4;
USE store_cms_plusplus;

CREATE TABLE `store_cms_plusplus`.`laptop` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` VARCHAR(255) NULL,
  `url` VARCHAR(255) NULL,
  `maker` VARCHAR(45) NULL,
  `type` VARCHAR(45) NULL,
  `ram` VARCHAR(45) NULL,
  `cpu` VARCHAR(45) NULL,
  `ssd` VARCHAR(45) NULL,
  `hdd` VARCHAR(45) NULL,
  `price` FLOAT NULL,
  `card` VARCHAR(45) NULL,
  `screen_resolution` VARCHAR(45) NULL,
  `screen_size` FLOAT NULL,
  `sold` INT NULL,
  `created_timestamp` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `last_updated_timestamp` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6));

SELECT * FROM laptop;
-- insert master data
INSERT INTO `laptop` VALUES (1,'Laptop ASUS VivoBook X407MA-BV169T (14\" HD/N5000/4GB/1TB HDD/UHD 605/Win10/1.7 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-asus-x407ma-bv169t-n5000-s19010084.html','ASUS','VivoBook','4GB','Intel Pentium Silver N5000',NULL,'1TB',7290000,'Intel UHD Graphics 605','1366x768',14,20,'2020-07-01 04:29:25.934113','2020-07-01 04:29:25.934113'),
(2,'Laptop Apple MacBook Air 13\" 2019 MVFL2SA/A (Core i5/8GB/256GB SSD/UHD 617/macOS/1.3 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-macbook-air-2019-mvfl2saa-bac-s190800125.html','APPLE','MacBook Air','8GB','Intel Core i5','256GB',NULL,36990000,'Intel UHD Graphics 617','2560x1600',13.3,50,'2020-07-01 04:31:40.663343','2020-07-01 04:31:40.663343'),
(3,'Laptop Acer Nitro 5 AN515-54-51X1 (NH.Q5ASV.011) (15\" FHD/i5-9300H/8GB/256GB SSD/GTX 1050/Win10/2.3 kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-acer-nitro-5-an5155451x1-nhq5asv011-i59300h-den-s190800378.html','ACER','Nitro 5','8GB','Intel Core i5 9300H','256GB',NULL,18890000,'NVIDIA GeForce GTX 1050 3GB GDDR5','1920x1080',15.6,26,'2020-07-01 04:39:53.956475','2020-07-01 04:39:53.956475'),
(4,'Laptop HP 14s-dk0097AU 7VH92PA (14\" HD/AMD Ryzen 3 3200U/4GB/1TB HDD/Windows 10 Home 64-bit/1.5kg)','https://phongvu.vn/may-tinh-xach-tay-laptop-hp-14sdk0097au-7vh92pa-amd-ryzen-3-3200u-bac-s190800176.html','HP',NULL,'4GB','AMD Ryzen 3 3200U',NULL,'1TB',8990000,'AMD Radeon Vega 3 Graphics','1366x768',14,36,'2020-07-01 04:41:39.031139','2020-07-01 04:41:39.031139');
INSERT INTO `store_cms_plusplus`.`laptop` (`name`, `url`, `maker`, `type`, `ram`, `cpu`, `ssd`, `price`, `card`, `screen_resolution`, `screen_size`, `sold`, `created_timestamp`) VALUES
 ('Laptop Apple Macbook Pro 13\" 2020  Apple M1', 'https://www.apple.com/jp/shop/buy-mac/macbook-pro/13%E3%82%A4%E3%83%B3%E3%83%81', 'APPLE', 'Macbool Pro', '8', 'Apple M1 chip', '256GB', '38990000', 'Apple M1 Neural Engine', '2560x1600', '13.3', '31', '2020-07-01 04:31:40.663343');
