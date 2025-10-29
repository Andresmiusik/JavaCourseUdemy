package and.individual.chatgpt1.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streams {
    public static void main(String[] args) {
        /*
        List<String> nombres = Arrays.asList("  andres", "Maria", "juan", "andres", " Pedro ", "JUAN", "carlos", "pedro");

        nombres.stream()
                .map(n -> n.replace(" ", "").toLowerCase())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        */

        List<String> frases = List.of(
                "Java es genial",
                "Me gusta la programación en Java",
                "La programación funcional es poderosa"
        );

        Optional<String> palabralarga = frases.stream()
                .flatMap(f-> Arrays.stream(f.split(" ")))
                .reduce((a,b) -> a.length() > b.length() ? a : b);

        System.out.println(palabralarga.get());
    }
}
