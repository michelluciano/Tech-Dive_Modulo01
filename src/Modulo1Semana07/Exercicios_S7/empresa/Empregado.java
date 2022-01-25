package Modulo1Semana07.Exercicios_S7.empresa;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private int vencimentoBase;
    private double salarioBase;
    private double imposto;

    //construtor
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, int vencimentoBase, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.vencimentoBase = vencimentoBase;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    //métodos

    public double calcularSalario(){
        return salarioBase = salarioBase - (salarioBase * (imposto / 100));
    }

    //getter e setter
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getVencimentoBase() {
        return vencimentoBase;
    }

    public void setVencimentoBase(int vencimentoBase) {
        this.vencimentoBase = vencimentoBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public static void main(String[] args) {

        Empregado empregado = new Empregado("Marcos",
                "Av. Brasil","30452020",
                01,10,1000,10);

        System.out.println(
                "\n" +
                        "------------------------------\n" +
                        "          Empregado           \n" +
                        "------------------------------\n" +
                        "Nome:            \t" + empregado.getNome() + "\n" +
                        "Endereço:        \t" + empregado.getEndereco() + "\n" +
                        "Telefone:        \t" + empregado.getTelefone() + "\n" +
                        "Código do Setor: \t" +empregado.getCodigoSetor() + "\n" +
                        "Vencimento Base: \t"+ empregado.getVencimentoBase()+"\n" +
                        "Salário Base:    \tR$ " + empregado.getSalarioBase() + "\n" +
                        "Imposto:         \t-" + empregado.getImposto() + "%\n" +
                        "Salario:         \tR$ " + empregado.calcularSalario()
        );
    }
}
