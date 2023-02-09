package atividade;

public class FabricaDeCarrosAutomaticos extends FabricaCarros {
    public FabricaDeCarrosAutomaticos(Cliente cliente) {
        super(cliente);
    }
    @Override
    public Carros fabricarCarro(Cliente cliente) {
        if ("A".equalsIgnoreCase(cliente.getClasse())) {
            Volvo volvo = new Volvo(249L, "2023/2023", "R$120.000");
            return volvo;
        }
        return null;
    }
}
