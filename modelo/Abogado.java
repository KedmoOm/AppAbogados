package modelo;

import modelo.Persona;

public class Abogado extends Persona {

    private String contraseña;
    private String usuario;

    public Abogado(String id, String nombre, String direccion) {
        super(id, nombre, direccion);
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Abogado (id: " + super.getId() + ", nombre: " + super.getNombre() + ", direccion: " + super.getDireccion() + ")";
    }
}
