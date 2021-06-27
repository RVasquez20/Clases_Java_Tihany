--Funciones Matematicas
/*
ABS(x): retorna un valor absolutos del parametro que se le paso.
*/
select abs(-12);
/*
ceiling(x):redondea hacia arriba el parametro
*/
select CEILING(12.34);
/*
floor(x):redondea hacia abajo el parametro
*/
select floor(12.34);
/*
 % dentro de dos numeros y se obteniene el residuo de la division
*/
select 10%3;
select 10%2;
/*
round(numero,longitud):retorna un numero redondeado a la longitud especificada."longitud"
debe ser tinyint,smallint o int.Si longitud es positivo el numero de decimales es redondeado segun
longitud, si es negativo el numero es redondeado desde la parte entera segun el valor de longitud

*/
select ROUND(123.456,-2);
select ROUND(123.456,-1);
/*
123.456,-1<-Parte entera a contar desde el punto hacia la izquierda, como es negativo
redonde hacia abajo
12.3.456
  ^
  |Es un punto imaginario
12.0.456<-se elimina el punto imaginario
120.456<-se rendodea hacia abajo la cantidad entera
120.000
Redondeo por aproximacion<-investiga
*/
/*
sing(x):si el parametro es un valor positivo devuelve 1; -1 si es negativo
y si es 0 devuelve 0
*/
/*
square(x):retorna el cuadrado del argumento
*/
select SQUARE(11);
/*
sqrt(x):devuelve la raiz cuadrada del parametro
*/
select SQRT(144);

////////////////////////////////////////////////////////
use Empresa
select*,floor(Price)as abajo,ceiling(Price)as arriba from libros;
/*Funciones para el uso de fechas y horas*/
/*
getdate():retorna la fecha y hora actuales
*/
select getdate();
/*
datepart(partedefecha,fecha):retorna la parte especifica de una fecha, el año
trimestre,dia,hora etc.
los valores partedefecha pueden ser: year,quarter,month,day,week,hour,minute,second,millisecond
*/
select datepart(year,getdate());
/*
datename(partedefecha,fecha):retorna el nombre de una parte de la fecha especificada
los valores pueden ser los mismos que la funcion anterior
*/
select datename(month,getdate());
/*
dateadd(partedefecha,numero,fecha): agrega un intervalo a la fecha especificada, es decir,
retorna una fecha adicionando a la fecha enviada como 3er parametro el intervalo de tiempo indicado
por el primer parametro,tantas veces como lo indica el segundo parametro.
los valores pueden ser iguales a la funcion anterior
*/
select dateadd(year,3,'1980/11/02');
/*
datediff(partedefecha,fecha1,fecha2):calcula el intervalo de tiempo entre las dos fechas.
valores iguales a las funciones que se especifican antes
*/{
select datediff(day,'2005/10/28','2006/10/28');
select datediff(month,'2005/10/28','2006/11/29');
/*
day(fecha):retorna el dia
*/
select day(getdate());
/*
month(fecha):retorna el mes
*/
select month(getdate());
/*
year(fecha):retorna el año
*/
select year(getdate());
