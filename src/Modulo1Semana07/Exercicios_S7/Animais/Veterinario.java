package Modulo1Semana07.Exercicios_S7.Animais;

public class Veterinario {
    public static String examinar(Animal animal){
        animal.emitirSom();
        return null;
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro Bingo",2);
        Cavalo cavalo = new Cavalo("Cavalo Silver", 3);
        Preguica preguica = new Preguica("Preguica", 4);

        examinar(cachorro);
        examinar(cavalo);
        examinar(preguica);

    }
}
