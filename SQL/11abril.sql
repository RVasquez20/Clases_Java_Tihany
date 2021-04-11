use Empresa
select * from libros
/*4 tipos de operadores:
1)Relacionales
2)Logicos
3)Aritmeticos
4)Concatenacion

Operadores Aritmeticos:son los que nos permiten realizar calculos con valores
numericos
*,/,%,+,-     */
--Ejemplo de Operador Aritmetico:Calcular dinero total cantidad*precio
select Title,Autor,Editorial,Pages,Price,Stock,Price*Stock from libros;
select *,Price*Stock from libros;
--Ejemplo 2: calcular  cada libro con un 10 % de descuento
select *,Price-(Price*0.1)from libros;
--Ejemplo de operadores de concatenacion:Concatenar titulo,autor y editorial
select Title+' de '+Autor+' Hecho por '+Editorial from libros;
--Alias
select *,Price*Stock as Total from libros;
/*Funciones: Una funcion es un conjunto de sentencias que operan
como una sola unidad logica
Una funcion tiene:
-un nombre
-un retorno(un parametro de salida)
-acepta parametros de entrada
Clasificacion de funciones:
1)De Agregado:realizan operaciones que combinan varios valores y retornan
un unico valor.Son: "count","sum","min","max"
2)Escalares:toman un solo valor y retornan un valor unico,Pueden agruparse en:
2.1)de configuracion:retornan la informacion referida a la configuracion*/
--Ejemplo de escalar de configuracion:
select @@VERSION
--Retorna la fecha,version y tipo de procesador de SLQ server

/*2.2)De Cursores:retornan informacion sobre el estado de un curso
2.3)De Fecha y Hora: operan con valores datetime y smalldatetime. Reciben un parametro de tipo fecha
y hora y retornan un valor de cadena,numerico o de fecha y hora
2.4)Matematicas:Realizan operaciones numericas , geometricas y trigonometricas
2.5)De Metadatos:informan sobre las bases de datos y objetos
2.6)De Seguridad:devuelven informacion eferente a los usuario y funciones
2.7)De Cadena:operan con valores de tipo texto, y devuelven un valor de cadena o numerico
2.8)De Sistema:informan sobre opciones,objetos y configuraciones del sistema
*/
--Ejemplo de 2.8):
select USER_NAME();
/*2.9)Estadisticas del sistema:retornan informacion referente al rendimiento del sistema
2.10)Texto o imagen:realizar operaciones con valor de entrada tipo text o image y retornan 
informacion referente al mismo

3)De Conjuntos de filas:retornan conjuntos de registros
se pueden emplear las funciones del sistema en cualquier lugar en el que se le permita
una expresion en una sentencia "select"
*/

/*Funciones para el manejo de cadenas
Ejemplos:
-substring(cadena,inicio,longitud):
devuelve una parte de la cadena especificada como primer argumento,empezando desde la 
posicion especificada por el segundo argumento, y de tantos caracteres de longitud
como indica el tercer argumento
*/
select SUBSTRING('Buenas Tardes',8,6)as Substrings;--El 8 dice donde incia y el 6 cuantos caracteres va a mostrar
select SUBSTRING('Hola mundo esto es SQL',0,11)as Substrings;
/*STR(numero,longitud,cantidad de decimales):
convierte numeros a caracteres;el primer parametro indica el valor numerico a convertir, 
el segundo parametro la longitud del resultado(debe ser mayor o igual a la parte entera del numero
mas el signo si lo tuviese)y el tercer parametro es la cantidad de decimales.
OJO: El segundo y terce parametro son OPCIONALES y DEBEN SER POSITIVOS
*/
--Ejemplo STR
select STR(123.456,7,3);
select STR(-123.456,7,3);
--Si no se colocan el segundo y tercer parametro la longitud predeterminada es de 10
--y la cantidad de decimales 0 y se redondea a un entero
select STR(123.456);
select STR(123.456,2,3);
/*STUFF(Cadena1,iniciar,cantidad,Cadena2):
inserta la cadena enviada como 4 parametro en la posicion indicada del segundo parametro
reemplanzado la candidad de caacteres indicados en el tercer parametro en la cadena
que es el primer parametro. STUFF en ingles es rellenar
*/
select STUFF('abcde',3,2,'opqrs');
/*abopqrse   opqrs*/
/*Hola   buen dia |Tihany*/
select STUFF('Hola   buen dia',6,1,'Tihany');
/*Los parametros numericos deben ser positvos y menor o igual a la longitud de la cadena caso contrario retornara null*/
/*LEN(Cadena):Retorna la longitud de una cadena:
*/
select LEN('Tihany');
/*CHAR(X):retorna un caracter de codigo ASCII recibiendo un numero entero como parametro*/
select CHAR(71),CHAR(63);
/*Left(Cadena,longitud):retorna la cantidad de caracteres de la cadena comenzando desde la izquierda*/
select LEFT('Buenos Dias',8);
/*Right(Cadena,longitud):retorna la cantidad de caracteres de la cadena comenzando desde la derecha*/
select RIGHT('Buenos Dias',8);
/*-LOWER(Cadena):retorna la cadena con todos los caracteres en minuscula*/
select LOWER('Tihany Se Aburrio YA');
/*-UPPER(Cadena):retorna la cadena con todos los caracteres en Mayusculas*/
select UPPER('Tihany Se Aburrio YA');
/*RTRIM(Cadena):retorna la cadena con los espacios de la derecha eliminados*/
select RTRIM('Hola          ')+'Tihany';
/*LTRIM(Cadena):retorna la cadena con los espacios de la izquierda eliminados*/
select LTRIM('             Hola                       ');
/*Replace(Cadena,Cadenadereemplazo,cadenareemplazar):
retorna la cadena con todas las ocurrencias de la subcadena de reemplazo por la subcadena a reemplazar*/
select REPLACE('xxx.sqlrevercodenet.com','x','w');
/*Reverse(Cadena):devuelve la cadena invirtiendo el orden de los caracteres*/
select REVERSE('TIHANY');
/*PATINDEX(Patron,cadena):devuelve la posicion de comienzo del patron especificado en la cadena
enviada como segundo argumento,si no la encuentra retorna 0*/
select PATINDEX('%ar%','Jorge Luis Borges')
/*CHARINDEZ(subcadena,cadena,inicio):devuelce la posicion donde comienza la subcadena en la cadena, comenzando
la busqueda desde la posicion indicada por inicio, si el tercer parametro no se coloca , la busqueda
inicia desde 0, sino se encuentra retorna 0*/
select CHARINDEX('or','Jorge Luis Borges',5);
/*Replicate(Cadena,cantidad):Repite la cadena la cantidad de veces especificadas*/
select REPLICATE('EL NO TE AMA TIHANY ',4);
/*SPACE(CANTIDAD):retorna una cadena de espacios de longitud indicada por cantidad que debe de ser un valor positivo*/
select 'Tihany'+SPACE(1)+'EL TIENE A OTRA'+SPACE(3)+'!!!';