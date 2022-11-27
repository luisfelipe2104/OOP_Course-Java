package com.mycompany.projetopessoa;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;
    
    // Metodo
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }
    
    // Metodos Especiais
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
