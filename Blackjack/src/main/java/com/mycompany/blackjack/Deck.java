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
public class Deck {
    Card deck[] = new Card[52];
    Card secondDeck[] = new Card[52];
    int cardIndex = 0;
    String[] faces = {"A", "Q", "J", "K"};
    String[] types = {"e", "v", "o", "z"};
    
    public Deck() {
        createDeck();
    }
    
    public Card[] getDeck() {
        return deck;
    }
    
    public Card[] removeCard(Card cardToRemove) {
        int count = 0;
        for (int i = 0; i < deck.length; i++) {
            // System.out.println(deck[i].getFace());
            if (deck[i] == cardToRemove) {
                count ++;
            }
        }
        if (count == 0) {
            return deck;
        }
        Card newDeck[] = new Card[deck.length - count];
        int newIndex = 0;
        
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] != cardToRemove) {
                newDeck[newIndex++] = deck[i];
            }
        }
        
//        this.deck = newDeck;;
        System.arraycopy(deck, 0, newDeck, 0, newDeck.length);
        deck = newDeck;
        // System.out.println(deck.length);
        if (deck.length == 0) {
            System.out.println("...");
            deck = new Card[52];
            System.arraycopy(secondDeck, 0, deck, 0, secondDeck.length);
            deck = secondDeck;
        }
        
        return newDeck;
    }
    
    private void createDeck() {
        for (int i = 0; i < 4 ; i ++) {
            for (int j = 2; j < 11; j++) {
                deck[cardIndex] = new Card(types[i], j + "");
                cardIndex ++;
//                System.out.println(cardIndex);
            }
            for (int k = 0; k < 4; k ++) {
                deck[cardIndex] = new Card(types[i], faces[k]);
                deck[cardIndex].setIsLetter(true);
                cardIndex ++;
//                System.out.println(cardIndex);
            }
        }
        secondDeck = deck;
    }

    @Override
    public String toString() {
        return "Deck{" + "deck=" + Arrays.toString(deck) + '}';
    }
    
}
