package project.dao;

import project.classes.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements iClienteDAO{
    private Map<Long,Cliente> map = new HashMap();
    @Override
    public boolean cadastrar(Cliente cliente) {
        if (!this.map.containsKey(cliente.getCpf())){
            this.map.put(cliente.getCpf(),cliente);
            return true;
        }
        return false;
    }

    @Override
    public void excluir(long cpf) {
        if (this.map.containsKey(cpf)) {
            this.map.remove(cpf);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            Cliente cliente1 = this.map.get(cliente.getCpf());
            cliente1.setNome(cliente.getNome());
            cliente1.setTelefone(cliente.getTelefone());
            cliente1.setNumero(cliente.getNumero());
            cliente1.setEndereço(cliente.getEndereço());
            cliente1.setCidade(cliente.getCidade());
            cliente1.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodosOsClientes() {
        return this.map.values();
    }
}
