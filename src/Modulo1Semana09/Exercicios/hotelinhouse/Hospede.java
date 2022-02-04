package Modulo1Semana09.Exercicios.hotelinhouse;

import java.util.ArrayList;
import java.util.Date;

public class Hospede {

    private int idHospede;
    private String nome;
    private String documento;
    private Date dataNasc;
    private int quarto;
    public static int serialHospede = 3; // ID hospede
    // construtor

    public Hospede() {
    }

    public Hospede(int idHospede, String nome, String documento, Date dataNasc) {
        this.idHospede = idHospede;
        this.nome = nome;
        this.documento = documento;
        this.dataNasc = dataNasc;
    }

    //getter e setter
    public int getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    // to String

    @Override
    public String toString() {
        return "Ho1spede{" +
                "idHospede=" + idHospede +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", dataNasc=" + dataNasc +
                ", quarto=" + quarto +
                '}';
    }
}
