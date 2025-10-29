package and.individual.chatgpt1.stream;

import java.util.ArrayList;
import java.util.List;

public class Flapmap {

    public static void main(String[] args) {

        List<Curso> Udemy = new ArrayList<>();

        Udemy.add(new Curso("Programación Java",
                        List.of("Andres", "Carlos", "Juan", "Mario")));

        Udemy.add(new Curso("Diseño Gráfico",
                List.of("Andres", "Mario", "Juan", "Daniela", "Maria")));

        Udemy.add(new Curso("Multimedia",
                List.of("Juan", "Daniela", "Maria", "Cristian")));

        Udemy.stream()
                .map(f -> f.getAlumnos())
                .flatMap(f -> f.stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
