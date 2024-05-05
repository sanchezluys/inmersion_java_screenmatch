package modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosTemporada;
    private int duracionMinutosEpisodio;

    @Override
    public int getTiempoDuracionMinutos() {
        return this.duracionMinutosEpisodio * episodiosTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public int getDuracionMinutosEpisodio() {
        return duracionMinutosEpisodio;
    }

    public void setDuracionMinutosEpisodio(int duracionMinutosEpisodio) {
        this.duracionMinutosEpisodio = duracionMinutosEpisodio;
    }
}
