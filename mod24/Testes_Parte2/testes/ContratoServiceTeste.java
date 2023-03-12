import dao.ContratoDAO;
import dao.iContratoDAO;
import dao.mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.iContratoService;

public class ContratoServiceTeste {
    @Test
    public void salvarTest() {
        iContratoDAO dao = new ContratoDaoMock();
        iContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void buscarTeste(){
        iContratoDAO dao = new ContratoDaoMock();
        iContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void exluirTeste(){
        iContratoDAO dao = new ContratoDaoMock();
        iContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void atualizarTeste(){
        iContratoDAO dao = new ContratoDaoMock();
        iContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        iContratoDAO dao = new ContratoDAO();
        iContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        iContratoDAO dao = new ContratoDAO();
        iContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        iContratoDAO dao = new ContratoDAO();
        iContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        iContratoDAO dao = new ContratoDAO();
        iContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
