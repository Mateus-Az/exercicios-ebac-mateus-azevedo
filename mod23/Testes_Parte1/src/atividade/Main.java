package atividade;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Para encerrar, digite sair");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        boolean sair = false;
        Stream stream = null;

        while (!sair) {

            String[] aux = JOptionPane.showInputDialog("Digite os dados da seguinte maneira: nome,sexo <F> para Feminino & <M> para Masculino").split(",");

            if (aux[0].equalsIgnoreCase("sair")) {
                sair = true;
                break;
            }

            pessoas.add(new Pessoa(aux[0], aux[1].charAt(0)));
            stream = pessoas.stream().filter(pessoa -> String.valueOf(pessoa.getSexo()).equalsIgnoreCase("f"));

        }
        if (stream != null) {
            stream.forEach(pessoa -> System.out.println(pessoa.toString()));
            System.out.println("===================================");
            pessoas.removeIf(pessoa -> String.valueOf(pessoa.getSexo()).equalsIgnoreCase("f"));
            pessoas.forEach(System.out::println);
        }
    }
}
