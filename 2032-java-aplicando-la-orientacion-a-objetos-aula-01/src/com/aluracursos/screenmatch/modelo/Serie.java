package com.aluracursos.screenmatch.modelo;

public class Serie extends Titulo{

    private int Temporadas;
    private int EpisodiosPorTemporada;
    private int MinutosPorEpisodio;

    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return EpisodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {

        EpisodiosPorTemporada = episodiosPorTemporada;
    }
   @Override
    public int getDuracionEnMinutos(){
        return Temporadas*EpisodiosPorTemporada*MinutosPorEpisodio;
    }

    public int getMinutosPorEpisodio() {
        return MinutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {

        MinutosPorEpisodio = minutosPorEpisodio;
    }
}
