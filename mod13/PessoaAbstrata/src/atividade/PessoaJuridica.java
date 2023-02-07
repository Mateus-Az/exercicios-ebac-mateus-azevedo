package atividade;

public class PessoaJuridica extends Pessoa{
    public PessoaJuridica(String nome, String estado, double valorGanho,long cnpj) {
        super(nome, estado, valorGanho);
        this.cnpj = cnpj;
    }
    long cnpj;

    @Override
    public void calculaImpostoSobreValorGanho(double valorGanho) {
        System.out.println("Calculo baseado no CNPJ: " + String.valueOf(cnpj));
        System.out.println("Você deve pagar de imposto o valor de R$: " + valorGanho * 1.10);
    }
}
