/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author luis
 */
public class Card {
    public String type;
    public String face;
    public boolean isLetter = false;
    
    public Card(String type, String face) {
        this.type = type;
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public boolean getIsLetter() {
        return isLetter;
    }

    public void setIsLetter(boolean isLetter) {
        this.isLetter = isLetter;
    }
    
    
    
    @Override
    public String toString() {
        return "Card{" + "type=" + type + ", face=" + face + '}';
    }
    
    
}
