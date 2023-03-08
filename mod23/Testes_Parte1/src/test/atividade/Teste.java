package atividade;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Teste {
    @Test
    public void testarSeHaSomenteMulheresNaLista(){
        Main main = new MainMock();
        List<Pessoa> listaGeral = new ArrayList<Pessoa>();
        Pessoa pessoa1 = new Pessoa("Mateus",'m');
        Pessoa pessoa2 = new Pessoa("Maria",'f');
        Pessoa pessoa3 = new Pessoa("Marta",'f');
        Pessoa pessoa4 = new Pessoa("Carol",'f');
        listaGeral.add(pessoa1);
        listaGeral.add(pessoa2);
        listaGeral.add(pessoa3);
        listaGeral.add(pessoa4);
        Stream<Pessoa> stream = ((MainMock) main).retornaListaPessoas(listaGeral);
        stream.forEach(pessoa -> {
            String sexoString = String.valueOf(pessoa.getSexo());
            Assert.assertTrue(pessoa.getSexo() == 'f' || pessoa.getSexo() == 'F');
        });

    }
}
//Assert.assertEquals("f".equalsIgnoreCase((stream.forEach(pessoa -> pessoa.getSexo())));