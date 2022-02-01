package Modulo1Semana10.Exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ex03 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formato);
        System.out.println("Hoje é dia: "+dataFormatada);

        TemporalAdjuster primeiroSabado = TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY);
        LocalDate primeiroSabadoMes = hoje.with(primeiroSabado);
        String primeiroSabadoMesFormatada = primeiroSabadoMes.format(formato);
        System.out.println("Sabado é: " + primeiroSabadoMesFormatada);
    }
}
