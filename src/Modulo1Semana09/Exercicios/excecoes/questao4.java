package Modulo1Semana09.Exercicios.excecoes;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        boolean aux = true;
        try{
            do{

                try {
                    System.out.println("Informe o primeiro valor:");
                    int x = teclado.nextInt();
                    System.out.println("Informe o segundo valor:");
                    int y = teclado.nextInt();

                    double r = x / y;
                    System.out.println("==========================");
                    System.out.println("Resultado da divisão:" + r);
                    System.out.println("==========================");

                    aux = false;
                }catch (ArithmeticException e){
                    System.err.printf("%nErro: %s %n", e);
                    System.err.println("Denominador não pode ser zero");
                }

            }while (aux == true);
        }

        finally {
            teclado.close();
        }
    }
}
