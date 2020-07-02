package com.ejemplo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ClasePadre clasePadre = new ClasePadre();
        ClaseHija1 claseHija1 = new ClaseHija1();
        ClaseHija2 claseHija2 = new ClaseHija2();

        System.out.println("Ejecutando... clasePadre.mostrarPorPantalla()");
        clasePadre.mostrarPorPantalla();
        System.out.println("Ejecutando... claseHija1.mostrarPorPantalla()");
        claseHija1.mostrarPorPantalla();
        System.out.println("Ejecutando... claseHija2.mostrarPorPantalla()");
        claseHija2.mostrarPorPantalla();

        ArrayList<ClasePadre> lista = agruparEnLista(clasePadre, claseHija1, claseHija2);
        mostrarLista(lista);
    }

    private static ArrayList<ClasePadre> agruparEnLista(ClasePadre clasePadre, ClaseHija1 claseHija1, ClaseHija2 claseHija2){
        ArrayList<ClasePadre> lista = new ArrayList<>();
        lista.add(clasePadre);
        lista.add(claseHija1);
        lista.add(claseHija2);
        return lista;
    }

    private static void mostrarLista(ArrayList<ClasePadre> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("En la posición" + i + " digo...");
            lista.get(i).mostrarPorPantalla();
        }
    }
}
