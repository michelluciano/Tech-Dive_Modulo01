package Modulo1Semana8.EXERCICIOS.Modelos;

public abstract class Personnagem {

    private int pontosSaude;
    private int pontosAtaque;
    private int pontosDefesa;


    public Personnagem() {
        this.pontosSaude = setPontosSaude(pontosSaude);
        this.pontosAtaque = setPontosAtaque(pontosAtaque);
        this.pontosDefesa = setPontosDefesa(pontosDefesa);
    }

    public int getPontosSaude() {
        return pontosSaude;
    }

    public int setPontosSaude(int pontosSaude) {
        this.pontosSaude = pontosSaude;
        return pontosSaude;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public int setPontosAtaque(int pontosAtaque) {
        this.pontosAtaque = pontosAtaque;
        return pontosAtaque;
    }

    public int getPontosDefesa() {
        return pontosDefesa;
    }

    public int setPontosDefesa(int pontosDefesa) {
        this.pontosDefesa = pontosDefesa;
        return pontosDefesa;
    }
}
