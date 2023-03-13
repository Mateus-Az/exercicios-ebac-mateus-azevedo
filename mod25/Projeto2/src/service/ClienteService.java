package service;

import atividade.Cliente;
import dao.iClienteDAO;
import service.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements iClienteService {
    public ClienteService(iClienteDAO clienteDAO) {
        super(clienteDAO);
    }
}
