package Cod;


public class Proveedor {
    private String ruc;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    // Constructor
    public Proveedor(String ruc, String nombre, String telefono, String direccion, String correo) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;        
        this.correo = correo;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getRUC() {
        return ruc;
    }

    public void setRUC(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

 
}


