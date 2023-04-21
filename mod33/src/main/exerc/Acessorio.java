package main.exerc;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name = "Acessorio")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_acessorio_sq")
    @SequenceGenerator(name = "id_acessorio_sq", sequenceName = "sq_id_acessorio")
    private long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Valor")
    private BigDecimal valor;

    @Column(name = "Cor")
    private String cor;

    @ManyToMany()
    @JoinTable(
            name = "acessorio_carro",
            joinColumns = @JoinColumn(name = "id_acessorio"),
            inverseJoinColumns = @JoinColumn(name = "id_carro")
    )
    private Collection<Carro> carros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Collection<Carro> getCarros() {
        return carros;
    }

    public void setCarros(Collection<Carro> carros) {
        this.carros = carros;
    }
}
