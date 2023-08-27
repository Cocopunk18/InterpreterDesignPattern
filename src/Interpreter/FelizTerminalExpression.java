// Define una clase FelizExpression que implementa la interfaz ExpressionAbstract.
//Sobrescribe el método interpret para verificar si el texto de entrada contiene :) y, en ese caso, devuelve "feliz 😄". Si no, devuelve una cadena vacía.
package Interpreter;

public class FelizTerminalExpression implements ExpresionAbstract {
    @Override
    public String interpret(Context context) {
        String input = context.getInput();
        if (input.contains(":)")) {  // Verificamos si el emoticono :) está en la entrada.
            return "feliz 😄";
        }
        return "";
    }
}
