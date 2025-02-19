package reto2clases;

public class Libro {
    private int id_libro;
    private String titulo;
    private int nºcopias;
    private String isbn;

    // Constructor
    public Libro(int id, String titulo, int nºcopias, String isbn) {
        this.id_libro = id;
        this.titulo = titulo;
        this.nºcopias = nºcopias;
        this.isbn = isbn;
    }

    // Getters
    public int getId_libro() {
        return id_libro;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getNºcopias() {
        return nºcopias;
    }
    public String getIsbn() {
        return isbn;
    }
    // Setters
    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setNºcopias(int nºcopias) {
        this.nºcopias = nºcopias;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
