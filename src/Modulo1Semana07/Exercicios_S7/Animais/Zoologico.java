package Modulo1Semana07.Exercicios_S7.Animais;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public static Animal[] jaula = {new Cachorro(), new Cavalo(),new Preguica(),new Cavalo(), new Cachorro(), new Preguica(),
            new Cachorro(), new Cavalo(), new Preguica(), new Cavalo()};
    public static List<Animal> jaulas = new ArrayList<>();

    public static void main(String[] args) {
        jaulas.addAll(List.of(jaula));
        for(Animal animal: jaulas) {
            animal.emitirSom();
            animal.getNome();
        }
    }
}
