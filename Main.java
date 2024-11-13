package javaejemplo;

import javaejemplo.personas.Persona;
import javaejemplo.personas.Profesor;
import javaejemplo.personas.Estudiante;

import javaejemplo.animales.Animal;
import javaejemplo.animales.Gato;
import javaejemplo.animales.Perro;

public class Main {
    private static void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
            
        Persona persona = new Persona(
            "Cave",
            "Johnson",
            44
        );

        Profesor profesor = new Profesor(
            "Isaac",
            "Kleiner",
            38
        );

        Estudiante estudiante = new Estudiante(
            "Gordon",
            "Freeman",
            27
        );

        println(persona.saludar());
        println(profesor.saludar());
        println(estudiante.saludar());

        Animal animal = new Animal();
        Gato gato = new Gato();
        Perro perro = new Perro();

        animal.sonido();
        gato.sonido();
        perro.sonido();
    }
}
