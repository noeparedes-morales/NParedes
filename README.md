# Introducción a Ciencias de la Computación
## Práctica 1
### Objetivo
Que el alumno se familiarice con la creación y uso de objetos de la clase String, utilizando algunos elementos de dicha clase en la elaboración de un programa
## Parte 1. Psicólogo
### Descripción general
La práctica consistió en utilizar cadenas de caracteres y algunos de los métodos de dicha clase en la elaboración de un programa para simular una sesión con un psicólogo.
### Desarrollo
1. Se creó el archivo el Psicologo.java, en el directorio de trabajo para esta práctica.
2. Se realizó el método main para que este hiciera lo siguiente:
- (a) Dar bienvenida y solicitar el nombre del paciente.
- (b) Recabar el nombre del paciente.
- (c) Saludar al paciente y preguntar cuál es su problema.
- (d) Leer, en una línea, la descripción del problema del paciente.
- (e) Contestar MMMM... ya veo, luego en otra línea Y dígame... y otra línea más preguntar Por qué dice e incluir la respuesta anterior entre comillas.
- (f) Leer la respuesta del paciente.
- (g) Finalmente decir Muy interesante!!, Hablaremos de ello con más detalle en la siguiente sesión.
3. Se compiló y se ejecutó el programa.
### Implementación en Java
```java
import java.util.Scanner;

/**
 * Programa para interacción inicial con un paciente
 * Objetivo: Trabajar con objetos de la clase String
 * @author Noé Paredes Morales
 * @version 1a edición
 **/

public class Psicologo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        // (1) Dar la bienvenida y solicitar el nombre del paciente
        System.out.println ("Bienvenido (a), ¿cuál es su nombre?");
    
        // (2) Recabar el nombre del paciente
        String nombre = scanner.nextLine();

        // (3) Saludar al paciente y preguntar cuál es su problema
        System.out.println ("Hola, "  +nombre+ " ¿Cuál es su problema? ");

        // (4) Leer, en una línea la descripción del problema del paciente
        String problema = scanner.nextLine();

        // (5) Contestar MMMMM... ya veo, luego en otra línea Y dígame... y en otra línea más preguntar por qué dice e incluir la respuesta anterior entre comillas
        System.out.println ("MMMMM... ya veo");
        System.out.println ("Y dígame...");
        System.out.println ("¿Por qué dice \"" + problema + "\"?");

        // (6) Leer la respuesta del paciente
        String respuesta = scanner.nextLine();

        // (7) Finalmente decir Muy interesante!!, Hablaremos de ello con más detalle en la siguiente sesión.
        System.out.println ("Muy interesante!!, Hablaremos de ello con más detalle en la próxima sesión.");
    
    
    }

}
```
### Ejecución y pruebas

```text
noeparedes@MacBook-Pro-de-Noe icc % java Psicologo
Bienvenido (a), ¿cuál es su nombre?
Noé
Hola, Noé ¿Cuál es su problema? 
Me siento estresado
MMMMM... ya veo
Y dígame...
¿Por qué dice "Me siento estresado"?
He tenido mucha carga de trabajo
Muy interesante!!, Hablaremos de ello con más detalle en la próxima sesión.
```
## Parte 2. RFC
### Descripción general
La práctica consistió en utilizar cadenas de caracteres y algunos de los métodos más importantes de dicha clase en la elaboración de un programa para generar una clave al estilo del RFC de las personas. 

El RFC se obtiene tomando las dos primeras letras del apellido paterno, la inicial del apellido materno y la inicial del nombre, seguido de los dos últimos dígitos del año de nacimiento, los dos dígitos del mes de nacimiento y dos dígitos del día de nacimiento. Por ejemplo, si la persona se llama Andrea Lopez Lopez y nació el 14/04/1992, su RFC es LOLA920414.
### Desarrollo
1. Se creó el archivo RFC.java en el directorio de trabajo para esta práctica.
2. Se escribió en el archivo RFC.java un programa para generar el RFC de una persona. El algoritmo que se programó fue el siguiente:
- (a) Solicitar al usuario su nombre completo, en una línea.
- (b) Solicitar al usuario su fecha de nacimiento, en formato dd/mm/aa, es decir, dos dígitos para el día, dos para el mes y dos más para el año. Cada dato separado por una diagonal.
- (c) Recabar los datos solicitados.
- (d) Extraer la inicial del nombre de la persona.
- (e) Extraer las dos primeras letras del apellido paterno.
- (f) Extraer la inicial del apellido materno.
- (g) Formar el RFC con las letras antes obtenidas.
- (h) Manipular la fecha de nacimiento, es decir extraer el año, el mes y el día y agregarlo al RFC.
3. Se compiló y se ejecutó el programa RFC.
### Implementación en Java
```java
import java.util.Scanner;

/**
 * Programa para generar RFC
 * Objetivo: Utilizar cadenas de caracteres y algunos de los métodos más importantes de dicha clase
 * @author Noé Paredes Morales
 * @version 1a edición
 **/

public class RFC {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        // (1) Solicitar al usuario su nombre completo, en una línea y (3) Recabar el nombre del usuario
	      System.out.println ("Escribe tu nombre completo");
	      String nombreCompleto = scanner.nextLine();

        // (2) Solicitar al usuario su fecha de nacimiento, en formado dd-mm-aa, es decir dos dígitos para el día, dos para el mes y dos más para el año. Cada dato separado por una diagonal y (3) Recabar la fecha de nacimiento del usuario y (3) Recabar la fecha de nacimiento del usuario
        System.out.println ("Escribe tu fecha de nacimiento en formato dd/mm/aa");
        String fecha = scanner.nextLine();

        // Se separan las letras del nombre por espacios [Nombre, ApellidoPaterno, ApellidoMaterno]
        String [] partesNombre = nombreCompleto.split("\\s+");
        String  nombre = partesNombre[0];
        String apellidoPaterno = partesNombre[1];
        String apellidoMaterno = partesNombre[2];

        // (4) Extraer el inicial del nombre de la persona
        String inicialNombre = nombre.substring(0, 1).toUpperCase();
	
        // (5) Extraer las dos primeras letras del apellido paterno
        String inicialesPaterno = apellidoPaterno.substring(0, 2).toUpperCase();

        // (6) Extraer la inicial del apellido materno
        String inicialMaterno = apellidoMaterno.substring(0, 1).toUpperCase();

        // (7) Formar el RFC con las letras obtenidas
        String letrasRFC = inicialesPaterno + inicialMaterno + inicialNombre;

        // (8) Manipular la fecha de nacimiento, es decir extrae el año, el mes y el día y agregarlo al RFC
        String[] partesFecha = fecha.split("/");
        String dia = partesFecha [0];
        String mes = partesFecha [1];
        String ano = partesFecha [2];

        // Se ensambla en formato aa + mm + dd
        String rfcCompleto = letrasRFC + ano + mes + dia;

        // Salida
        System.out.println("El RFC de " + nombreCompleto + " es: " + rfcCompleto);	

    }
}
```
### Ejecución y pruebas
```
noeparedes@MacBook-Pro-de-Noe icc % java RFC
Escribe tu nombre completo
Noé Paredes Morales
Escribe tu fecha de nacimiento en formato dd/mm/aa
09/10/88
El RFC de Noé Paredes Morales es: PAMN881009
```
