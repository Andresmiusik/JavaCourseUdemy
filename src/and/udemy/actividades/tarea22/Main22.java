package and.udemy.actividades.tarea22;

/*
El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.

Por ejemplo, para el arreglo:
String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

debería quedar:
{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
*/

import java.util.Arrays;
import java.util.stream.Stream;

public class Main22 {

    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.stream(lenguajes)
                .flatMap(a -> Arrays.stream(a))
                .distinct()
                .forEach(System.out::println);
    }

}
