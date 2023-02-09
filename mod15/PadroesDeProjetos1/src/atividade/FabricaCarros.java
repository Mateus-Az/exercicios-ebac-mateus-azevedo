package atividade;

public abstract class FabricaCarros {
    private Cliente cliente;
    private Carros carros;

    public FabricaCarros(Cliente cliente) {
        this.cliente = cliente;
        this.carros = fabricarCarro(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carros fabricarCarro(Cliente cliente) {
        return null;
    }

    public Carros getCarro() {
        return carros;
    }
}
