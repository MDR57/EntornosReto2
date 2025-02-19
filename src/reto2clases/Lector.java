package reto2clases;

public class Lector extends Usuario {
    private int diasPenalizacion;
    private int nºPrestamos;
    private boolean penalizacion;

    // Constructor
    public Lector(int diasPenalizacion, int nºPrestamos, boolean penalizacion) {
        this.diasPenalizacion = diasPenalizacion;
        this.nºPrestamos = nºPrestamos;
        this.penalizacion = penalizacion;
    }

    // Getters
    public int getDiasPenalizacion() {
        return diasPenalizacion;
    }
    public int getNºPrestamos() {
        return nºPrestamos;
    }
    public boolean isPenalizacion() {
        return penalizacion;
    }

    // Setters 
    public void setDiasPenalizacion(int diasPenalizacion) {
        this.diasPenalizacion = diasPenalizacion;
    }   
    public void setNºPrestamos(int nºPrestamos) {
        this.nºPrestamos = nºPrestamos;
    }   
    public void setPenalizacion(boolean penalizacion) {
        this.penalizacion = penalizacion;
    }

    //Metodos
    public void penalizar() {
        this.penalizacion = true;
    }
}
