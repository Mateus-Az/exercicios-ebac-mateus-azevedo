package project.dao;

import project.classes.Cliente;

import java.util.*;

public class ClienteSetDAO implements iClienteDAO{
    private Set<Cliente> set = new LinkedHashSet<>();
    @Override
    public boolean cadastrar(Cliente cliente) {
        if (!this.set.contains(cliente.getCpf())){
            set.add(cliente);
            return true;
        }
        return false;
    }
    @Override
    public void excluir(long cpf) {
        if (this.set.contains(cpf)) {
            this.set.remove(cpf);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente.getCpf())) {
            for (Cliente cliente1 : set){
                if (cliente1.getCpf() == cliente.getCpf()){
                    cliente1.setNome(cliente.getNome());
                    cliente1.setTelefone(cliente.getTelefone());
                    cliente1.setNumero(cliente.getNumero());
                    cliente1.setEndereço(cliente.getEndereço());
                    cliente1.setCidade(cliente.getCidade());
                    cliente1.setEstado(cliente.getEstado());
                }
            }
        }
    }
    @Override
    public Cliente consultar(long cpf) {
        for (Cliente clienteCadastrado : this.set) {
            if (clienteCadastrado.getCpf() == (cpf)) {
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodosOsClientes() {
        return this.set;
    }
}
