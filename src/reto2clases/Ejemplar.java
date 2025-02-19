package reto2clases;

public class Ejemplar {
    private int id_ejemplar;
    private String estado_fisico;
    private int id_libro;

    // Constructor
    public Ejemplar(int id, String estado, int libro) {
        this.id_ejemplar = id;
        this.estado_fisico = estado;
        this.id_libro = libro;
    }
    // Getters
    public int getId_ejemplar() {
        return id_ejemplar;
    }
    public String getEstado_fisico() {
        return estado_fisico;
    }

    public int getId_libro() {
        return id_libro;
    }
    // Setters
    public void setId_ejemplar(int id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }
    public void setEstado_fisico(String estado_fisico) {
        this.estado_fisico = estado_fisico;
    }
    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }
}