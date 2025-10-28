package and.udemy.actividades.tarea22;

import java.util.Arrays;
import java.util.List;

public class ComplemetoChatGPT2 {

    public static void main(String[] args) {
        List<String> frases = List.of(
                "Java es genial",
                "Me gusta programar en Java",
                "Programar en Java es divertido"
        );

        frases.stream()
                .map(f-> f.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
