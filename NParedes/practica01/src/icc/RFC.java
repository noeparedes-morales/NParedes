import java.util.Scanner;

/**
 * Programa para generar RFC
 * Objetivo Utilizar cadenas de caracteres y algunos de los métodos más importantes de dicha clase
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

