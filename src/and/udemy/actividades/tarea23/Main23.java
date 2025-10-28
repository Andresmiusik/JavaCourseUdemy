package and.udemy.actividades.tarea23;

/*

El siguiente requerimiento es para una lista de productos
List<Producto>, de 3 a 5 elementos, se pide calcular
el importe (precio por cantidad) y sumarlos.

La clase Producto debe tener el atributo precio
del tipo double y cantidad int, entonces utilizando
stream convertir la lista de productos en el gran total
del tipo double.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main23 {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Computador", 3000, 1));
        listaProductos.add(new Producto("iPhone", 500, 2));
        listaProductos.add(new Producto("Xbox Control", 200, 3));

        Double totalImporte = listaProductos.stream()
                .map(l -> l.getPrecio() * l.getCantidad())
                .reduce(0.0, Double::sum);

        System.out.println("Total Importe = " + totalImporte);

    }

}
