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

/* Solución del instructor

Interface funcional:

package com.aguzman.tarealambda;

@FunctionalInterface
public interface FormatearFrase {
    String limpiarYformatear(String frase);
}
Clase con el main y la expresión lambda:

package com.aguzman.tarealambda;

public class ExpresionesLambdaFormatear {

    public static void main(String[] args) {

        FormatearFrase format = frase -> {
            return frase.replace(".", "")
                    .replace(",", "").replace(" ", "")
                    .toUpperCase();
        };

        String resultado = format.limpiarYformatear("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
        System.out.println(resultado);
    }
}*/
}
