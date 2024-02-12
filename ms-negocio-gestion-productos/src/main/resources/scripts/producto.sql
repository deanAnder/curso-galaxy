CREATE DATABASE db_productos;

use db_productosNT;

CREATE TABLE tbl_producto(
    id_producto int not null auto_increment PRIMARY KEY ,
    nombre varchar(60) not null,
    precio DECIMAL(10,2) null,
    stock int not null,
    estado char(1) DEFAULT '1'
);

INSERT INTO tbl_producto (nombre,precio,stock,estado) VALUES ('LAPTOP  ASUS VivoBook Pro',3500,4,'1');
INSERT INTO tbl_producto (nombre,precio,stock,estado) VALUES ('ALCOHOL ISOPROPILICO 70',7.00,15,'1');
INSERT INTO tbl_producto (nombre,precio,stock,estado) VALUES ('LAPTOP  ASUS VivoBook Pro',4500,15,'1');
INSERT INTO tbl_producto (nombre,precio,stock,estado) VALUES ('ALCOHOL ISOPROPILICO 90',7.00,12,'1');
INSERT INTO tbl_producto (nombre,precio,stock,estado) VALUES ('CARGADOR LENOVO ORIGINAL Modelo 2471',8.00,10,'1');
INSERT INTO tbl_producto (nombre,precio,stock,estado) VALUES ('LAPTOP  ASUS VivoBook Plus',3800,10,'1');