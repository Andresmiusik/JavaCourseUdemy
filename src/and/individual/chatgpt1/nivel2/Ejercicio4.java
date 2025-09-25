package and.individual.chatgpt1.nivel2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número");
        String stringN = sc.nextLine();

        try {
            int number = Integer.parseInt(stringN);
            if (number % 2  == 0){
                System.out.println("Tu número: " + number + " es par");
            } else {
                System.out.println("Tu número: " + number + " es impar");
            }
        } catch (NumberFormatException e){
            System.err.println("Solo debe digitar números, vuelva a intentarlo");
        }
        sc.close();

    }
}
