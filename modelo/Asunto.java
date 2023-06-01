package modelo;

import modelo.Periodo;
import modelo.Cliente;
import modelo.Abogado;
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

    public String consultarAsunto(Cliente cliente, Abogado abogado) {
        
        String s = "===== Asunto 1=======\n";
        s +="expediente id: " + expedienteId + "\n";
        s +="Estado del asunto: " + estado+ "\n";
        s += "Datos del cliente: " + cliente.toString()+ "\n";
        s +="Datos del abogado: " + abogado.toString()+ "\n";
        s +="fecha de inicio: " + periodo1.getFechaInicio()+ "\n";
        s +="fecha de finalizacion: " + periodo1.getFechaFinalizado();
        
        return s;
    }
}
