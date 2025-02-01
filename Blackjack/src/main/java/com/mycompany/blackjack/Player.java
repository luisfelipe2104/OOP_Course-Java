/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;
import java.util.Arrays;

/**
 *
 * @author luis
 */
public class Player implements PlayerActions {
    public Card hand [] = new Card[0];
    public int totalOfHand = 0;
    public int score = 0;

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }
    
    public String showCards() {
        String handString = "You have [ |";
        for (int i = 0; i < hand.length; i ++) {
            if (this.hand[i] != null) {
                handString = handString + " " + hand[i].face + " |";
            }
        }
        return handString + " ]" + " for a total of: " + calculateHand() + "";
    }
    
    @Override
    public void getMoreCard(Card newCard) {
        Card newHand [] = new Card[hand.length + 1];
        // Copy the elements to the new array
//        System.arraycopy(hand, 0, newHand, 0, newHand.length);;;
        System.arraycopy(hand, 0, newHand, 0, hand.length);
         // Add the new card to the last position of newHand
        newHand[hand.length] = newCard;

        // Optionally, update hand reference to the new array
        hand = newHand;
    }

    @Override
    public void returnCards() {
        Card newHand [] = new Card[0];
//        System.arraycopy(hand, 0, newHand, 0, newHand.length);;;
        System.arraycopy(hand, 0, newHand, 0, newHand.length);
        hand = newHand;
    }

    @Override
    public void win() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void lose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calculateHand() {
        totalOfHand = 0;
        for (int i = 0; i < hand.length; i ++) {
            if (hand[i] != null) {
//                System.out.println(hand[i].face);
                if (!hand[i].isLetter) {
                    totalOfHand = totalOfHand + Integer.parseInt(hand[i].face);
                } else {
                    if (hand[i].face == "A") {
                        if (totalOfHand < 11) {
                            totalOfHand = totalOfHand + 11;
                        } else {
                            totalOfHand = totalOfHand + 1;
                        }
                    } else {
                        totalOfHand  = totalOfHand + 10;
                    }
                }
            } 
        }
        return totalOfHand;
    }

    @Override
    public String toString() {
        return "Player{" + "hand=" + Arrays.toString(hand) + '}';
    }
    
}
