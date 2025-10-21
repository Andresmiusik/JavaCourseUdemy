package and.individual.chatgpt1.nivel4;

public class Ejercicio11 {

    public static void main(String[] args) {
        System.out.println("Suma con int " + Calculadora.sumar(1,2));
        System.out.println("Suma con double " + Calculadora.sumar(1.5,2.5));
        System.out.println("Suma con int 3 " + Calculadora.sumar(1,2,3));

        double [] numerossuma = {1, 1, 1, 1, 1};

        System.out.println("Suma con arreglo " + Calculadora.sumar(numerossuma));

    }
}
