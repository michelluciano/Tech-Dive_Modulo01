package Modulo1Semana10.Exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class ex04 {

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
        System.out.println("Você digitou o dia: "+ dataDigitada);
        System.out.println("Dia da semana digitada:" +dataDigitada.getDayOfWeek());
        System.out.println("Dia do ano digitada: "+dataDigitada.getDayOfMonth());

        String auxSexta = String.valueOf(dataDigitada.getDayOfWeek());
        Integer aux = dataDigitada.getDayOfMonth();
        System.out.println(aux);
//        if ( auxSexta.equals("FRIDAY") && aux = 13 ){
//            System.out.println("Hoje é sexta-feira 13");
//        }else {
            System.out.println("Dia "+ dataDigitada+" não é uma sexta-feira 13.");
        }
}
