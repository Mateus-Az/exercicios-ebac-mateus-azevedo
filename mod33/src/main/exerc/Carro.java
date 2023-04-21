package main.exerc;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_carro_sq")
    @SequenceGenerator(name = "id_carro_sq", sequenceName = "sq_id_carro", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "Modelo")
    private String modelo;

    @Column(name = "Automatico")
    private boolean automatico;

    @Column(name = "Cor")
    private String cor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_marca")
    private Marca marca;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Column(name = "Ano")
    private int ano;


   @ManyToMany(mappedBy = "carros",cascade = CascadeType.ALL)
   private Collection<Acessorio> acessorios;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public Collection<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Collection<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
