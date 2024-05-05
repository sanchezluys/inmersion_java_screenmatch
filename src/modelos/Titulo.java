package modelos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private double evaluacion;
    private boolean incluidoPlanBasico;
    private String sinopsis;
    private int tiempoDuracionMinutos;
    // creando los setter y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDuracionMinutos() {
        return tiempoDuracionMinutos;
    }

    public void setTiempoDuracionMinutos(int tiempoDuracionMinutos) {
        this.tiempoDuracionMinutos = tiempoDuracionMinutos;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public boolean isIncluidoPlanBasico() {
        return incluidoPlanBasico;
    }

    public void setIncluidoPlanBasico(boolean incluidoPlanBasico) {
        this.incluidoPlanBasico = incluidoPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    // metodo
    public void muestraFichaTecnica(){
        System.out.println("****** Ficha Técnica de " + this.nombre +" ************");
        System.out.println("Nombre del Titulo: " +this.nombre);
        System.out.println("Fecha de Lanzamiento: "+ this.fechaLanzamiento);
        System.out.println("Tiempo de Duración: " + getTiempoDuracionMinutos() + " min");
        System.out.println("*********************************");
    }
}
