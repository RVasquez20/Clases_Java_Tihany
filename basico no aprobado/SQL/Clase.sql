select * from libros2;
truncate table libros2;
drop table libros2;
create table libros2(
  codigo int identity,
  titulo varchar(30),
  autor varchar(20),
  editorial varchar(15),
  precio float
);

insert into libros2 (titulo,autor,editorial,precio)
  values ('El aleph','Borges','Emece',25.60);
insert into libros2 (titulo,autor,editorial,precio)
  values ('Uno','Richard Bach','Planeta',18);
  select *from libros2;
  delete libros2;
  --Texto: char,nchar,varchar,nvarchar,text,ntext
  --Numeros:integer->tinyint,smallint,bigint
  --Fecha y Hora:datetime,smalldatetime

  /*
char(x):define una cadena de longitud fija determinada por el parametro x,
si se omite el parametro coloca 1 por defecto.Su rango es de 1 a 8000 caracteres.
si la longitud es invariable, es mas conveniente utilizar el tipo char; en caso contrario
el tipo varchar.
Ocupa tantos bytes como se definen en x;

varchar(x):define una cadena de caracteres de longitud varibale en la cual determinamos
el maximo de caracteres con el parametro x;
si se omite el parametro coloca 1 por defecto.su rango va de 1-8000 caracteres.

nchar(x):es similar al char excepto que permite almacenar caracteres de Unicode.
su rango va de 0-4000. porque se emplean 2 bytes por cada caracter.

nvarchar(x):es similar al varchar excepto que permite alamacenar caracteres de unicode
su rango va de 0 a 4000.

text:guarda datos binarios de longitud variable, puede contener hasta
2000000000 caractres, no admite parametros para especificar su longitud.

ntext: es similar a text excepto  que permite el ingreso de unicode puede contener hasta
1000000000.no admite parametros para especificar su longitud.


 integer o int: su rango es de -2000000000 a 2000000000 aprox. El tipo "integer" tiene subtipos:
- smallint: Puede contener hasta 5 digitos. Su rango va desde –32000 hasta 32000 aprox.
- tinyint: Puede almacenar valores entre 0 y 255.(ASCII)
- bigint: De –9000000000000000000 hasta 9000000000000000000 aprox.

Para almacenar valores numéricos EXACTOS con decimales, especificando la cantidad de cifras a la izquierda y derecha del separador decimal, utilizamos:
decimal o numeric (t,d): Pueden tener hasta 38 digitos, 
guarda un valor exacto. 
El primer argumento indica el total de dígitos y el segundo, la cantidad de decimales.
Por ejemplo, si queremos almacenar valores entre -99.99 y 99.99 
debemos definir el campo como tipo "decimal(4,2)". 
Si no se indica el valor del segundo argumento, por defecto es "0".
Por ejemplo, si definimos "decimal(4)" se pueden guardar valores entre -9999 y 9999.

El rango depende de los argumentos, también los bytes que ocupa.
Se utiliza el punto como separador de decimales.

Si ingresamos un valor con más decimales que los permitidos, redondea al más cercano; 
por ejemplo, si definimos "decimal(4,2)" e ingresamos el valor 
"12.686", guardará "12.69", redondeando hacia arriba; 
si ingresamos el valor "12.682", guardará "12.67", redondeando hacia abajo.


Para almacenar valores numéricos APROXIMADOS con decimales utilizamos:

float y real: De 1.79E+308 hasta 1.79E+38. Guarda valores aproximados.
real: Desde 3.40E+308 hasta 3.40E+38. Guarda valores aproximados.

Para almacenar valores MONETARIOS empleamos:

money: Puede tener hasta 19 digitos y sólo 4 de ellos puede ir luego del separador decimal; 
entre –900000000000000.5808 aprox y 900000000000000.5807.

smallmoney: Entre –200000.3648 y 200000.3647 aprox.

Para almacenar valores de tipo FECHA Y HORA SQL Server dispone de dos tipos:

datetime: puede almacenar valores desde 01 de enero de 1753 hasta 31 de diciembre de 9999
smalldatetime: el rango va de 01 de enero de 1900 hasta 06 de junio de 2079.

Las fechas se ingresan entre comillas simples.

Para almacenar valores de tipo fecha se permiten como separadores "/", "-" y ".".

SQL Server reconoce varios formatos de entrada de datos de tipo fecha. 
Para establecer el orden de las partes de una fecha (dia, mes y año) empleamos 
"set dateformat". Estos son los formatos:

-mdy: 4/15/96 (mes y día con 1 ó 2 dígitos y año con 2 ó 4 dígitos),
-myd: 4/96/15,
-dmy: 15/4/1996
-dym: 15/96/4,
-ydm: 96/15/4,
-ydm: 1996/15/4,

Para ingresar una fecha con formato "día-mes-año", tipeamos:

 set dateformat dmy;

 El formato por defecto es "mdy".

 Todos los valores de tipo "datetime" se muestran en formato 
 "año-mes-día hora:minuto:segundo .milisegundos", 
 independientemente del formato de ingreso que hayamos seteado.

 Podemos ingresar una fecha, sin hora, en tal caso la hora se guarda como "00:00:00". 
 Por ejemplo, si ingresamos '25-12-01' (año de 2 dígitos), 
 lo mostrará así: '2001-12-25 00:00:00.000'.

 Podemos ingresar una hora sin fecha, en tal caso, 
 coloca la fecha "1900-01-01". 
 Por ejemplo, si ingresamos '10:15', mostrará '1900-01-01 10:15.000'.
  */
  /*VALORES POR DEFECTO*/
  select * from libros2;

drop table libros2;
create table libros2(
  codigo int identity,
  titulo varchar(30),
  autor varchar(20),
  editorial varchar(15) not null default 'Santillana',
  precio float
);
insert into libros2(titulo,autor,editorial,precio)values('El gato con botas','Antonio Banderas',default,100);
insert into libros2(titulo,autor,editorial,precio)values('El gato con botas','Antonio Banderas','patitas bonitas',100);
/*Columnas Calculadas(operaciones aritmeticos y de concatenacion)*/