package and.tarea28;

public class AlfanumericoTarea implements Runnable{

    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO){
            for (int i = 1 ; i <= 10 ; i++){
                System.out.println("Numero " + i);
            }
        } else if (tipo == Tipo.LETRA) {
            for (int j = 65 ; j <= 90; j++ ){
                char c = (char) j;
                System.out.println("Letra " + c);
            }
        }
    }
}
