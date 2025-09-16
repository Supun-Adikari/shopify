CREATE TABLE `store`.`profiles` (
  `id` INT NOT NULL,
  `phone_number` VARCHAR(15) NOT NULL,
  `bio` TINYTEXT NULL,
  `date_of_birth` DATE NULL,
  `loyalty_points` INT UNSIGNED NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  CONSTRAINT `id`
    FOREIGN KEY (`id`)
    REFERENCES `store`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
