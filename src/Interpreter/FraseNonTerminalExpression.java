// Define una clase FraseExpression que implementa la interfaz ExpressionAbstract.
//Tiene un campo expressions que es una lista de expresiones.
//El constructor recibe una lista de expresiones y la asigna al campo expressions.
//En el método interpret, recorre todas las expresiones en la lista, llama a su método interpret y concatena los resultados en un StringBuilder para construir la traducción final.
package Interpreter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FraseNonTerminalExpression implements ExpresionAbstract {
    private List<ExpresionAbstract> expressions;

    public FraseNonTerminalExpression(List<ExpresionAbstract> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String interpret(Context context) {
        StringBuilder translation = new StringBuilder();
        for (ExpresionAbstract expression : expressions) {
            String result = expression.interpret(context); // Interpretamos cada expresión individual.
            if (!result.isEmpty()) {
                translation.append(result).append(" ");// Agregamos la traducción al resultado.
            }
        }
        return translation.toString().trim();// Devolvemos la traducción final.
    }
}
