package Jfo7.src.entities;

public class Terminals {

    public Terminals() {
    }

    public String convertMoneyToCredit(Cards card, int ammount) {
        card.setCurrentCreditBalance(card.getCurrentCreditBalance() + (ammount * 2));        // add credit to card
        return "Added credit!\n"
            + "New credit balance: "
            + card.getCurrentCreditBalance();
        }

    public String checkCreditBalance (Cards card) {
        return "Card number: "
            + card.getCardNumber() 
            + ":\n"
            + "Current balance: "
            + card.getCurrentCreditBalance();
    }

    public String transferCredits(Cards card, Cards card2, int ammount) {
        if (card.getCurrentCreditBalance() < ammount) {
            return "Insuficient balance for transfer!"
                + card.getCardNumber()
                + "\n"
                + card.getCurrentCreditBalance();
        }
        else {
            card.setCurrentCreditBalance(card.getCurrentCreditBalance() - ammount);
            card2.setCurrentCreditBalance(card2.getCurrentCreditBalance() + ammount);
            return "Transfer completed!\n"
                + card.getCardNumber()
                + "\n"
                + card.getCurrentCreditBalance()
                + "\n"
                + card2.getCardNumber()
                + "\n"
                + card2.getCurrentCreditBalance();
        }   
    }

    public String transferCTickets(Cards card, Cards card2, int ammount) {
        if (card.getCurrentTicketBalance() < ammount) {
            return "Insuficient balance for transfer!"
                + card.getCardNumber()
                + "\n"
                + card.getCurrentTicketBalance();
        }
        else {
            card.setCurrentTicketBalance(card.getCurrentTicketBalance() - ammount);
            card2.setCurrentTicketBalance(card2.getCurrentTicketBalance() + ammount);
            return "Transfer completed!\n"
                + "Card number: " 
                + card.getCardNumber()
                + "\nCurrent ticket balance: " 
                + card.getCurrentTicketBalance()
                + "\nCard2 number: " 
                + card2.getCardNumber()
                + "\nCurrent ticket balance: " 
                + card2.getCurrentTicketBalance();
        }   
    }
}


