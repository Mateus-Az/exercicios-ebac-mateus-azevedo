package main.exerc;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "Marca")
public class Marca {
   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_marca_sq")
    @SequenceGenerator(name = "id_marca_sq", sequenceName = "sq_id_marca", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Data_Fundacao")
    private Date dataFundacao;

    @Column(name = "Local_Sede")
    private String sede;

    @OneToMany(mappedBy = "marca")
    private Collection<Carro> carros;

    public Collection<Carro> getCarros() {
        return carros;
    }

    public void setCarros(Collection<Carro> carros) {
        this.carros = carros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

}
