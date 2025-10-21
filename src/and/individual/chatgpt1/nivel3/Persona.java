package and.individual.chatgpt1.nivel3;

public class Persona {
    protected String nombre;
    protected int edad;
    protected double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostarInformacion (){
        System.out.println("Nombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nAltura: "+ this.altura);
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
}
