package com.mycompany.projetoanimal;

public class Peixe extends Animal {
//  Atributos
    private String corEscama;
    
//  Metodos
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

//  Metodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
