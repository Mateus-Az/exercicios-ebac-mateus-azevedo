package project.dao;

import project.classes.Cliente;

import java.util.Collection;

public interface iClienteDAO {
    public boolean cadastrar(Cliente cliente);
    public void excluir(long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(long cpf);
    public Collection<Cliente> buscarTodosOsClientes();
}
