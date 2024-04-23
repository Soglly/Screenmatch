package com.aluracursos.screenmatch.calculos;

public class FiltrarRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClaisificacion()>=4){
            System.out.println("Muy bien evaluado");
        } else if (clasificacion.getClaisificacion()>=2) {
            System.out.println("popular");

        }else{
            System.out.println("Colocalo en tu lista para ver despuesta");
        }

    }

}
