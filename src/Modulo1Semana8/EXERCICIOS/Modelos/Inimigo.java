package Modulo1Semana8.EXERCICIOS.Modelos;

import Modulo1Semana8.EXERCICIOS.Enums.Arma;

public abstract class Inimigo extends Personnagem implements  Atacante{

    private Arma arma;
    public Inimigo(Arma arma){
        this.arma = arma;
    }

    @Override
    public void atacar(Personnagem alvo) {

    }
}
