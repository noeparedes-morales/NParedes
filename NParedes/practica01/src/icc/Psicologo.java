import java.util.Scanner;

/**
 * Programa para interacción inicial con un paciente
 * Objetivo Trabajar con objetos de la clase String
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
