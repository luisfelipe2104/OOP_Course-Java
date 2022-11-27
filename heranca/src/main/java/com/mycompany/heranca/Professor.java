package com.mycompany.heranca;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;
    
    // Metodo
    public void ReceberAum(float aum) {
        this.setSalario(this.getSalario() + aum);
    }
    
    // Metodos Especiais
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getSalario() {
        return this.salario;
    }
}
