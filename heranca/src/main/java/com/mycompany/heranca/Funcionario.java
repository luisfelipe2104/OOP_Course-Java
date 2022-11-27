package com.mycompany.heranca;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // Metodo
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
    
    // Metodos Especiais
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public String getSetor() {
        return this.setor;
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
}
