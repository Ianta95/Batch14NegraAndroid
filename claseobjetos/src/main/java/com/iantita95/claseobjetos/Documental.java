package com.iantita95.claseobjetos;

import android.util.Log;

/**
 * Created by Jesus on 06/04/2017.
 */

public class Documental extends Largometraje{

    private String conflicto;

    public Documental(String nombre, float precio){
        super(nombre, precio);
    }

    public void reproducir(){
        Log.e("myLog", "Reproduciendo documental : "+getNombre());
    }

    public String getConflicto() {
        return conflicto;
    }

    public void setConflicto(String conflicto) {
        this.conflicto = conflicto;
    }
}
