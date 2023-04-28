package modelo;

import modelo.Periodo;
import modelo.Cliente;

public class Asunto {

    private String expedienteId;
    private String estado;
    private Periodo periodo1;

    public Asunto(String expedineteId, String estado, String i, String f) {
        this.expedienteId = expedineteId;
        this.estado = estado;
        Periodo periodo = new Periodo(i, f);
        periodo1 = periodo;
    }

    public void consultarAsunto(Cliente cliente, Abogado abogado) {
        System.out.println("===== Asunto 1=======");
        System.out.println("expediente id: " + expedienteId);
        System.out.println("Estado del asunto: " + estado);
        System.out.println("Datos del cliente: " + cliente.toString());
        System.out.println("Datos del cliente: " + abogado.toString());
        System.out.println("fecha de inicio: " + periodo1.getFechaInicio());
        System.out.println("fecha de finalizacion: " + periodo1.getFechaFinalizado());
    }

    public void cambiarEstado() {
    }
}
