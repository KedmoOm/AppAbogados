package modelo;

import modelo.Persona;

public class Cliente extends Persona {
    
    private String contraseña;
    private String usuario;
    
    public Cliente(String id, String nombre, String direccion,String contraseña,String usuario) {
        super(id, nombre, direccion);
        this.contraseña = contraseña;
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
        return "Cliente 1 (id: " + super.getId() + " nombre: " + super.getNombre() + " direccion: " + super.getDireccion() + ")";
    }
}
