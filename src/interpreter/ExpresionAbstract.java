// La interfaz llamada Expression contiene un método interpret que toma un objeto de tipo Context y devuelve una cadena de texto.
package interpreter;

public interface ExpresionAbstract {
    String interpret(Context context); //Método que toma un objeto Context y devuelve una cadena que representa la interpretación de esa expresión.
}
