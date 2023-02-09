package atividade;

public abstract class Carros {
    private long velocidadeMaxima;
    private String ano;
    private String valor;

    public Carros(long velocidadeMaxima, String ano, String valor) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.ano = ano;
        this.valor = valor;
    }
    public void testDrive(){
        System.out.println("Marca: " + getClass().getSimpleName() + "| Ano: " + this.ano);
        System.out.println("Carro avalidado em R$" + this.valor);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima + "Km/h");

    }

}
