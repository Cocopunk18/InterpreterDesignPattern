// Define una clase TristeExpression que implementa la interfaz ExpressionAbstrac.
//Sobrescribe el método interpret para verificar si el texto de entrada contiene :) y, en ese caso, devuelve "Triste 😄". Si no, devuelve una cadena vacía.
package Interpreter;

public class TristeTerminalExpression implements ExpresionAbstract {
    @Override
    public String interpret(Context context) {
        String input = context.getInput();
        if (input.contains(":(")) {  // Verificamos si el emoticono :( está en la entrada.
            return "triste 😢";
        }
        return "";
    }
}
