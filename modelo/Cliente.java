package modelo;

import modelo.Persona;

public class Cliente extends Persona {

    private Asunto asunto1; 
    
    public Cliente(String id, String nombre, String direccion,String expedineteId, String e, String i, String f) {
        super(id, nombre, direccion);
        Asunto asunto = new Asunto("5464", e, i, f);
        asunto1 = asunto;
    }

    @Override
    public String toString() {
        return "Cliente 1 (id: " + super.getId() + " nombre: " + super.getNombre() + " direccion: " + super.getDireccion() + ")";
    }

    public Asunto getAsunto1() {
        return asunto1;
    }
}
