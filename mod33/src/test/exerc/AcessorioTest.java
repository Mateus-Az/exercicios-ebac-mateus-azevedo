package test.exerc;

import main.exerc.Acessorio;
import main.exerc.Carro;
import main.exerc.Marca;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;

public class AcessorioTest {
    @Test
    public void acessorioTest(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mod33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        Marca marca = new Marca();
        Carro carro = new Carro();
        Acessorio acessorio = new Acessorio();
        Collection<Carro> carros = new HashSet<>();
        Collection<Acessorio> acessorios = new HashSet<>();

        marca.setNome("Chevrolet");
        marca.setDataFundacao(Date.valueOf("1911-11-03"));
        marca.setSede("Detroit, Condado de Wayne, Michigan,  Estados Unidos");

        carro.setModelo("Onix");
        carro.setAno(2023);
        carro.setCor("Prata");
        carro.setAutomatico(false);

        acessorio.setNome("Retrovisor");
        acessorio.setCor("vermelho");
        acessorio.setValor(BigDecimal.valueOf(400.00));

        acessorios.add(acessorio);

        carro.setAcessorios(acessorios);
        carros.add(carro);

        marca.setCarros(carros);
        acessorio.setCarros(carros);
        carro.setMarca(marca);

        entityManager.persist(marca);
        entityManager.persist(carro);
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
