package reto2clases;

public class Empleado extends Usuario {
    private int numeroSS;
    private boolean altaBaja;

    // Constructor
    public Empleado(int numeroSS, boolean altaBaja) {
        this.numeroSS = numeroSS;
        this.altaBaja = altaBaja;
    }

    // Getters
    public int getNumeroSS() {
        return numeroSS;
    }
    public boolean isAlta() {
        return alta;
    }

    // Setters
    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }
    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    // Métodos
    public void cambiarEstado() {
        this.alta = !this.alta;
    }
}