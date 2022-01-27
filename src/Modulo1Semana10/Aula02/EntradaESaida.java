package Modulo1Semana10.Aula02;

import java.io.*;

public class EntradaESaida {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("teste.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)){

            String linha = br.readLine();

            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();

            }
            //System.out.println(linha);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
