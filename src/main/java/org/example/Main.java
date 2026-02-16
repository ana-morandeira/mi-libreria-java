
package org.example;

import org.example.user.Book; // Importamos tu clase

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Querida Debbie", "Venganza a través de una columna de consejos.", 9791387512422L, "Freida McFadden", 20.90);
        Book book2 = new Book("La Biblioteca Astral", "Libros que son portales a otras realidades.", 9788411074520L, "Kate Quinn", 22.50);
        Book book3 = new Book("La muerte de Trotski", "Crónica sobre el fin de Trotski en México.", 9788411075121L, "Josh Ireland", 23.99);
        Book book4 = new Book("Y ahora, de vuelta contigo", "Romance accidentado entre meteorólogos.", 9788419131652L, "B.K. Borison", 19.00);
        Book book5 = new Book("El ocaso de Londres", "Investigación sobre el crimen organizado.", 9788411073882L, "Patrick Radden Keefe", 24.90);


        System.out.println(book1.register());
        System.out.println(book2.register());
        System.out.println(book3.register());
        System.out.println(book4.register());
        System.out.println(book5.register());

// 1. Modificamos el título para que sea una "Edición Coleccionista"
        book5.setTitle("El ocaso de Londres - Edición Coleccionista");

// 2. Modificamos el precio (le subimos el precio por ser edición especial)
        book5.setPrice(29.95);

        System.out.println("-------Datos modificados--------");
        System.out.println("Nuevo Título: " + book5.getTitle());
        System.out.println("Nuevo Precio: " + book5.getPrice() + "€");
    }
}