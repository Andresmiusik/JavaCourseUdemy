package and.individual.chatgpt1;

public class Main {
    public static void main(String[] args) {
        Tarea t1 = new Tarea("Tarea 1");
        Tarea t2 = new Tarea("Tarea 2");
        Tarea t3 = new Tarea("Tarea 3");

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();

    }
}
