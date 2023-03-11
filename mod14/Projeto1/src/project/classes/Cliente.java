package project.classes;

public class Cliente {
    private String nome;
    private long cpf;
    private long telefone;
    private int numero;
    private String endereço;
    private String cidade;
    private String estado;

    public Cliente(String nome, long cpf, long telefone, String endereço, int numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.numero = numero;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
    }

    public long getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public int getNumero() {
        return numero;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", telefone=" + telefone +
                ", numero=" + numero +
                ", endereço='" + endereço + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
