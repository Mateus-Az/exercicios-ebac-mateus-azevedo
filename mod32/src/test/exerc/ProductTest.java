package test.exerc;

import main.exerc.Product;
import org.junit.After;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class ProductTest {
    Product prod = new Product();

    @After
    public void deleteFromTable(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mod");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Product merge = entityManager.merge(this.prod);
        entityManager.remove(merge);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Test
    public void productTest(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Mod");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        prod.setName("bala");
        prod.setValue(BigDecimal.valueOf(10));
        prod.setDescription("marca 7Belo, Lote 1234");

        entityManager.persist(prod);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
