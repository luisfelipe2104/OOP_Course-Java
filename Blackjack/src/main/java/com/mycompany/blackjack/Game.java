/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author luis
 */
public class Game {
//    Player player;
//    Dealer dealer;
//    
//    public Game(Player player, Dealer dealer) {
//        this.player = player;
//        this.dealer = dealer;
//    }
    
    public void checkWhoWon(Player player, Dealer dealer) {
        if (dealer.calculateHand() == 21) {
            System.out.println("Blackjack, Dealer wins!");
            dealer.score ++;
        } else if (player.calculateHand() == 21) {
            System.out.println("Blackjack, You win");
            player.score ++;
        } else if (player.calculateHand() == dealer.calculateHand()) {
            System.out.println("Tie!");
            player.score ++;
            dealer.score ++;
        } else if (dealer.calculateHand() > 21) {
            System.out.println("You win!");
            player.score ++;
        } else if (player.calculateHand() > 21) {
            System.out.println("Dealer wins!");
            dealer.score ++;
        } else if (player.calculateHand() > dealer.calculateHand()) {
            System.out.println("You win!");
            player.score ++;
        } else if (dealer.calculateHand() > player.calculateHand()) {
            System.out.println("Dealer wins!");
            dealer.score ++;
        } 
    }
}
