package Modulo1Semana10.Exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();
        System.out.println("Digite o dia do mes:");
        int diaNasc = input.nextInt();
        System.out.println("Digite o mes:");
        int mesNasc = input.nextInt();
        System.out.println("Digite o ano:");
        int anoNasc = input.nextInt();

        LocalDate dataDigitada = LocalDate.of(anoNasc, mesNasc, diaNasc);

        while (dataDigitada.getYear() == 2022) {
            System.out.println("Dia de hoje:" + dataDigitada+"segunda feira");
            dataDigitada = hoje.plusWeeks(1);

        }
    }
}
