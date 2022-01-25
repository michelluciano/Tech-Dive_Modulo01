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

    Scanner input = new Scanner(System.in);

    public Jogador(String nome, String sexo) {
        super.setPontosSaude(SAUDE_MAXIMA);
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public static String setNome() {
        String  nome = "";
        Scanner input = new Scanner(System.in);
        while (nome == null || nome.isEmpty() || nome.isBlank()){
            System.out.println("Insira um nome para o personagem");
            nome = input.next();
        }
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public static String setSexo() {
        String[] sexos = {"M","m","F","f"};
        String sexo = "";
        Scanner input = new Scanner(System.in);
        while(!Arrays.asList(sexos).contains(sexo)) {
            System.out.println("Insira o sexo biológico do personagem (M ou F):");
            sexo = input.next();
        }
        return sexo.toUpperCase();
    }

    public Motivacao getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(Motivacao motivacao) {
        this.motivacao = motivacao;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void atacar(Personnagem alvo) {

    }
}
