package com.mycompany.polimorfismosobrecarga;

public class Mamifero extends Animal {
//  Atibutos
    protected String corPelo;
    
//  Metodos
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

//  Metodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
