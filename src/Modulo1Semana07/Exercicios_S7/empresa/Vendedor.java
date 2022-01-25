package Modulo1Semana07.Exercicios_S7.empresa;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;


    // construtor
    public Vendedor(String nome, String endereco, String telefone,
                    int codigoSetor, int vencimentoBase, double salarioBase, double imposto, double comissao, double valorVendas) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, salarioBase, imposto);
        this.comissao= comissao;
        this.valorVendas = valorVendas;
    }

    //metodos
    @Override
    public double calcularSalario(){
        double auxSalario = ((getSalarioBase() + getComissao()) - (getSalarioBase() * (getImposto() / 100)));
        return auxSalario ;
    }
    // gettere setter
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        double aux = getValorVendas() * comissao / 100;
        this.comissao = aux;
    }

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Marcos",
                "Av. Brasil","30452020",
                01,10,1000,10, 20,2000);

        System.out.println(
                "\n" +
                        "------------------------------\n" +
                        "          Vendedor            \n" +
                        "------------------------------\n" +
                        "Nome:            \t" + vendedor.getNome() + "\n" +
                        "Endereço:        \t" + vendedor.getEndereco() + "\n" +
                        "Telefone:        \t" + vendedor.getTelefone() + "\n" +
                        "Código do Setor: \t" + vendedor.getCodigoSetor() + "\n" +
                        "Vencimento Base: \t" + vendedor.getVencimentoBase()+"\n" +
                        "Salário Base:    \tR$ " + vendedor.getSalarioBase() + "\n" +
                        "Imposto:         \t-" + vendedor.getImposto() + "%\n" +
                        "Valor Venda:     \tR$ " + vendedor.getValorVendas() + "\n" +
                        "Comissao:        \t+ " + vendedor.getComissao() +"%\n"+
                        "Salario liquido: \tR$ " + vendedor.calcularSalario()
        );
    }

}
