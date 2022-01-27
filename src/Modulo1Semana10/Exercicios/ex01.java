package Modulo1Semana10.Exercicios;

import org.w3c.dom.CDATASection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();

        System.out.println("Hoje:" + hoje);

        System.out.println("Digite a sua data de nascimento:");
        String dataNasc = input.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascForm = dataNasc.format(data.valueOf(formato));
        System.out.println("Data formatada:" + dataNascForm);

        int anos = dataNascForm.getY - hoje.getYear();


    }

}
