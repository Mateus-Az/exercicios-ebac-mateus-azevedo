package tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Digite os dados da seguinte maneira: nome,sexo <F> para Feminino & <M> para Masculino");
        Scanner scanner = new Scanner(System.in);
        List<Pessoas> homens = new ArrayList<>();
        List<Pessoas> mulheres = new ArrayList<>();

        String dados;
        do {
            dados = scanner.next();
            if (!dados.equalsIgnoreCase("0")) {
                String[] dadosFormatados = dados.split(",");
                if (dadosFormatados[1].equalsIgnoreCase("M")) {
                    homens.add(new Pessoas(dadosFormatados[0], dadosFormatados[1].charAt(0)));
                } else if (dadosFormatados[1].equalsIgnoreCase("F")) {
                    mulheres.add(new Pessoas(dadosFormatados[0], dadosFormatados[1].charAt(0)));
                }
            } else if (dados.contains("0")) {
                System.out.println("Homens: ");
                System.out.println(homens);
                System.out.println("mulheres: ");
                System.out.println(mulheres);
            }
        }while (!dados.contains("0"));

        }
    }
