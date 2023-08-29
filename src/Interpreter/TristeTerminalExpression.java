// Define una clase TristeExpression que implementa la interfaz ExpressionAbstrac.
//Sobrescribe el método interpret para verificar si el texto de entrada contiene :) y, en ese caso, devuelve "Triste 😄". Si no, devuelve una cadena vacía.
package Interpreter;

public class TristeTerminalExpression implements ExpresionAbstract {
    @Override
    public String interpret(Context context) { // En este método verificamos si la cadena de entrada contiene el emoticono ":)". Si es así, devuelve la cadena "triste 😢", de lo contrario, devuelve una cadena vacía.
        String emoticon  = context.getInput();
        if (emoticon .contains(":(")) {  // Verificamos si el emoticono :( está en la entrada.
            return "triste 😢";
        }
        return "";
    }
}
