package reto2clases;

public class Autor {
    private int idAutor;
    private String nombre;
    private int nºLibros;

    // Constructor
    public Autor(int idAutor, String nombre, int nºLibros) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nºLibros = nºLibros;
    }

    // Getters
    public int getIdAutor() {
        return idAutor;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNºLibros() {
        return nºLibros;
    }

    // Setters
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNºLibros(int nºLibros) {
        this.nºLibros = nºLibros;
    }
}
