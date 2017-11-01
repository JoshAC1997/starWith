package sample.modelos;

import java.util.ArrayList;

/**
 * Created by Josue on 23/10/2017.
 */
public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    public int posicion;



    private static Persona[] personas = new Persona[]{

            new Persona("David", "Martinez", 20),
            new Persona("David", "Delcid", 22),
            new Persona("Juan", "Veliz", 20),
            new Persona("Josue", "Cordova", 21),
            new Persona("Yarince", "Padilla", 25),
            new Persona("Tulio", "Garcia", 20),
            new Persona("Orlando", "Calix", 23),
    };

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }




    public static Persona buscarporNombre(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].nombre.startsWith(nombre)) {
                System.out.println(personas[i].nombre + " " + personas[i].apellido+" "+ personas[i].edad);

            }
        }
        return null;
    }




}
