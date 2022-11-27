package com.mycompany.projetoanimal;

public class Mamifero extends Animal {
//  Atributos
    private String corPelo;
    
//  Metodos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("som de Mamifero");
    }
    
//  Metodos especiais
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    public String getCorPelo() {
        return this.corPelo;
    }
}
