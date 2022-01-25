package Modulo1Semana07.Exercicios_S7;

public class Fornecedor extends Pessoa{

    private double valorCredito;
    private double valorDivida;

    //construtores
    public Fornecedor(double valorCredito, double valorDivida) {
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, double valorCredito, double valorDivida) {
        super(nome, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    //metodos
    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

    //getter e setter
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Marcos","av brasil","33153044",1000,500);

        System.out.println("Nome: "+ fornecedor.getNome());
        System.out.println("Endereço: "+ fornecedor.getEndereco());
        System.out.println("Telefone: "+fornecedor.getTelefone());
        System.out.println("Crédito: R$"+fornecedor.getValorCredito());
        System.out.println("Dívida: R$"+fornecedor.getValorDivida());
        System.out.println("Saldo: R$"+ fornecedor.obterSaldo());

    }

}
