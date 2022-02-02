package Modulo1Semana09.Exercicios.contabancaria;

import Modulo1Semana09.Exercicios.contabancaria.contas.Conta;
import Modulo1Semana09.Exercicios.contabancaria.contas.ContaCorrente;
import Modulo1Semana09.Exercicios.contabancaria.contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private List<Conta> contas = new ArrayList<>();

    void adiciona(Conta c){
        contas.add(c);
    }

    int getQuantidadeDeContas(){
        return contas.size();
    }

    Conta buscaPorTitular(String nomeTitular){
        Conta contaEscolhida = null;
        String tipoDeConta = "";
        for(Conta conta: contas) {
            if(conta.getNome().equals(nomeTitular)){
                contaEscolhida = conta;
                tipoDeConta+=conta.getClass().getSimpleName();
                System.out.println("O titular com o nome "+contaEscolhida.getNome()+" tem uma "+tipoDeConta);
            }

        }
        return contaEscolhida;
    }


    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        //populando lista
        agencia.adiciona( new ContaPoupanca(1,"Marcos"));
        agencia.adiciona(new ContaCorrente(2, "Michel"));

        //verificando tamanho da lista:
        System.out.println("Tamanho da lista de contas: "+agencia.getQuantidadeDeContas());

        agencia.buscaPorTitular("Marcos");

    }
}
