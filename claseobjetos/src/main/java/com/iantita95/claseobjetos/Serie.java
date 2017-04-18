package com.iantita95.claseobjetos;

import android.util.Log;

/**
 * Created by Jesus on 06/04/2017.
 */

public class Serie extends Largometraje{

    private int capitulos;
    private int temporada;
    private String sinopsis;

    public Serie(String nombre, float precio){
        super(nombre, precio);
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void reproducir(){
        Log.e("myLog", "Reproduciendo Serie : "+getNombre());
    }


}
