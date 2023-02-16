package Atividade;

public abstract class Carro {
    private int ano;
    private String marca;
    private String modelo;

    public Carro(int ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void ConsultarDados(){
        System.out.println("Pegando documento...");
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
