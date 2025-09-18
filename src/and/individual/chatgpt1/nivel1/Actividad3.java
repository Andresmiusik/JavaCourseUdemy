package and.individual.chatgpt1.nivel1;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Menú:" +
                "\n1. Calcular área de un circulo"+
                "\n2. Calcular el área de un rectángulo"+
                "\n3. Calcular el área de un triangulo");
        float b;
        float h;
        int i = sc.nextInt();

        switch (i){
            case 1:
                System.out.println("Digite el radio del circulo: ");
                float r = sc.nextFloat();
                System.out.println("El área de tu circulo es: "+
                        Math.PI*Math.pow(r,2));
                break;

            case 2:
                System.out.println("Digite la base: ");
                b = sc.nextFloat();
                System.out.println("Digite la altura: ");
                h = sc.nextFloat();
                System.out.println("El área del rectangulo es:" +
                        b * h);
                break;

            case 3:
                System.out.println("Digite la base: ");
                b = sc.nextFloat();
                System.out.println("Digite la altura: ");
                h = sc.nextFloat();
                System.out.println("El área del triangulo es:" +
                        (b * h)/2);
                break;

            default:
                System.out.println("Opción inválida.");

        }
        sc.close();
    }
}
