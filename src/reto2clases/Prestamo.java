package reto2clases;
import java.util.Date;

public class Prestamo {
    private int id_prestamo;
    private String dni;
    private int id_ejemplar;
    private Date fecha_prestamo;
    private Date fecha_devolucion;

    // Constructor
    public Prestamo(int id_prestamo, String dni, int id_ejemplar, Date fecha_prestamo, Date fecha_devolucion) {
        this.id_prestamo = id_prestamo;
        this.dni = dni;
        this.id_ejemplar = id_ejemplar;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    // Getters
    public int getId_prestamo() {
        return id_prestamo;
    }
    public String getDni() {
        return dni;
    }
    public int getId_ejemplar() {
        return id_ejemplar;
    }
    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }
    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    // Setters
    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setId_ejemplar(int id_ejemplar) {
        this.id_ejemplar = id_ejemplar;
    }
    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }
    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

	// Metodos
    public boolean validarFecha(Date fecha) {
        return fecha != null && fecha.before(new Date());
    }
}
