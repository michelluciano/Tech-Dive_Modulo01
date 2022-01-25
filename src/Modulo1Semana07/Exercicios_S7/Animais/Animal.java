package Modulo1Semana07.Exercicios_S7.Animais;

public class Animal {

    private String nome;
    private int idade;

    //construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Animal() {

    }
//metodos

    public void emitirSom(String som){

    }

//Getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom() {
    }
}