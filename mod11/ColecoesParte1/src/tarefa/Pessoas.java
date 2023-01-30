package tarefa;

public class Pessoas {
    public Pessoas(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoas() {
    }

    private String nome;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: "+ getNome() + " | " + "Sexo: " + getSexo();
    }
}
