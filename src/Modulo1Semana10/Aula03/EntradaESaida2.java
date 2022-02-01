package Modulo1Semana10.Aula03;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EntradaESaida2 {

    public static void main(String[] args) throws IOException {
        // GRAVANDO EM UM ARQUIVO TXT
        //        FileWriter fw = new FileWriter("teste_saida.txt");
//
//        fw.write("Escrevendo uma frase de teste");
//        fw.write("\n");
//        fw.write(System.lineSeparator());
//        fw.write("Escrevendo uma frase de teste");
//        fw.close();
        //SALANDO EM UM ARQUVIO TXT COM BUFFER
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("teste_saida.txt"))){

            bw.write("Escrevendo uma frase de teste");
            bw.write("\n");
            bw.write(System.lineSeparator());
            bw.write("Escrevendo uma frase de teste");
            bw.close();
        }

        //LENDO DE UM ARQUIVO TXT
        try(BufferedReader br = new BufferedReader(new FileReader("teste_saida.txt"))){
            String linha = br.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
            System.out.println("Leitura finalizada");
        }

        // LER DO ARQUIVO E JA ESCREVER EM OUTRO ARQUIVO
        try(BufferedReader br = new BufferedReader(new FileReader("teste_saida.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("teste_saida2.txt"))){
            String linha = br.readLine();
            while(linha != null){
                bw.write(linha);
                bw.newLine();
                linha = br.readLine();
            }
        }

        // escrevendo noarquivo com PrintStream

        try (PrintStream ps = new PrintStream("teste_saida_printStream.txt")) {
            ps.println("Testando printstream");
            ps.println();
            ps.print("Testando printstream escrevendo na mesma linha");
            ps.print("Testando printstream escrevendo na mesma linha");

        }

        //escrevendo no arquivo com PrintWrite
        try (PrintWriter pw = new PrintWriter("teste_saida_printWriter.txt")) {
            pw.println("Testando printstream");
            pw.println();
            pw.print("Testando printstream escrevendo na mesma linha");
            pw.print("Testando printstream escrevendo na mesma linha");
        }

        // lendo um arquivo CSV
        try(Scanner scanner = new Scanner(new File("contas.csv"))){
            while( scanner.hasNextLine()){
                String linha = scanner.nextLine();
                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useLocale(Locale.US);
                linhaScanner.useDelimiter(",");


                String[] valores = linha.split(",");
                //System.out.println(linha);
                //System.out.println(Arrays.toString(valores));
                System.out.println(valores[3]);
            }
        }

  }// fim main
}// fim classe
