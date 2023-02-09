package atividade;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A",true);

        FabricaCarros fabricaCarros = direcionaParaFabrica(cliente);
        Carros carros = fabricaCarros.getCarro();
        carros.testDrive();
    }
    private static FabricaCarros direcionaParaFabrica(Cliente cliente){
        if(cliente.getIsAutomatico()){
            FabricaDeCarrosAutomaticos ca = new FabricaDeCarrosAutomaticos(cliente);
            return ca;
        }else {
            FabricaDeCarrosManuais cm = new FabricaDeCarrosManuais(cliente);
            return cm;
        }
    }
}