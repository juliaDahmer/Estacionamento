CREAT DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREAT TABLE vaga{

idVaga  int NOT NULL AUTO_INCREMENT,
numero  int NOT NULL,
rua     varchar (50) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga)

};

