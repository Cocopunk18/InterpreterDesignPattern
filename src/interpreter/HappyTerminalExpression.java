// clase FelizExpression que implementa la interfaz ExpressionAbstract.
//Sobrescribe el método interpret para verificar si el texto de entrada contiene :) y, en ese caso, devuelve "feliz 😄". Si no, devuelve una cadena vacía.
package interpreter;

public class HappyTerminalExpression implements ExpresionAbstract {
    @Override
    public String interpret(Context context) { // En este método verificamos si la cadena de entrada contiene el emoticono ":)". Si es así, devuelve la cadena "feliz 😄", de lo contrario, devuelve una cadena vacía.
        String emoticon = context.getInput();
        if (emoticon .contains(":)")) { 
            return "feliz 😄";
        }
        return "";
    }
}
