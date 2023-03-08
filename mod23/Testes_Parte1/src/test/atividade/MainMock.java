package atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class MainMock extends Main {
   public Stream retornaListaPessoas(List<Pessoa> pessoas){
        Stream stream;
        return stream = pessoas.stream().filter(pessoa -> String.valueOf(pessoa.getSexo()).equalsIgnoreCase("f"));
    }
}

