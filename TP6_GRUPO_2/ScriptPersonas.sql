CREATE DATABASE bdPersonas;
USE bdPersonas;
CREATE TABLE personas
(
Dni varchar(20) NOT NULL,
Nombre varchar(45) NOT NULL,
Apellido varchar(45) NOT NULL,
PRIMARY KEY (Dni)
);