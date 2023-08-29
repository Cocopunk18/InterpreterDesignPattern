// Define una interfaz llamada Expression con un método interpret que toma un objeto de tipo Context y devuelve una cadena de texto.
package Interpreter;

public interface ExpresionAbstract {
    String interpret(Context context); //Método que toma un objeto Context y devuelve una cadena que representa la interpretación de esa expresión.
}
