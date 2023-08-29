// Define una clase SorprendidoExpression que implementa la interfaz ExpressionAbstrac.
//Sobrescribe el método interpret para verificar si el texto de entrada contiene :) y, en ese caso, devuelve "Sorprendido". Si no, devuelve una cadena vacía.
package Interpreter;

public class SorprendidoTerminalExpression implements ExpresionAbstract {
    @Override
    public String interpret(Context context) {
        String emoticon  = context.getInput();
        if (emoticon .contains(":O")) {  // Verificamos si el emoticono :O está en la entrada.
            return "sorprendido 😲";
        }
        return "";
    }
}
