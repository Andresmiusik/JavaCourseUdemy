package and.individual.chatgpt1.nivel1;

import java.util.Scanner;

/* - Crea un programa que pida al usuario dos números enteros y muestre:
    - La suma, resta, multiplicación y división entera.
    - El resto (módulo).
    - El mayor de los dos usando el operador ternario.
*/
public class actividad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un número: ");
        int n1 = sc.nextInt();
        System.out.println("Escriba otro número: ");
        int n2 = sc.nextInt();

        System.out.println("Suma: " + (n1) + "+" +  (n2) + " = " + (n1+n2) +
                "\nResta: "  + n1 + "-" + n2 + " = " + (n1-n2) +
                "\nMultiplicación: "  + n1 + "*" + n2 + " = " + (n1*n2));

        if (n1 == 0 || n2 == 0){
            System.out.println("No se puede dividir por 0");
        } else {
            System.out.println("División"  + n1 + " / " + n2 + "=" + (n1/n2));
        }

        if (n1 == 0 || n2 == 0){
            System.out.println("No se puede dividir por 0");
        } else {
            System.out.println("Resto: "  + n1 + " % " + n2 + " = " + (n1%n2));
        }

        System.out.println("El número mayor es: " + (n1 < n2 ? n2 : n1));

    }

}
