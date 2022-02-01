package Modulo1Semana10.Exercicios;

import java.io.File;

public class ex06 {

    public static void main(String[] args) {
        File file = new File("teste_saida.txt");
        if (file.exists()) {

            double bytes = file.length();
            System.out.println("O tamanho do arquivo é: " + bytes +" bytes");

        } else {
            System.out.println("O arquivo não existe");
        }

    }
}
