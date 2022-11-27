package com.mycompany.heranca;

public class Aluno extends Pessoa {
    // Atributos
    private int matr;
    private String curso;
    
    // Metodo
    public void cancelarMatr() {
        System.out.println("Matricula sera cancelada");
    }
    
    // Metodos Especiais
    public void setMatr(int matr) {
        this.matr = matr;
    }
    
    public int getMatr() {
        return this.matr;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
