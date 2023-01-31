package atividade;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os nomes, você deve separar por virgula: , ");

        String [] nomesFormatados = scanner.next().split(",");

        //utilizei essa interface e implementação abaixo, pois ela ordena sozinha e não permite nomes repetidos @
        Set<String> listaDeNomeDePessoas = new TreeSet<>();

        for(int a = 0 ; a < nomesFormatados.length ; a++){
            listaDeNomeDePessoas.add(nomesFormatados[a]);
        }

        for (String nomes : listaDeNomeDePessoas){
            System.out.println(nomes);
        }
    }
}