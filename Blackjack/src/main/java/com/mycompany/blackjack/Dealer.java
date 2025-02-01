/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author luis
 */
public class Dealer extends Player {
    
    public Dealer() {
        super();
    }

    public String revealDealerHand (boolean playerIn) {
        String handString = "Dealer has [ |";
        if (playerIn) {
            handString = handString + " " + hand[0].face + " |";
            return handString + " ]" + " for a total of...";
        } else {
            for (int i = 0; i < hand.length; i ++) {
                if (this.hand[i] != null) {
                    handString = handString + " " + hand[i].face + " |";
                }
            }
            return handString + " ]" + " for a total of: " + calculateHand() + "";
        }
        
    }
    
}