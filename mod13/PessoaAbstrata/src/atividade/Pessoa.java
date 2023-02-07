package atividade;

public abstract class Pessoa {
    public Pessoa(String nome, String estado, double valorGanho) {
        this.nome = nome;
        this.estado = estado;
        ValorGanho = valorGanho;
    }
    private String nome;
    private String estado;
    private double ValorGanho;
    public void calculaImpostoSobreValorGanho(double valorGanho){
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public double getValorGanho() {
        return ValorGanho;
    }
}
