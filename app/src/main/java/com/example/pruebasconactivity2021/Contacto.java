package com.example.pruebasconactivity2021;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nombre;

    public Contacto(){
        nombre = "Pepe pato";
    }

    public String getNombre(){
        return nombre;
    }
}
