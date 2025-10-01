/*
Crea un programa que:
Pida al usuario ingresar los valores de una matriz 3x3.
Muestre la matriz en forma de tabla.
Calcule y muestre la suma de cada fila.
Calcule y muestre la suma de cada columna.
Calcule y muestre la suma de la diagonal principal y la diagonal secundaria.
 */

package and.individual.chatgpt1.nivel3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz2d = new int[3][3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0 ; i < matriz2d.length; i++){
            for (int j = 0; j < matriz2d.length; j++){
                System.out.println("Ingresa el valor de la matriz" + "["+i+"]"+ "["+j+"]");
                matriz2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < matriz2d.length; i++){
            int scolum = 0;
            int sfilas = 0;
            for (int j = 0; j < matriz2d.length; j++){
                sfilas += matriz2d[i][j];
                scolum += matriz2d[j][i];
            }
            System.out.print("Fila "+ i + " = " + " "+ sfilas + "\n");
            System.out.print("Columna "+ i + " = "+ scolum + "\n");
        }

        for (int[] fila : matriz2d){
            for (int valor: fila){
                System.out.print(valor + " ");
            }
            System.out.println("\n");
        }

        int dprincipal = 0;
        for (int i = 0 ; i < matriz2d.length; i++){
            for (int j = 0; j < matriz2d.length; j++){
                if (i == j){
                    dprincipal +=  matriz2d[i][j];
                }
            }
        }
        System.out.println("Suma diagonal principal: " + dprincipal);

        int dsecundaria = 0;
        for (int i = 0 ; i < matriz2d.length; i++){
            for (int j = 0; j < matriz2d.length; j++){
                if (i + j == matriz2d.length-1){
                    dsecundaria +=  matriz2d[i][j];
                }
            }
        }
        System.out.println("Suma diagonal secundaria: " + dsecundaria);

        sc.close();
}
}
