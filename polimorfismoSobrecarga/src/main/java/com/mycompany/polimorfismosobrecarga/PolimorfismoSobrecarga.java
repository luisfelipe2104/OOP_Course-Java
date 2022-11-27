package com.mycompany.polimorfismosobrecarga;

// assinatura é a quantidade e o tipo de parametros

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        // Polimorfismo de sobrecarga
        c.reagir("Ola");
        c.reagir(11, 45);
        c.reagir(true);
        c.reagir(4, 5.5f);
    }
}
