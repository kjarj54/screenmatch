package com.aluracursos.screenmacth.calculos;
import com.aluracursos.screenmacth.modelos.Titulo;


public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}