package com.mycompany.encapsulamento;


public class Encapsulamento {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
//        c.setVolume(70);  // não pode fazer isso, pois setVolume está encapsulado
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}
