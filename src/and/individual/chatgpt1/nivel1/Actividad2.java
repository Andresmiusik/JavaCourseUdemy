package and.individual.chatgpt1.nivel1;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");

        String nombre = sc.nextLine();
        System.out.println("\n================================");
        System.out.println("Su nombre en mayúscula: " + nombre.toUpperCase());
        System.out.println("Su nombre en minúscula: " + nombre.toLowerCase());
        System.out.println("Su nombre con la primera letra en mayúscula " +
                nombre.substring(0,1).toUpperCase() +
                nombre.substring(1).toLowerCase() );

        System.out.println("Su nombre tiene " + nombre.replace(" ","").length() +
                " letras");

        if (nombre.contains("a") || nombre.contains("A")){
            System.out.println("Contiene la letra 'a'");
        } else {
            System.out.println("Su nombre NO contiene la letra 'a'");
        }

    }
}
