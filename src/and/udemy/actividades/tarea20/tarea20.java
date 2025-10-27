package and.udemy.actividades.tarea20;


import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
/*
* Un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando el api stream
* se pide eliminar los divisibles en 10, luego convertir los elementos restante del flujo en tipo double y dividirlos en 2,
* para finalmente devolver la suma total de todos ellos usando el operador terminal reduce. El resultado debería ser 2250.0
* */
public class tarea20 {
   // Mi solución
    public static void main(String[] args) {

        IntStream num = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 10 != 0); // Elimina los divisibles en 10

        DoubleStream num2 = num.asDoubleStream() // convertir los elementos restante del flujo en tipo double
                .map(n -> n/2); //  y dividirlos en 2

        System.out.println(num2.reduce(0, (a,b) -> a+b));

    }

    // Solución de Andrés (Profesor)
    /*public static void main(String[] args) {

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);

        System.out.println(total); // 2250.0
    }*/

}
