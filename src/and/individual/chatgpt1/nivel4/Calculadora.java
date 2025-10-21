package and.individual.chatgpt1.nivel4;

public class Calculadora {

    public static int sumar(int a, int b){
        return a+b;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }

    public static double sumar(double [] numeros){
        double suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }

}
