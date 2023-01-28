package tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double doublePrimitivo = ler.nextDouble();
        Double doubleWrapper = doublePrimitivo;
        System.out.println("");
        System.out.println(doublePrimitivo);
        System.out.println(doubleWrapper);
    }
}