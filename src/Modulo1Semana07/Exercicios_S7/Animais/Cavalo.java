package Modulo1Semana07.Exercicios_S7.Animais;

public class Cavalo extends Animal{
    public Cavalo() {
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(String s) {
        super.emitirSom("Irriiiiiiii!!!");
    }

    public void corre(){
        System.out.println("pocotó pocotó!");
    }

}