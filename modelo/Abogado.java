package modelo;

import modelo.Persona;

public class Abogado extends Persona {

    public Abogado(String id, String nombre, String direccion) {
        super(id, nombre, direccion);
    }

    @Override
    public String toString() {
        return "Abogado (id: " + super.getId() + ", nombre: " + super.getNombre() + ", direccion: " + super.getDireccion() + ")";
    }
}
