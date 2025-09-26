package and.individual.chatgpt1.nivel2;

import java.util.Scanner;

/*
Crea un programa que pida al usuario un número (puede ser decimal) y muestre:
Su valor absoluto (Math.abs()).
Su raíz cuadrada (Math.sqrt()).
Su potencia al cubo (Math.pow()).
Un número aleatorio entre 1 y 100 (Math.random()).
*/
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número: ");

        double number = sc.nextDouble();

        System.out.println("El valor absoluto es: " + Math.abs(number));
        System.out.println("La raíz cuadrada es: " + Math.sqrt(number));
        System.out.println("El valor absoluto es: " + Math.pow(number,3));
        System.out.println("El número elevado al cubo es: " + Math.round((Math.random()*100)));

        sc.close();
    }
}
