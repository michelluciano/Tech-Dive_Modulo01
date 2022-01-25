package Modulo1Semana07.Exercicios_S7.Animais;

public class Preguica extends Animal{

    public Preguica() {
    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(String s) {
        super.emitirSom("...");
    }

    public void subirEmArvore(){
        System.out.println("subindo na arvore!");
    }
}
