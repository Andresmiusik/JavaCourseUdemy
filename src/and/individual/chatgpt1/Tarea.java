package and.individual.chatgpt1;

public class Tarea implements Runnable{

    private String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1 ; i <= 5; i++){
            System.out.println(this.nombre + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
