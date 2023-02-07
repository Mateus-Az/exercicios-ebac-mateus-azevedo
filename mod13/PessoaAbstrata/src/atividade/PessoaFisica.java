package atividade;

public class PessoaFisica extends Pessoa{
    public PessoaFisica(String nome, String estado, double valorGanho,long cpf) {
        super(nome, estado, valorGanho);
        this.cpf = cpf;
    }
    long cpf;
    @Override
    public void calculaImpostoSobreValorGanho(double valorGanho) {
        System.out.println("Calculo baseado no CPF: " + String.valueOf(cpf));
        System.out.println("Naturalidade: " + getEstado());
        System.out.println("Você deve pagar de imposto o valor de R$: " + valorGanho * 1.10);
    }
}
