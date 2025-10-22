CREATE SCHEMA 'minha_aplicacao';

CREATE TABLE 'minha-aplicacao'.'usuario'(
	'id' int NOT NULL AUTO_INCREMENT,
    'nome' VARCHAR(45) NULL,
    'email' VARCHAR(45) NULL,
    PRIMARY KEY ('id')
);