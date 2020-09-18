CREATE TABLE `test`.`cuenta` (
  `id` VARCHAR(50) NOT NULL,
  `usuario` VARCHAR(10) NOT NULL,
  `monto` FLOAT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (usuario) REFERENCES `test`.`login`(`user`)
)ENGINE = InnoDB;

CREATE TABLE `test`.`transferencia` (
  `id` INT  NOT NULL AUTO_INCREMENT,
  `id_cuenta_1` VARCHAR(50) NOT NULL,
  `Id_cuenta_2` VARCHAR(50) NOT NULL,
  `monto` FLOAT NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (id_cuenta_1) REFERENCES `test`.`cuenta`(`id`),
  FOREIGN KEY (id_cuenta_2) REFERENCES `test`.`cuenta`(`id`)
)ENGINE = InnoDB;

CREATE TABLE `test`.`movimiento`(
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_cuenta` VARCHAR(50) NOT NULL,
  `tipo` VARCHAR(25) NOT NULL,
  `monto` FLOAT NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (id_cuenta) REFERENCES `test`.`cuenta`(`id`)
)ENGINE = InnoDB;


INSERT INTO `test`.`cuenta` (`id`, `usuario`, `monto`)
VALUES ('C001', 'scott', 500);
INSERT INTO `test`.`cuenta` (`id`, `usuario`, `monto`)
VALUES ('C002', 'Gamma', 1000);

INSERT INTO `test`.`movimiento` (`id_cuenta`, `tipo`, `monto`, `fecha` )
VALUES ('C001', 'Deposito', 500 , '2020-09-16');
INSERT INTO `test`.`movimiento` (`id_cuenta`, `tipo`, `monto`, `fecha` )
VALUES ('C002', 'Deposito', 1000 , '2020-09-16');
INSERT INTO `test`.`movimiento` (`id_cuenta`, `tipo`, `monto`, `fecha` )
VALUES ('C002', 'Retiro', 200 , '2020-09-16');
INSERT INTO `test`.`movimiento` (`id_cuenta`, `tipo`, `monto`, `fecha` )
VALUES ('C002', 'Retiro', 400 , '2020-09-16');


INSERT INTO `test`.`transferencia` (`id_cuenta_1`,`id_cuenta_2` ,`monto`, `fecha` )
VALUES ('C001','C002', 200 , '2020-09-16');
INSERT INTO `test`.`transferencia` (`id_cuenta_1`,`id_cuenta_2` ,`monto`, `fecha` )
VALUES ('C002','C001', 200 , '2020-09-16');