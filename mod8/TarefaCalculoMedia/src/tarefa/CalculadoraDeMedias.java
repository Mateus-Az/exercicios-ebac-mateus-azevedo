package tarefa;

public class CalculadoraDeMedias {
    public CalculadoraDeMedias(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    private double nota1, nota2, nota3, nota4;
    private double mediaDasQuatroNotas;
    public double retornaMedia(){
        return mediaDasQuatroNotas = (nota1 + nota2 + nota3 + nota4) /4 ;
    }
}
