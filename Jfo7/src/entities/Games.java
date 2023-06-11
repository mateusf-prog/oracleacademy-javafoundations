package Jfo7.src.entities;

import java.util.Random;

public class Games {

    private static final int REQUIRED_CREDIT=20;

    public String swipeCard(Cards card) {
        Random random = new Random();
        if (card.getCurrentCreditBalance() > REQUIRED_CREDIT) {
            int ticketsWon = random.nextInt(41);
            card.setCurrentCreditBalance(card.getCurrentCreditBalance() - REQUIRED_CREDIT);     // reduce current balance
            card.setCurrentTicketBalance(card.getCurrentTicketBalance() + ticketsWon);      // adding tiquets to card
            return "Card number: "
                + card.getCardNumber()
                + "\nWon tickets: "
                + ticketsWon
                + "\nNew tickets balance: "
                + card.getCurrentTicketBalance();
        } else {
            return "Insuficient Balance!";
        }
    }
}
