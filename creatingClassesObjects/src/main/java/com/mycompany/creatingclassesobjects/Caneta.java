
package com.mycompany.creatingclassesobjects;

public class Caneta {
    // ATRIBUTES
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // mostra a cor da caneta
    void status() { 
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Nâo posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
