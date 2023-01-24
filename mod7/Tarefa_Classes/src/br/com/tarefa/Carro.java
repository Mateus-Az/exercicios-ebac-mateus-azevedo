package br.com.tarefa;

/**
 * @author MateusAzevedo
 * @version 1.0
 * @since 23/01/2023
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //define os valores para os atributos do veículo
    public void setaInformaçõesDoCarro() {
        this.marca = "Toyota";
        this.modelo = "Hilux";
        this.ano = 2022;
    }
    //pega todos os dados do veículo e imprime
    public void checarInformaçõesDoDocumentoDoCarro(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
    }
    //simula a ignição do carro
    public void ligarCarro() {
        System.out.println("Vrum,vrum");
        System.out.println("Bip Bip, Tanque na reserva");
    }
    // simula a aceleração de um carro e em seguida um aviso de limite de velocidade
    public void acelerar(){
        System.out.println("Aviso!!!");
        System.out.println("Velocidade máxima permitada nessa avenida é de 200Km/h");
        System.out.println("Velocidade atual: 233Km/h");
    }
}
