package Modulo1Semana07.Exercicios_S7.Animais;

public class Cachorro extends Animal{


    public Cachorro() {
        super();
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(String som) {
        super.emitirSom("au au!!!!");
    }

    public void correr(){
        System.out.println(getNome()+" está correndo");
    }
}