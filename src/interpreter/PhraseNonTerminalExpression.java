// Clase FraseExpression que implementa la interfaz ExpressionAbstract.
//Tiene un campo expressions que es una lista de expresiones.
//El constructor recibe una lista de expresiones y la asigna al campo expressions.
//En el método interpret, recorre todas las expresiones en la lista, llama a su método interpret y concatena los resultados en un StringBuilder para construir la traducción final.
package interpreter;
import java.util.List;

public class PhraseNonTerminalExpression implements ExpresionAbstract {
    private List<ExpresionAbstract> expressions;//lista de objetos que implementan la interfaz ExpresionAbstract, es decir, Una lista es una estructura de datos que puede contener múltiples elementos en un orden determinado. En este caso, la lista contendrá objetos que son expresiones.

    public PhraseNonTerminalExpression(List<ExpresionAbstract> expressions) {
        this.expressions = expressions;
    }

    @Override //lo que indica que está sobrescribiendo el método de la interfaz ExpresionAbstract.
    public String interpret(Context context) {
        StringBuilder translation = new StringBuilder(); // Se crea un objeto StringBuilder llamado translation para construir la traducción resultante.  se utiliza para construir y manipular cadenas de texto de manera eficiente.
        for (ExpresionAbstract expression : expressions) {
            String result = expression.interpret(context); // Interpretamos cada expresión individual.   En cada iteración del bucle, se toma una expresión de la lista y se llama a su método interpret pasándole el objeto Context proporcionado como parámetro. El resultado de la interpretación se almacena en la variable result.
            if (!result.isEmpty()) {
                translation.append(result).append(" ");// Agregamos la traducción al resultado.  Si el resultado no está vacío, agrega el resultado al StringBuilder translation, seguido de un espacio en blanco. Esto construye la traducción final paso a paso.
            }
        }
        return translation.toString().trim();// Devolvemos la traducción final. Una vez que se han interpretado todas las expresiones y se ha construido la traducción completa en el StringBuilder translation, se convierte el StringBuilder en una cadena de texto utilizando el método toString(). Luego, se aplica el método trim() para eliminar los espacios en blanco al principio y al final de la cadena antes de devolver la traducción final como resultado del método interpret.
    }
}
