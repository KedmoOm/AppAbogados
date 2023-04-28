package modelo;

public class Periodo {

    private String fechaInicio;
    private String fechaFinalizado;

    public Periodo(String fechaInicio, String fechaFinalizado) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizado = fechaFinalizado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinalizado() {
        return fechaFinalizado;
    }
}
