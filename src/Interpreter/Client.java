// Define una clase Cliente que contiene el método main, que es el punto de entrada del programa.
//Crea un objeto Scanner para leer la entrada del usuario.
//Crea una lista de expresiones (Feliz, Triste, Sorprendido), luego crea una expresión compuesta (fraseExpression) que las contiene.
//En un bucle infinito, lee la entrada del usuario y crea un objeto Context con esa entrada.
//Utiliza la expresión compuesta para interpretar la entrada y obtener la traducción de los emoticonos.
//Finalmente, muestra la traducción y solicita otra entrada hasta que el usuario escriba "cerrar".AA
package Interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Creamos un Scanner para leer la entrada del usuario.
        System.out.println("Ingrese una frase con emoticonos como \":)\" \":(\" \":O\" (o escriba \"cerrar\" para salir):");

        List<ExpresionAbstract> expressions = new ArrayList<>();
        expressions.add(new FelizTerminalExpression());
        expressions.add(new TristeTerminalExpression());
        expressions.add(new SorprendidoTerminalExpression());
        ExpresionAbstract fraseExpression = new FraseNonTerminalExpression(expressions);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("cerrar")) {
                break;
            }
            Context context = new Context(input);
            String translation = fraseExpression.interpret(context);
            System.out.println("Traducción: " + translation);
            System.out.println("Ingrese otra frase o escriba \"cerrar\" para salir:");
        }

        scanner.close();
    }
}
