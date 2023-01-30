package tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pessoas> homens = new ArrayList<>();
        List<Pessoas> mulheres = new ArrayList<>();

        System.out.println("Digite quantas pessoas deseja cadastrar");
        int quantidadeDePessoas = scanner.nextInt();

        System.out.println("Digite os dados da seguinte maneira: nome,sexo <F> para Feminino & <M> para Masculino");
        for (int a = 0; a < quantidadeDePessoas; a++) {
            String dados = scanner.next();
            String[] dadosFormatados = dados.split(",");

            if (dadosFormatados[1].equalsIgnoreCase("M")) {
                homens.add(new Pessoas(dadosFormatados[0], dadosFormatados[1].charAt(0)));
            } else if (dadosFormatados[1].equalsIgnoreCase("F")) {
                mulheres.add(new Pessoas(dadosFormatados[0], dadosFormatados[1].charAt(0)));
            } else {
                System.out.println("Inválido");
                a--;
            }
        }
        System.out.println("Homens: ");
        System.out.println(homens);
        System.out.println("Mulheres: ");
        System.out.println(mulheres);
    }
}