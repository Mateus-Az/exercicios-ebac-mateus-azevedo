package Atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Porche porche = new Porche(2023, Porche.class.getSimpleName(),"Boxter");
        Audi audi = new Audi(2022,Audi.class.getSimpleName(),"A3");

        List<Carro> listaDeCarros = new ArrayList<Carro>();
        listaDeCarros.add(porche);
        listaDeCarros.add(audi);

        listaDeCarros.forEach(carro -> {
            carro.ConsultarDados();
            System.out.println("");
            System.out.println("**********************");
            System.out.println("");
        });
    }
}