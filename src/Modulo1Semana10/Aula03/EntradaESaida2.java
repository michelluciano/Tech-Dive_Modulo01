package Modulo1Semana10.Aula03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

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
        try(Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
            PrintWriter pw = new PrintWriter("saida_contas.txt")) {
            while( scanner.hasNextLine()){
                String linha = scanner.nextLine();
                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useLocale(Locale.US);
                linhaScanner.useDelimiter(",");


                String[] valores = linha.split(",");
                //System.out.println(linha);
                //System.out.println(Arrays.toString(valores));
                System.out.println(valores[3]);

                try (Scanner linhaScanner1 = new Scanner(linha)) {
                    linhaScanner1.useLocale(Locale.US);
                    linhaScanner1.useDelimiter(",");
                    String tipoConta = linhaScanner.next();
                    int numAgencia = linhaScanner.nextInt();
                    int numConta = linhaScanner.nextInt();
                    String titular = linhaScanner.next();
                    double saldo = linhaScanner.nextDouble();

                    System.out.format(new Locale("pt", "BR"),
                            "%s - %04d-%08d - %s: %.2f%n",
                            tipoConta, numAgencia, numConta, titular, saldo);

                    pw.printf(new Locale("pt", "BR"),
                            "%s - %04d-%08d - %s: %.2f%n",
                            tipoConta, numAgencia, numConta, titular, saldo);
                }

        /*String[] valores = linha.split(",");
        // System.out.println(linha);
        System.out.println(Arrays.toString(valores));
        System.out.println(valores[3]);*/
            }
        }

        Path path = Paths.get("teste.txt");
        List<String> linhasArquivo = Files.readAllLines(path);
    /*for (String linha : linhasArquivo) {
      System.out.println(linha);
    }*/

        // Files.lines(path).forEach(linha -> System.out.println(linha));

        try (Stream<String> stream = Files.lines(path)){
            stream.forEach(System.out::println);
        }

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("saida_contas.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }

        String str = "Testando escrita com Files";
        byte[] strToBytes = str.getBytes();

        Files.write(Paths.get("teste_saida5.txt"), strToBytes);

        try (PrintStream ps = new PrintStream(new FileOutputStream("teste_saida6.txt", true))) {
            ps.println("Teste append");
        }


        System.out.print(Charset.defaultCharset().displayName());

    }// fim main
}// fim classe
