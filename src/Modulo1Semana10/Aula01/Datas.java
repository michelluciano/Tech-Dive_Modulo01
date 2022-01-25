package Modulo1Semana10.Aula01;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Datas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje:" + hoje);

        LocalDate olimpiadasPraris = LocalDate.of(2024, Month.JULY, 12);
        System.out.println("Olimpiadas ENUM:" + olimpiadasPraris);

        Period periodo = Period.between(hoje, olimpiadasPraris);
        System.out.println(periodo);
        System.out.println("Quantos dias para as olimpiadas:");
        System.out.format("%d anos, %d meses, %d dias. %n" ,periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }
}
