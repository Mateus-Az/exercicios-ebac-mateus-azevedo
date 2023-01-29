package tarefa;

public class ResultadoDoAno {
    private double nota1, nota2, nota3, nota4;
    private double media;
    public ResultadoDoAno(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        media = (nota1 + nota2 + nota3 + nota4) / 4;
    }
    public void calculaExibeResultado(){
        if (media >= 7 && media <= 10){
            System.out.println("Sua média foi: " + media + "/ Resultado: APROVADO");
        }else if (media < 7 && media >= 5){
            System.out.println("Sua média foi: " + media + "/ Resultado: EM RECUPERAÇÃO");
        }else if (media < 5 && media >= 0){
            System.out.println("Sua média foi: " + media + "/ Resultado: REPROVADO !!!");
        }else{
            System.out.println("incorreto");
        }
    }
}
