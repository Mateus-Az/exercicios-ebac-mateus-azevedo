package atividade;

public class Cliente {
    private String classe;

    private boolean isAutomatico;
    public Cliente(String classe, boolean isAutomatico) {
    this.classe = classe;
    this.isAutomatico = isAutomatico;
    }
    public boolean getIsAutomatico(){
        return this.isAutomatico;
    }
    public String getClasse(){
        return this.classe;
    }
}
