package com.iantita95.claseobjetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pelicula pelicula = new Pelicula("moana", 100f);
        Documental documental = new Documental("vida salvaje",50f);
        Serie serie = new Serie("Los Simpsons", 80f);

        reproducirDocumental(documental);
        reproducirPelicula(pelicula);
        reproducirLoquesea(pelicula);
        reproducirLoquesea(serie);

    }

    public void reproducirPelicula(Pelicula pelicula){
        pelicula.reproducir();
    }

    private void reproducirDocumental(Documental documental){
        documental.reproducir();
    }

    public void reproducirLoquesea(Largometraje largometraje){
        if (largometraje instanceof Pelicula){
            Pelicula pelicula = (Pelicula) largometraje;
            pelicula.reproducir();
        }else if (largometraje instanceof Documental){
            Documental documental = (Documental) largometraje;
            documental.reproducir();
        }else if (largometraje instanceof Serie) {
            Serie serie = (Serie) largometraje;
            serie.reproducir();
        }
    }

}
