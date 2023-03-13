import atividade.Cliente;
import mocks.ClienteDaoMock;
import dao.iClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.ClienteService;
import service.iClienteService;

public class ClienteServiceTeste {
    Cliente cliente;
    private iClienteService clienteService;

    public ClienteServiceTeste(){
        iClienteDAO dao  = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }
    @Before
    public void inicia(){
        cliente = new Cliente();
        cliente.setNome("Mateus");
        cliente.setCpf(11223344556l);
        cliente.setTelefone(51998855l);
        cliente.setEndereco("Marechal");
        cliente.setNumero(199);
        cliente.setCidade("Porto Alegre");
        cliente.setEstado("RS");
        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarcliente(){
        Cliente clienteConsultado = clienteService.buscarPeloCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarcliente(){
        boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() {
        cliente.setNome("mateus");
        clienteService.alterar(cliente);
        Assert.assertEquals("mateus",cliente.getNome());
    }
}
