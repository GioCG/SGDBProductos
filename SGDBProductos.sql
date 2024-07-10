CREATE DATABASE SGDBProductos313;
USE SGDBProductos313;

create table Productos(
	productoId INT NOT NULL AUTO_INCREMENT,
    nombreProducto VARCHAR(30),
    marcaProducto VARCHAR(30),
    descrpcionProducto VARCHAR(30),
    precio DECIMAL(10,2),
    PRIMARY KEY PK_productoId(productoId)
);

select *from Productos;


