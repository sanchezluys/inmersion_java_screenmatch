package Calculos;

import modelos.Titulo;

public class CalculadoraTiempos {
    private int tiempoTotal;

    public void incluye(Titulo titulo){
        tiempoTotal=tiempoTotal + titulo.getTiempoDuracionMinutos();
    }
}
