package atividade;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Jéssica","RS",2.000,202927L);
        pessoaFisica.calculaImpostoSobreValorGanho(pessoaFisica.getValorGanho());
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Mondelez","SP",500.000,1312312L);
        pessoaJuridica.calculaImpostoSobreValorGanho(pessoaJuridica.getValorGanho());
    }
}