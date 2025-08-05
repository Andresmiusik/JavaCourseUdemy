package and.tarea29;

import java.util.function.Function;

/*
Expresión Lambda que elimine espacios, comas y puntos de una frase
y además la devuelva la frase convertida en mayúscula.
*/
public class main {

    public static void main(String[] args) {
        Function<String,String> espacios = (frase) -> frase.replace(" ","")
                .replace(",","").replace(".","").toUpperCase();

        System.out.println(espacios.apply("hola mundo, con java 8,expresiones lambda y mucho más"));

    }

}
