package Modulo1Semana10.Exercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class ex02 {

    public static void main(String[] args) {

        LocalDateTime saidaVooSemFuso = LocalDateTime.of(2022, Month.APRIL, 4, 22, 30);
        LocalDateTime chegadaVooSemFuso = LocalDateTime.of(2022, Month.APRIL, 5, 7, 10);

        System.out.println("saida:"+saidaVooSemFuso);
        System.out.println("chegada"+chegadaVooSemFuso);

        Duration duracaoVooSemFuso = Duration.between(saidaVooSemFuso, chegadaVooSemFuso);
        System.out.println("Duração: "+duracaoVooSemFuso);
    }
}
