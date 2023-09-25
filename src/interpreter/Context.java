// La clase Context almacena el contexto de interpretación (el texto de entrada).
//Tiene un constructor que toma la entrada y la almacena en el campo emoticon.
//Tiene un método getInput que devuelve la entrada almacenada.
package interpreter;

public class Context {
    private String emoticon;

    public Context(String emoticon) { //Almacena el contexto para la interpretación.

        this.emoticon = emoticon; //Tiene un constructor que toma la entrada de texto y la almacena en el atributo emoticon
    }
    public String getInput() {
        return emoticon;
    } //Método que devuelve la entrada almacenada.
}
