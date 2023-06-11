package Jfo7.src.entities;

import java.util.Random;

public class Cards {

    private int cardNumber;
    private int currentCreditBalance;
    private int currentTicketBalance;

    public Cards() {
        Random random = new Random();
        this.cardNumber = random.nextInt(100000, 999999);
    }

    public Cards(int balanceCredit, int ticketBalance) {
        Random random = new Random();
        this.currentCreditBalance = balanceCredit;
        this.currentTicketBalance = ticketBalance;
        this.cardNumber = random.nextInt(10000, 999999);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCurrentCreditBalance() {
        return currentCreditBalance;
    }

    public void setCurrentCreditBalance(int ammount) {
        this.currentCreditBalance = ammount;
    }

    public int getCurrentTicketBalance() {
        return currentTicketBalance;
    }

    public void setCurrentTicketBalance(int currentTicketBalance) {
        this.currentTicketBalance = currentTicketBalance;
    }
}
