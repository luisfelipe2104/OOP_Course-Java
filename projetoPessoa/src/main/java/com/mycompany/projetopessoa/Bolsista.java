package com.mycompany.projetopessoa;

public class Bolsista extends Aluno {
    // Atributos
    private float bolsa;
    
    // Metodo
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    // Sobrescrevendo metodo de aluno
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
    }
    
//  Metodos Especiais
    public float getBolsa() {
        return this.bolsa;
    }
    
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
