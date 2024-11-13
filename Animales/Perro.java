package javaejemplo.animales;

public class Perro extends Animal {

    public Perro() {
        super();
    }

    @Override
    public void sonido() {
        System.out.println("guau");
    }
}
