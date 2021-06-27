select * from usuarios;
/*WHERE*/
select * from usuarios where Clave='River';
/*Trabaje con la tabla "agenda" en la que registra los datos de sus amigos.

1- Elimine "agenda", si existe:
 if object_id('agenda') is not null
  drop table agenda;

2- Cree la tabla, con los siguientes campos: apellido (cadena de 30), nombre (cadena de 20), 
domicilio (cadena de 30) y telefono (cadena de 11).

3- Visualice la estructura de la tabla "agenda".

4- Ingrese los siguientes registros:
 Acosta, Ana, Colon 123, 4234567;
 Bustamante, Betina, Avellaneda 135, 4458787;
 Lopez, Hector, Salta 545, 4887788; 
 Lopez, Luis, Urquiza 333, 4545454;
 Lopez, Marisa, Urquiza 333, 4545454.

5- Seleccione todos los registros de la tabla

6- Seleccione el registro cuyo nombre sea "Marisa" (1 registro)

7- Seleccione los nombres y domicilios de quienes tengan apellido igual a "Lopez" (3 registros)

8- Muestre el nombre de quienes tengan el teléfono "4545454" (2 registros)*/
create table Agenda(
Apellido varchar (30),
Nombre varchar(20),
Direccion varchar (30),
Telefono varchar (11)
);
exec sp_columns Agenda;
select * from Agenda;
Insert into Agenda(Apellido, Nombre, Direccion,Telefono) values ('Acosta','Ana','Colon 123','4234567');
Insert into Agenda(Apellido, Nombre, Direccion,Telefono) values ('Bustamante','Betina','Avellaneda 135','4458787');
Insert into Agenda(Apellido, Nombre, Direccion,Telefono) values ('Lopez','Hector','Salta 545','4887788');
Insert into Agenda(Apellido, Nombre, Direccion,Telefono) values ('Lopez','Luis','Urquiza 333','4545454');
Insert into Agenda(Apellido, Nombre, Direccion,Telefono) values ('Lopez','Marisa','Urquiza 333','4545454');
select * from Agenda;
Select * from Agenda where Nombre='Marisa';
Select Nombre, Direccion from Agenda where Apellido='Lopez';
Select Nombre from Agenda where Telefono='4545454';

