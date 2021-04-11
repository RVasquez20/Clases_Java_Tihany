/*Operadores Relacionales
=	igual
<>	distinto
>	mayor
<	menor
>=	mayor o igual
<=	menor o igual
*/
select * from libros;
/*Ejemplo de : = */
select * from libros where Editorial='P';
/*Ejemplo de : <> */
select * from libros where Autor<>'Santillana';
/*Ejemplo de : > */
select * from libros where Pages>100;
/*Ejemplo de : < */
select * from libros where Pages<100;
/*Ejemplo de : >= */
select * from libros where Price>=50;
/*Ejemplo de : <= */
select * from libros where Price<=50;
/*OJO: EN LAS SENTENCIAS DE DELETE Y UPDATE SIEMPRE, SIEMRPE!! SIEMPRE!!!!! USAR UN WHERE*/
/*Borrar Registros -- Delete*/
select * from usuarios;
delete from usuarios where Nombre='Luis';
/*Actualizar Registros Update*/
select * from usuarios;
update usuarios set Clave='123'
where Nombre='Marcelo';
select * from libros;--mostramos todos los registros
update libros set Editorial=NULL,Stock=10,Pages=54,Price=NULL
where Title='Matematicas 1';
/*Valores nulos*/
/*Tabla de ejemplo con valores nulos y no nulos permitidos
 create table libros(
  Title varchar(30) not null,
  Autor varchar(20) not null,
  editorial varchar(15) null,
  Price float 
 );
*/
select * from libros
where Price is null;
select * from libros
where Price=0;
select * from libros
where Editorial is null;
select * from libros
where Editorial='';
/*Llaves Primarias o primary keys*/
/*Opcion 1*/
create Table Personas(
nombre varchar(30) primary key not null,
apellido varchar(30) not null,
Edad int not null
);
/*Opcion 2*/
create Table Personas(
nombre varchar(30) not null,
apellido varchar(30) not null,
Edad int not null,
primary key(nombre)
);
select * from Personas;
insert into Personas(nombre,apellido,Edad)Values('Juan','Perez',12);
insert into Personas(nombre,apellido,Edad)Values('Juan','Perjhjhjkez',12);--No se inserta porque esta duplicado
insert into Personas(nombre,apellido,Edad)Values('Juana','Perez',22);
insert into Personas(nombre,apellido,Edad)Values('Pedro','Peres',13);
insert into Personas(nombre,apellido,Edad)Values('Alameda','Hernandez',32);
insert into Personas(nombre,apellido,Edad)Values('Jackelyn','Lopez',24);
insert into Personas(nombre,apellido,Edad)Values('Melany','Lopez',23);
/*Campos con atributo identity*/
 create table libros2(
  codigo int identity,
  titulo varchar(40) not null,
  autor varchar(30),
  editorial varchar(15),
  precio float
 );
 select * from libros2;
 insert into libros2 (titulo,autor,editorial,precio)
  values('El aleph','Borges','Emece',23);
  insert into libros2 (titulo,autor,editorial,precio)
  values('Martin Fierro','Jose Hernandez','Paidos',25);
   select * from libros2;
   exec sp_columns libros2;
   /*Otras Caracteristicas del atributo identity*/
create table libros2(
  codigo int identity(100,2),
  titulo varchar(20),
  autor varchar(30),
  precio float
 );
 insert into libros2 (titulo,autor,precio)
  values('El aleph','Borges',23);
  insert into libros2 (titulo,autor,precio)
  values('Martin Fierro','Jose Hernandez',25);
  insert into libros2 (titulo,autor,precio)
  values('The Clean Code','Robert C Maritn',25);
   select * from libros2;
   /*retorna el valor de inicio del campo "identity" de la tabla que nombramos*/
   select IDENT_SEED('libros2');
   /*retorna el valor de incremento del campo "identity" de la tabla nombrada*/
   select IDENT_INCR('libros2');
   /*Identity insert para insertar valores en un campo identity (no recomendado)*/
   set identity_insert libros2 on;
    insert into libros2 (codigo,titulo)
 values (5,'Alicia en el pais de');
    select * from libros2;
	 insert into libros2 (titulo,autor, precio)
 values ('Matematica estas ahi','Paenza',12);
   set identity_insert libros2 off;
