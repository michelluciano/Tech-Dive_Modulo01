package Modulo1Semana07.Exercicios_S7.empresa;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    //construtor
    public Operario(String nome, String endereco, String telefone,
                    int codigoSetor, int vencimentoBase, double salarioBase,
                    double imposto,double valorProducao, double comissao ) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // metodos
    @Override
    public double calcularSalario(){
        double auxSalario = ((getSalarioBase() + getComissao()) - (getSalarioBase() * (getImposto() / 100)));
        return auxSalario ;
    }
    // getter e setter
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double porcentComissao) {
        this.comissao = (getValorProducao() * (porcentComissao / 100));
    }

    public static void main(String[] args) {

        Operario operario = new Operario("Marcos",
                "Av. Brasil","30452020",
                01,10,1000,10, 1000,20);

        System.out.println(
                "\n" +
                        "------------------------------\n" +
                        "          Operário            \n" +
                        "------------------------------\n" +
                        "Nome:            \t" + operario.getNome() + "\n" +
                        "Endereço:        \t" + operario.getEndereco() + "\n" +
                        "Telefone:        \t" + operario.getTelefone() + "\n" +
                        "Código do Setor: \t" + operario.getCodigoSetor() + "\n" +
                        "Vencimento Base: \t" + operario.getVencimentoBase()+"\n" +
                        "Salário Base:    \tR$ " + operario.getSalarioBase() + "\n" +
                        "Imposto:         \t-" + operario.getImposto() + "%\n" +
                        "Valor Producao:  \tR$ " + operario.getValorProducao() + "\n" +
                        "Comissao:        \t+ " + operario.getComissao() +"%\n"+
                        "Salario:         \tR$ " + operario.calcularSalario()
        );
    }
}
