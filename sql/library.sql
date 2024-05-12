CREATE TABLE IF NOT EXISTS `Book` (
	`id` int AUTO_INCREMENT NOT NULL UNIQUE,
	`title` varchar(48) NOT NULL,
	`author` varchar(48) NOT NULL,
	`publication_year` int NOT NULL,
	`isbn` varchar(20) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `Patron` (
	`id` int AUTO_INCREMENT NOT NULL UNIQUE,
	`first_name` varchar(18) NOT NULL,
	`last_name` varchar(18) NOT NULL,
	`email` varchar(48) NOT NULL UNIQUE,
	`phone_number` varchar(18) NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `borrowing_record` (
	`id` int AUTO_INCREMENT NOT NULL UNIQUE,
	`book_id` int NOT NULL,
	`patron_id` int NOT NULL,
	PRIMARY KEY (`id`)
);



ALTER TABLE `borrowing_record` ADD CONSTRAINT `borrowing_record_fk1` FOREIGN KEY (`book_id`) REFERENCES `Book`(`id`);

ALTER TABLE `borrowing_record` ADD CONSTRAINT `borrowing_record_fk2` FOREIGN KEY (`patron_id`) REFERENCES `Patron`(`id`);