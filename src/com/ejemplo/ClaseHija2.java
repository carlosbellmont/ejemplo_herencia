package com.ejemplo;

public class ClaseHija2 extends ClasePadre{

    @Override
    public void mostrarPorPantalla() {
        // Con super nos referimos al padre
        super.mostrarPorPantalla();
        System.out.println("Pero soy la clase hija 2");
    }

}
