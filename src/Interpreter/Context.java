// Define una clase Context que almacena el contexto de interpretación (el texto de entrada).
//Tiene un constructor que toma la entrada y la almacena en el campo input.
//Tiene un método getInput que devuelve la entrada almacenada.
package Interpreter;

public class Context {
    private String input;

    public Context(String input) {
        this.input = input;
    }
    public String getInput() {
        return input;
    }
}
