/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author luis
 */
public interface PlayerActions {
    public void win();
    public void lose();
    public int calculateHand();
    public void getMoreCard(Card newCard);
    public void returnCards();
}
