package Jfo7.src.application;

import Jfo7.src.entities.Cards;
import Jfo7.src.entities.Terminals;

public class Program {
    public static void main(String args[]) {

        Terminals terminal = new Terminals();
        Cards card = new Cards(100, 80);
        Cards card2 = new Cards(150, 100);

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

        System.out.println(terminal.convertMoneyToCredit(card, 50));

        System.out.println();
        System.out.println("CARD1:");
        System.out.println("Card number: " + card.getCardNumber());
        System.out.println("Current credit balance: " + card.getCurrentCreditBalance());
        System.out.println("Current tickets balance : " + card.getCurrentTicketBalance());

        System.out.println("\nTRANSFER CREDITS");
        System.out.println(terminal.transferCredits(card, card2, 50));
    }
}
