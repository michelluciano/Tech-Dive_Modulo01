package Modulo1Semana10.Exercicios;

import java.io.*;

public class ex07 {

    public static void main(String[] args) throws IOException {
        FileWriter entrada = new FileWriter("entrada.txt");
        entrada.write("aaa cc\n");
        entrada.close();

        BufferedReader txt = new BufferedReader(new FileReader("entrada.txt"));
        String texto = null;

        int qtd = 0;
        char letra = 'a';
        while ( (texto = txt.readLine()) != null) {
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == letra) {
                    qtd++;
                }
            }
        System.out.println("Número de vezes que apareceu: "+qtd );
        System.out.println("Letra digitada: "+letra);

        }
    }
}
