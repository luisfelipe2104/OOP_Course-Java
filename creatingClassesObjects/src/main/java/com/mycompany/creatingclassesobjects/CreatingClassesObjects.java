

package com.mycompany.creatingclassesobjects;


public class CreatingClassesObjects {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.ponta = 0.5f; // f pq é real
        c1.tampada = false;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Vermelho";
        c2.ponta = 0.7f;
        c2.tampar();
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
    }
}
