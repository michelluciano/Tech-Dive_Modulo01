package Modulo1Semana09.Exercicios.hotelinhouse.menu;

import Modulo1Semana09.Exercicios.hotelinhouse.Hospede;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class menus {
    Scanner input = new Scanner(System.in);
    int opcao = 0;
    private static ArrayList<Hospede> hospedes = new ArrayList<>();// BANCO DE DADOS

    public void menuPrincipal() throws ParseException {

        while (true) {
            System.out.println("=========================================");
            System.out.println("         H O T E L   T E C H D I V E     ");
            System.out.println("=========================================");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Gerencias Hóspedes");
            System.out.println("2 - Rotinas da Conta");
            System.out.println("3 - Relatório do sistema");
            System.out.println("00 - Sair do Sistema");
            System.out.println("=========================================");
            opcao = input.nextInt();
            //input.nextLine(); // corrigido o bug de pular entrada
            switch (opcao) {
                case 1:
                    menuGerenciarHospede();
                    break;
                case 2:
                    //menuRotinaConta();
                    break;
                case 3:
                    //menuRelatorios();
                    break;
                case 00:
                    System.out.println("Saindo do Sistema H O T E L   T E C H D I V E");
                    System.exit(0);
                    break;
            }//fim switch
        }// fim while
    }// fim menuPrincipal

    private void menuGerenciarHospede() throws ParseException {
        opcao =0;
        do {
            System.out.println("=========================================");
            System.out.println("         H O T E L   T E C H D I V E     ");
            System.out.println("=========================================");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Cadastrar hospede");
            System.out.println("2 - Listar hospedes");
            System.out.println("3 - Pesquisar hospede");
            System.out.println("4 - Excluir Cliente");
            System.out.println("5 - Atualizar dados do Cliente");
            System.out.println("00 - Voltar");
            System.out.println("=========================================");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    //cadastrar contas
                    System.out.print("\nDigite o nome do Hóspede: ");
                    String nome = input.nextLine();
                    System.out.print("Digite o número do documento do Hóspede: ");
                    String doc = input.nextLine();
                    System.out.println("Digite a data de nascimento do Hóspede:");
                    String dataNasc = input.nextLine();
                    Date dataNascF=new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);

                    Hospede.serialHospede++; //incrementar o contador de hospede
                    Hospede ho = new Hospede(Hospede.serialHospede++,nome,doc, dataNascF);
                    hospedes.add(ho); //adiciona no ArrayList de hospedes

                    // e finalmente mostramos uma mensagem de sucesso.
                    System.out.println("\nO hóspede foi criado com sucesso!");
                    System.out.println(hospedes);
                    break;
//                case 2:
//                    // listar
//                    System.out.println("-------LISTA DE CLIENTES-------");
//                    if (hospedes.isEmpty()) {
//                        System.out.println("Não existem clientes cadastrados.");
//                    } else {
//                        for (int i = 0; i < hospedes.size(); i++) {
//                            auxConta = hospedes.get(i);
//                            System.out.println("------------------------------------");
//                            System.out.println(" - Id:             \t" + auxConta.getNrConta());
//                            System.out.println(" - Ag:             \t" + ((auxConta.getAgenciaConta()== 1) ? "001 - Florianópolis":"002 - São Jose"));
//                            System.out.println(" - Nome:           \t" + auxConta.getNomeConta());
//                            System.out.println(" - CPF:            \t" + auxConta.getCpfConta());
//                            System.out.println(" - Reanda Mensal:  \t" + auxConta.getRendaMensalConta());
//                            System.out.println(" - Saldo da Conta: \t" + auxConta.getSaldoConta());
//                        }
//                    }
//                    System.out.println("--------------------------------");
//                    break;
//                case 3:
//                    //pesquisar
//                    System.out.println("Digite o Codigo Identificador do cliente:");
//                    auxPesquisa = input.nextLine();
//                    auxConta = pesquisarConta(auxPesquisa);
//                    if (auxConta == null) {
//                        System.out.println("\nCliente não encontrado.");
//                    } else {
//                        System.out.println("------------------------------------");
//                        System.out.println(" - Id:             \t" + auxConta.getNrConta());
//                        System.out.println(" - Ag:             \t" + ((auxConta.getAgenciaConta()== 1) ? "001 - Florianópolis":"002 - São Jose"));
//                        System.out.println(" - Nome:           \t" + auxConta.getNomeConta());
//                        System.out.println(" - CPF:            \t" + auxConta.getCpfConta());
//                        System.out.println(" - Reanda Mensal:  \t" + auxConta.getRendaMensalConta());
//                        System.out.println(" - Saldo da Conta: \t" + auxConta.getSaldoConta());
//                    }
//
//                    break;
//                case 4:
//                    //excluir
//                    System.out.println("Digite o Codigo Identificador do cliente a ser excluido:");
//                    auxPesquisa = input.nextLine();
//                    auxConta = pesquisarConta(auxPesquisa);
//                    if (auxConta == null) {
//                        System.out.println("\nCliente não encontrado.");
//                    } else {
//                        System.out.println("------------------------------------");
//                        System.out.println(" - Id:             \t" + auxConta.getNrConta());
//                        System.out.println(" - Ag:             \t" + ((auxConta.getAgenciaConta()== 1) ? "001 - Florianópolis":"002 - São Jose"));
//                        System.out.println(" - Nome:           \t" + auxConta.getNomeConta());
//                        System.out.println(" - CPF:            \t" + auxConta.getCpfConta());
//                        contas.remove(auxConta);
//                        System.out.println("-----CONTA EXCLUÍDA COM SUCESSO---");
//                    }
//                    break;
//                case 5:
//                    //atualizar
//                    System.out.println("Digite o Codigo Identificador do cliente a ser atualizado:");
//                    auxPesquisa = input.nextLine();
//                    auxConta = pesquisarConta(auxPesquisa);
//                    if (auxConta == null) {
//                        System.out.println("\nCliente não encontrado.");
//                    } else {
//                        System.out.println("------Dados Atuais-----------");
//                        System.out.println(" - Id:             \t" + auxConta.getNrConta());
//                        System.out.println(" - Ag:             \t" + ((auxConta.getAgenciaConta()== 1) ? "001 - Florianópolis":"002 - São Jose"));
//                        System.out.println(" - Nome:           \t" + auxConta.getNomeConta());
//                        System.out.println(" - CPF:            \t" + auxConta.getCpfConta());
//                        System.out.println("-----------------------------");
//                        System.out.println("---Atualize os novos dados---");
//                        System.out.print("\nDigite o nome do cliente: ");
//                        nome = input.nextLine();
//                        System.out.println("Digite a renda mensal:");
//                        rendaMensal = input.nextDouble();
//                        System.out.println("Digite a Agencia:\n001 - Florianópolis\n002 - São José");
//                        agencia = input.nextInt();
//                        auxConta.setNomeConta(nome);
//                        auxConta.setRendaMensalConta(rendaMensal);
//                        auxConta.setAgenciaConta(agencia);
//                        System.out.println("-----DADOS ATUALIZADOS COM SUCESSO---");
//                    }
            }
        } while (opcao != 00);
    }// FIM menuGerenciarContas



}// fim main
