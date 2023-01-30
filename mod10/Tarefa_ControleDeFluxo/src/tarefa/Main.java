package tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a 1° nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira a 2° nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Insira a 3° nota");
        double nota3 = scanner.nextDouble();
        System.out.println("Insira a 4° nota");
        double nota4 = scanner.nextDouble();
        ResultadoDoAno resultadoDoAno = new ResultadoDoAno(nota1,nota2,nota3,nota4);
        resultadoDoAno.calculaExibeResultado();

    }
}