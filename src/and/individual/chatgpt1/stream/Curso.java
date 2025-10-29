package and.individual.chatgpt1.stream;


import java.util.List;

public class Curso {
    private String nombre;
    private List<String> alumnos;

    public Curso(String nombre, List<String> alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<String> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return  nombre +
                "\n alumnos=" + alumnos;
    }
}
