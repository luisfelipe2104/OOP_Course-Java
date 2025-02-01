/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjack;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Blackjack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        Game game = new Game();
        boolean gameLoop = true;

        while (gameLoop) {

            boolean playerIn = true;
            boolean dealerIn = true;
            Random rand = new Random();

            for (int i = 0; i < 2; i++) {
                int cardIndex1 = rand.nextInt(deck.getDeck().length);
                player.getMoreCard(deck.getDeck()[cardIndex1]);
                deck.removeCard(deck.getDeck()[cardIndex1]);

                int cardIndex2 = rand.nextInt(deck.getDeck().length);
                dealer.getMoreCard(deck.getDeck()[cardIndex2]);
                deck.removeCard(deck.getDeck()[cardIndex2]);
            }
        
            while (playerIn || dealerIn) {
                if (player.calculateHand() >= 21 | dealer.calculateHand() == 21) {
                    playerIn = false;
                    dealerIn = false;
                }
                if (playerIn) {
                    System.out.println();
                    System.out.println("------------Score: " + "player " + player.score + "-" + dealer.score + " dealer" + "------------------------");
                    System.out.println(player.showCards());
                    System.out.println(dealer.revealDealerHand(playerIn));
                    System.out.print("1-Stay \n2-Hit \n:");
                    int userInput = scanner.nextInt();
    //              Case of Stay
                    if (userInput == 1) {
                        playerIn = false;
    //              Case of Hit
                    } else if (userInput == 2) {
                        int cardIndex1 = rand.nextInt(deck.getDeck().length);
                        player.getMoreCard(deck.getDeck()[cardIndex1]);
                        deck.removeCard(deck.getDeck()[cardIndex1]);
                    }
                } else if (!playerIn & dealerIn & dealer.calculateHand() < 17) {
                    int cardIndex2 = rand.nextInt(deck.getDeck().length);
                    dealer.getMoreCard(deck.getDeck()[cardIndex2]);
                    deck.removeCard(deck.getDeck()[cardIndex2]);
                } else if (dealer.calculateHand() >= 17) dealerIn = false;
            }
            System.out.println(player.showCards());
            System.out.println(dealer.revealDealerHand(playerIn));
            game.checkWhoWon(player, dealer);
            player.returnCards();
            dealer.returnCards();

            System.out.println("\nWanna continue?");
            System.out.print("1-Continue \n2-Exit \n:");
            int wannaContinue = scanner.nextInt();

            switch (wannaContinue) {
                case 1:
                    gameLoop = true;
                    break;
                case 2:
                    gameLoop = false;
                    System.out.println("byeeee");
                    break;
                default:
                    System.out.println("Invalid input. Game will exit.");
                    gameLoop = false;
                    break;
            }
        }
    
    }

}
