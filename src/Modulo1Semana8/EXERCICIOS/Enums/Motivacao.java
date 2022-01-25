package Modulo1Semana8.EXERCICIOS.Enums;

public enum Motivacao {
    VINGANCA("vinganca"),
    GLORIA("gloria");

    private String motivacao;

    Motivacao(String motivacao){
        this.motivacao = motivacao;
    }

    public String getMotivacao() {
        return motivacao;
    }
}
