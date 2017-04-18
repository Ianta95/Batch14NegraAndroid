package com.iantita95.claseobjetos;

/**
 * Created by Jesus on 06/04/2017.
 */

public class Largometraje {
    private String nombre;
    private int duracion;
    private float precio;
    private int espectadores;
    public Largometraje(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String toString(){
        return "Es una pelicula con nombre " + nombre + "y cuesta " + precio;
    }


}
