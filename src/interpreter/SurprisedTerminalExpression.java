// Clase SorprendidoExpression que implementa la interfaz ExpressionAbstrac.
//Sobrescribe el método interpret para verificar si el texto de entrada contiene :) y, en ese caso, devuelve "Sorprendido". Si no, devuelve una cadena vacía.
package interpreter;

public class SurprisedTerminalExpression implements ExpresionAbstract {
    @Override
    public String interpret(Context context) { //En este método verificamos si la cadena de entrada contiene el emoticono ":)". Si es así, devuelve la cadena "sorprendido 😲", de lo contrario, devuelve una cadena vacía.
        String emoticon  = context.getInput();
        if (emoticon .contains(":O")) {  // Verificamos si el emoticono :O está en la entrada.
            return "sorprendido 😲";
        }
        return "";
    }
}
