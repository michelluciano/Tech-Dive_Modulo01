package Modulo1Semana8.EXERCICIOS.Modelos;

import Modulo1Semana8.EXERCICIOS.Enums.Arma;
import Modulo1Semana8.EXERCICIOS.Enums.Motivacao;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Jogador extends Personnagem implements Atacante{
    private String nome;
    private String sexo;
    private Motivacao motivacao;
    private Arma arma;
    public static final int SAUDE_MAXIMA = 200;

    public Jogador(String nome, String sexo) {
        super.setPontosSaude(SAUDE_MAXIMA);
        this.nome = nome;
        this.sexo = sexo;
        this.motivacao = motivacao;
        this.arma = arma;
    }



    @Override
    public void atacar(Personnagem alvo) {

    }
}
