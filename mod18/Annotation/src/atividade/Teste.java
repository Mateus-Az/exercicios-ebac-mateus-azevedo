package atividade;

import java.util.Arrays;

public class Teste {
    @Tabela(value = "Zero",tabela = "Teste")
    public Teste() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(Teste.class.getDeclaredConstructor().getAnnotation(Tabela.class).value());
        System.out.println(Teste.class.getDeclaredConstructor().getAnnotation(Tabela.class).tabela());
    }
}
