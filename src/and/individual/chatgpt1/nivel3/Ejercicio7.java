package and.individual.chatgpt1.nivel3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int prom = 0;
        int mayor = 0;
        //Ingresa los números
        for (int i=0 ; i <= numeros.length-1 ; i++){
            System.out.println("Digita el " + (i+1) + "° número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i=0 ; i <= numeros.length-1 ; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("Mayor: "+ mayor);

        int menor = mayor;
        for (int i=0 ; i <= numeros.length-1 ; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("Menor: "+ menor);

        //Promedio
        for (int i=0 ; i <=numeros.length-1 ; i++){
            prom += numeros[i];
            if (i == numeros.length-1){
                System.out.println("El promedio de los números es: " + prom/5);
            }
        }

        //Ordenar Números
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        for (int i=0 ; i <=numeros.length - 1 ; i++){
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
