package Jfo7.src.entities;

import java.util.Random;

public class Games {

    private String name;
    private int requiredCredit;

    public Games(String name, int requiredCredit) {
        this.name = name;
        this.requiredCredit = requiredCredit;
    }

    public String getName() {
        return name;
    }

    public int getRequiredCredit() {
        return requiredCredit;
    }

    public String playGame(Cards card) {
        if (checkCreditBalance(card)) {
            Random random = new Random();
            int ticketWon = random.nextInt(41);
            card.setCurrentCreditBalance(card.getCurrentCreditBalance() - requiredCredit);     // reduce current balance
            card.setCurrentTicketBalance(card.getCurrentTicketBalance() + ticketWon);
            return "Playing the game!";
        } else {
            return "Isuficient balance!";
        }
    }

    public boolean checkCreditBalance(Cards card) {
        if (card.getCurrentCreditBalance() > requiredCredit) {
            return true;
        } else {
            return false;
        }
    }
}
