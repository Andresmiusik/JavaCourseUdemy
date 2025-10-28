package and.udemy.actividades.tarea22;


import java.util.Arrays;
import java.util.List;

public class ComplemetoChatGPT {

    public static void main(String[] args) {

        //Tienes una lista de listas de enteros:
        List<List<Integer>> numeros = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9),
                Arrays.asList(10));

        /*Usando Streams y flatMap, debes:
        1. Aplanar todas las listas internas en una sola lista de enteros.
        2. Filtrar solo los números pares.
        3. Multiplicar cada número par por 10.
        4. Mostrar el resultado final en consola.*/

        System.out.println(numeros);

        //1.
        numeros.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .map(n -> n*10)
                .forEach(System.out::println);
    }
}
