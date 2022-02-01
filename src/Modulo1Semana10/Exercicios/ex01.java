package Modulo1Semana10.Exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();

        System.out.println("Hoje:" + hoje);

        System.out.println("Digite o dia do seu nascimento:");
        int diaNasc = input.nextInt();
        System.out.println("Digite o mes do seu nascimento:");
        int mesNasc = input.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        int anoNasc = input.nextInt();

        LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
        System.out.println("Você nasceu no dia: "+ dataNasc);

        int idadeAnos =  hoje.getYear() - dataNasc.getYear();
        Period periodo = Period.between(dataNasc,hoje);
        System.out.println("Você tem "+periodo.getYears()+" anos de idade.");
    }
}
