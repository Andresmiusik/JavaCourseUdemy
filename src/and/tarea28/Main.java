package and.tarea28;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AlfanumericoTarea tarea = new AlfanumericoTarea(Tipo.NUMERO);
        //tarea.run();
        Thread t1 = new Thread(tarea);
        t1.start();

        System.out.println("========================================");
        AlfanumericoTarea tarea2 = new AlfanumericoTarea(Tipo.LETRA);
        //tarea2.run();
        Thread t2 = new Thread(tarea2);
        t2.start();
    }
}