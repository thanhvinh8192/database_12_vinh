CREATE SCHEMA IF NOT EXISTS student_cms_plusplus DEFAULT CHARACTER SET utf8mb4;
USE student_cms_plusplus;
CREATE TABLE IF NOT EXISTS student(
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(50) NOT NULL,
`mssv` VARCHAR(10) NOT NULL,
`password` VARCHAR(50) NOT NULL,
`phone` VARCHAR(15),
`address` VARCHAR(200) NOT NULL,
`age` INT(11),
`email` VARCHAR(100),
`create_timestamp` TIMESTAMP,
`last_update_timestamp` TIMESTAMP
);
CREATE TABLE IF NOT EXISTS classroom(
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(50) NOT NULL,
`major` VARCHAR(50) NOT NULL,
`total_student` INT UNSIGNED NOT NULL,
`teacher_name` VARCHAR(50) NOT NULL,
`teacher_phone` VARCHAR(15) NOT NULL,
`create_timestamp` TIMESTAMP,
`last_update_timestamp` TIMESTAMP
);
CREATE TABLE IF NOT EXISTS student_class (
`student_id` INT NOT NULL,
`class_id` INT NOT NULL
);

SELECT * FROM student_cms_plusplus.student;
INSERT INTO `student_cms_plusplus`.`student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`, `create_timestamp`, `last_update_timestamp`) 
VALUES ('NGUYEN THANH VINH', '10CDTM92', '123456', '07026353649', 'SHIGA', '29', 'abc@gmail.com', '2021-08-01 09:12:20', '2021-08-01 12:12:12');
INSERT INTO `student_cms_plusplus`.`student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`, `create_timestamp`, `last_update_timestamp`) 
VALUES ('NGUYEN THANH TAM', '10CDTM96', 'ABC456', '0776622882', 'TP.HỒ CHÍ MINH', '25', 'tam@gmail.com', '2021-08-01 09:30:30', '2021-08-01 12:13:14');
INSERT INTO `student_cms_plusplus`.`student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`, `create_timestamp`, `last_update_timestamp`) 
VALUES ('NGUYEN THANH QUANG', '10CDTM88', '123ABC', '0986128818', 'TP.HỒ CHÍ MINH', '33', 'quang@gmail.com', '2021-08-01 10:10:10', '2021-08-01 15:16:17');