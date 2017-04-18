package com.iantita95.claseobjetos;

/**
 * Created by Jesus on 06/04/2017.
 */

public class Auto {

    private String color;
    private float velocidad;
    private int ruedas;
    private String motor;
    private String direccion;


    public void arrancar(){
        this.velocidad = 10.4f;
    }

    public void frenar(){
        this.velocidad = 0;
    }

    public void girar(float grados){
        this.velocidad = grados;
    }


}
