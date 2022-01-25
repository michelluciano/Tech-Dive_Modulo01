package Modulo1Semana07.Exercicios_S7.Animais;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro Bingo",2);
        Cavalo cavalo = new Cavalo("Cavalo Silver", 3);
        Preguica preguica = new Preguica("Preguica", 4);

        cachorro.emitirSom("aaa");
        cavalo.emitirSom("irrrriiii");
        preguica.emitirSom("zzz");

        cachorro.correr();
        cavalo.corre();
        preguica.subirEmArvore();
    }
}
