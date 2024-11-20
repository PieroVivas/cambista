DROP TABLE IF EXISTS Rates;

CREATE TABLE `Rates` (
  `id` int NOT NULL AUTO_INCREMENT,
  `moneda_tipo_cambio` varchar(100) NOT NULL,
  `tipo_cambio` varchar(100) NOT NULL,
  `monto` varchar(100) NOT NULL,
  `moneda_origen` varchar(100) NOT NULL,
  `moneda_destino` varchar(100) NOT NULL,

  PRIMARY KEY (`id`)
);
