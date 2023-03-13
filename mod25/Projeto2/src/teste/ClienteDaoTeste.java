import atividade.Cliente;
import dao.ClienteDAO;
import dao.iClienteDAO;
import exepctions.TipoChaveNaoEncontradaException;
import mocks.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTeste{
    private iClienteDAO clienteDAO;
   private Cliente cliente;
   public ClienteDaoTeste(){
       clienteDAO = new ClienteDaoMock();
   }
    @Before
    public void inicia() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setNome("Mateus");
        cliente.setCpf(11223344556l);
        cliente.setTelefone(51998855l);
        cliente.setEndereco("Marechal");
        cliente.setNumero(199);
        cliente.setCidade("Porto Alegre");
        cliente.setEstado("RS");
        clienteDAO.cadastrar(cliente);
    }
   @Test
    public void pesquisarCliente(){
       Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
       Assert.assertNotNull(clienteConsultado);
   }
    @Test
    public void salvarcliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("mateus");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("mateus",cliente.getNome());
    }
}
