package com.mycompany.clubedaluta;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {    // equals to compare classes
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            System.out.println("A luta foi marcada");
            this.aprovada = true;
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else {
            System.out.println("A luta não foi marcada");
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            
            Random rnd = new Random();
            int vencedor = rnd.nextInt(3);
            System.out.println("===== Resultado da Luta =====");
            switch(vencedor) {
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                    
                case 1: // Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2: // Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=============================");
        }
        else {
            System.out.println("Luta não pode acontecer");
        }
    }

    // Métodos especiais
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiado() {
        return this.desafiado;
    }
}
