CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga(

idVaga  int NOT NULL AUTO_INCREMENT,
numero  int NOT NULL,
rua     varchar (50) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga)

);

CREATE TABLE motorista(

idMotorista  int NOT NULL AUTO_INCREMENT,
nome         varchar (150) NOT NULL,
genero       boolean NOT NULL,
RG           int NOT NULL,
CPF          int NOT NULL,
fone         int NOT NULL,
email        varchar (150) NOT NULL,
senha        varchar (100) NOT NULL,
PRIMARY KEY (idMotorista)

);
