package reto2clases;

public class Usuario {
    private String nombre;
    private int dni;
    private int telefono;
    private String correo;
    private String contraseña;
    private String tipoUsuario;

    // Constructor
    public Usuario(String nombre, int dni, int telefono, String correo, String contraseña, String tipoUsuario) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

