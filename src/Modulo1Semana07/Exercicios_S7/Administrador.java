package Modulo1Semana07.Exercicios_S7;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    //construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, int vencimentoBase, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //metodos

    @Override
    public double calcularSalario(){
        double auxSalario = ((getSalarioBase() + getAjudaDeCusto()) - (getSalarioBase() * (getImposto() / 100)));
        return auxSalario ;
    }

    //getter e setter

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public static void main(String[] args) {

        Administrador administrador = new Administrador("Marcos",
                "Av. Brasil","30452020",
                01,10,1000,10, 200);

        System.out.println(
                "\n" +
                        "------------------------------\n" +
                        "          Administrador       \n" +
                        "------------------------------\n" +
                        "Nome:            \t" + administrador.getNome() + "\n" +
                        "Endereço:        \t" + administrador.getEndereco() + "\n" +
                        "Telefone:        \t" + administrador.getTelefone() + "\n" +
                        "Código do Setor: \t" + administrador.getCodigoSetor() + "\n" +
                        "Vencimento Base: \t"+ administrador.getVencimentoBase()+"\n" +
                        "Salário Base:    \tR$ " + administrador.getSalarioBase() + "\n" +
                        "Ajuda de Custo:  \tR$ " + administrador.getAjudaDeCusto() + "\n" +
                        "Imposto:         \t-" + administrador.getImposto() + "%\n" +
                        "Salario:         \tR$ " + administrador.calcularSalario()
        );
    }
}
