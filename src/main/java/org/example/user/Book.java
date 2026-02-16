package org.example.user;

public class Book {
    private String title;
    private String description;
    private long isbn;     // Cambiado a long para soportar los 13 dígitos
    private String writer;
    private double price;  // Cambiado a double para permitir decimales

    // El constructor no lleva ";" al final y necesita llaves {}
    public Book(String title, String description, long isbn, String writer, double price) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.writer = writer;
        this.price = price;
    }

    // Método para registrar (lo he puesto público para que Main lo vea)
    public String register() {
        return "El libro '" + this.title + "' se ha registrado correctamente.";
    }

    // Getters y Setters para Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters y Setters para Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getters y Setters para ISBN
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    // Getters y Setters para Writer
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    // Getters y Setters para Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    }

