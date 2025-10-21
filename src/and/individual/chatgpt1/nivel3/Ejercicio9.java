package and.individual.chatgpt1.nivel3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su nombre, edad y altura: ");

        Persona ps = new Persona(sc.nextLine(),sc.nextInt(),sc.nextDouble());

        ps.mostarInformacion();
        System.out.println("Es mayor de edad? " + ps.esMayorDeEdad());
        sc.close();
    }

}
