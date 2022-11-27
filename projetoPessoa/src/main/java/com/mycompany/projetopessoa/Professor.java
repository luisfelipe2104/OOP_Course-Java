package com.mycompany.projetopessoa;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAum(float valor) {
        this.setSalario(this.getSalario() + valor);
        System.out.println("O professor " + this.nome + " recebeu um aumento de " + valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
