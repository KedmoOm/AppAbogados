package modelo;

public class Abogado extends Persona {

    private String contraseña;
    private String usuario;

    public Abogado(String id, String nombre, String direccion,String contraseña,String usuario) {
        super(id, nombre, direccion);
        this.contraseña = contraseña;
        this.usuario = usuario;
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
