// La clase Cliente contiene el método main, que es el punto de entrada del programa.
//Tiene un objeto Scanner para leer la entrada del usuario.
//Tiene una lista de expresiones (Feliz, Triste, Sorprendido), luego tiene una expresión compuesta (fraseExpression) que las contiene.
//En un bucle infinito, lee la entrada del usuario y crea un objeto Context con esa entrada.
//Se utiliza la expresión compuesta para interpretar la entrada y obtener la traducción de los emoticonos.
//Finalmente, muestra la traducción y solicita otra entrada hasta que el usuario escriba "cerrar".AA
package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Creamos un Scanner para leer la entrada del usuario por consola.
        System.out.println("Ingrese una frase con emoticonos como \":)\" \":(\" \":O\" (o escriba \"cerrar\" para salir):");

        List<ExpresionAbstract> expressions = new ArrayList<>(); // Se crea una lista de expresiones que incluye las expresiones para los diferentes emoticonos.
        expressions.add(new HappyTerminalExpression());
        expressions.add(new SadTerminalExpression());
        expressions.add(new SurprisedTerminalExpression());
        ExpresionAbstract phraseExpression = new PhraseNonTerminalExpression(expressions); //Crea una instancia de FraseNonTerminalExpression que agrupa todas las expresiones.

        while (true) {
            String emoticon = scanner.nextLine(); // se solicita la usuario ingresar la expresión y se almacena en la variable
            if (emoticon.equalsIgnoreCase("cerrar")) { //Se verifica si la entrada ingresada es "cerrar" (sin importar si está escrita en mayúsculas o minúsculas).
                break;
            }
            Context context = new Context(emoticon); //crea un objeto Context llamado context que contiene la expresión ingresada. Esto se hace para proporcionar el contexto necesario para la interpretación de las expresiones.
            String translation = phraseExpression.interpret(context); //Se llama al método interpret en la expresión no terminal compuesta (fraseExpression) pasándole el objeto context. Esto interpreta la expresión ingresada y produce una traducción resultante, que se almacena en la variable translation.
            System.out.println("Traducción: " + translation); //Se muestra la traducción resultante en la consola.
            System.out.println("Ingrese otra frase o escriba \"cerrar\" para salir:");
        }

        scanner.close();
    }
}
