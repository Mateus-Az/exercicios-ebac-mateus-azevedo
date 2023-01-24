package br.com.tarefa;
/**
 * @author MateusAzevedo
 * @version 1.0
 *@since 23/01/2023
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setaInformaçõesDoCarro();
        System.out.println("======================");
        carro.checarInformaçõesDoDocumentoDoCarro();
        System.out.println("======================");
        System.out.println("");
        System.out.println("");
        carro.ligarCarro();
        System.out.println("");
        System.out.println("======================");
        System.out.println("");
        carro.acelerar();
    }
}
