package atividade;

public class FabricaDeCarrosManuais extends FabricaCarros{
    public FabricaDeCarrosManuais(Cliente cliente) {
        super(cliente);
        fabricarCarro(cliente);
    }
    @Override
    public Carros fabricarCarro(Cliente cliente) {
        if ("A".equalsIgnoreCase(cliente.getClasse())) {
            Mustang mustang = new Mustang(210L,"2023/2023","R$250.000");
            return mustang;
        }
        return null;
    }
}
