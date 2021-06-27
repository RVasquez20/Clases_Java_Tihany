/*Un videoclub que alquila películas en video almacena la información de sus películas
en una tabla 
llamada "peliculas"; para cada película necesita los siguientes datos:
 -nombre, cadena de caracteres de 20 de longitud,
 -actor, cadena de caracteres de 20 de longitud,
 -duración, valor numérico entero.
 -cantidad de copias: valor entero.

1- Elimine la tabla, si existe:
 if object_id('peliculas')is not null
  drop table peliculas;

2- Cree la tabla eligiendo el tipo de dato adecuado para cada campo:
 create table peliculas(
  nombre varchar(20),
  actor varchar(20),
  duracion integer,
  cantidad integer
 );

3- Vea la estructura de la tabla:

4- Ingrese los siguientes registros:
 insert into peliculas (nombre, actor, duracion, cantidad)
  values ('Mision imposible','Tom Cruise',128,3);
 insert into peliculas (nombre, actor, duracion, cantidad)
  values ('Mision imposible 2','Tom Cruise',130,2);
 insert into peliculas (nombre, actor, duracion, cantidad)
  values ('Mujer bonita','Julia Roberts',118,3);
 insert into peliculas (nombre, actor, duracion, cantidad)
  values ('Elsa y Fred','China Zorrilla',110,2);

5- Muestre todos los registros.*/
create table Pelicula(
nombre varchar(20), 
actor varchar(20),
duracion int,
cantidad_Copias int
);
 if OBJECT_ID('Pelicula') is not null
 drop table Pelicula;

 create table Pelicula(
nombre varchar(20), 
actor varchar(20),
duracion integer,
cantidad_Copias integer,
);
 exec sp_columns Pelicula;
 insert into Pelicula (nombre, actor, duracion, cantidad_Copias)
  values ('Mision imposible','Tom Cruise',128,3);
 insert into pelicula (nombre, actor, duracion, cantidad_Copias)
  values ('Mision imposible 2','Tom Cruise',130,2);
 insert into pelicula (nombre, actor, duracion, cantidad_Copias)
  values ('Mujer bonita','Julia Roberts',118,3);
 insert into pelicula (nombre, actor, duracion, cantidad_Copias)
  values ('Elsa y Fred','China Zorrilla',110,2);
  select * from Pelicula;