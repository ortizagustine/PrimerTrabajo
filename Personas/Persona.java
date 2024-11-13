package javaejemplo.personas;

@SuppressWarnings("unused")
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;

    }

    public void setApellido(String nombre) {
        this.apellido = nombre;
    }

    public Integer getEdad() {
        return edad;

    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String saludar() {
        return "Hola soy " + nombre + " " + apellido + " y tengo " + edad + " años.";
    }
}
