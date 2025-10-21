package and.udemy.actividades.tarea18;

import java.util.function.Function;

public class Main {
    //Expresión Lambda que elimine espacios, comas y puntos de una frase
    // y además la devuelva la frase convertida en mayúscula.
    public static void main(String[] args) {
        Function<String,String> dellEspacios = (frase) ->
                frase.toUpperCase().replace(" ", "")
                        .replace(".", "")
                        .replace(",", ""); //return frase.toUpperCase().replace(" ","");

        System.out.println(dellEspacios.apply("hola mundo soy andres"));
    }
}
