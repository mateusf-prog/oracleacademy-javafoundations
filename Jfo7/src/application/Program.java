package Jfo7.src.application;

import Jfo7.src.entities.Cards;
import Jfo7.src.entities.Games;
import Jfo7.src.entities.Prizes;
import Jfo7.src.entities.Terminals;

public class Program {
    public static void main(String args[]) {

        // instantiating the classes

        Games tetris = new Games("tetris", 30);
        Games pacMan = new Games("Pac-Man", 60);
 
        Cards card = new Cards(100, 80);
        Cards card2 = new Cards(150, 100);

        Prizes teddyBear = new Prizes("Teddy Bear", 20, 8);
        Prizes keychain = new Prizes("keychain", 15, 20);

        // printing the informations
        System.out.println("CARD1:");
        System.out.println("Card number: " + card.getCardNumber());
        System.out.println("Current credit balance: " + card.getCurrentCreditBalance());
        System.out.println("Current tickets balance: " + card.getCurrentTicketBalance());
        System.out.println();
        System.out.println("CARD2:");
        System.out.println("Card number: " + card2.getCardNumber());
        System.out.println("Current credit balance: " + card2.getCurrentCreditBalance());
        System.out.println("Current tickets balance: " + card2.getCurrentTicketBalance());
        System.out.println();

        // converting cash into card credit 
        System.out.println(Terminals.convertMoneyToCredit(card, 50));

        // printing the updated informations
        System.out.println();
        System.out.println("CARD1:");
        System.out.println("Card number: " + card.getCardNumber());
        System.out.println("Current credit balance: " + card.getCurrentCreditBalance());
        System.out.println("Current tickets balance : " + card.getCurrentTicketBalance());

        // transferring credits between two cards  
        System.out.println("\nTRANSFER CREDITS\n");
        System.out.println(Terminals.transferCredits(card, card2, 50));

        System.out.println(tetris.playGame(card2));

        System.out.println(Terminals.checkCreditBalance(card2));

        System.out.println(pacMan.playGame(card2));

        System.out.println("---------------------------");

        System.out.println(Terminals.checkTicketBalance(card2));

        System.out.println(Terminals.checkStockPrize(keychain));

        System.out.println(Terminals.withdrawPrize(card2, keychain));

        System.out.println(Terminals.checkTicketBalance(card2));

        System.out.println(Terminals.withdrawPrize(card2, teddyBear));

        System.out.println(Terminals.checkTicketBalance(card2));
    }
}
