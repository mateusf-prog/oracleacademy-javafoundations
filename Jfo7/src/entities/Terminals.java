package Jfo7.src.entities;

public class Terminals {

    public static boolean checkStockPrize(Prizes prize) {
        if (prize.getStock() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static String withdrawPrize(Cards card, Prizes prize) {
        if (checkStockPrize(prize)) {
            card.setCurrentTicketBalance(card.getCurrentTicketBalance() - prize.getRequiredTickets());
            prize.setStock(prize.getStock() - 1);
            return "Prize withdrawn successfully!";
        } else {
            return "Unavailable prize";
        }
    }

    public static String convertMoneyToCredit(Cards card, int ammount) {
        card.setCurrentCreditBalance(card.getCurrentCreditBalance() + (ammount * 2));        // add credit to card
        return "Added credit!\n"
            + "New credit balance: "
            + card.getCurrentCreditBalance();
        }

    public static String checkCreditBalance (Cards card) {
        return "Card number: "
            + card.getCardNumber() 
            + ":\n"
            + "Current credit balance: "
            + card.getCurrentCreditBalance();
    }

    public static String checkTicketBalance (Cards card) {
        return "Card number: "
            + card.getCardNumber() 
            + ":\n"
            + "Current ticket balance: "
            + card.getCurrentTicketBalance();
    }

    public static String transferCredits(Cards card, Cards card2, int ammount) {
        if (card.getCurrentCreditBalance() < ammount) {
            return "Insuficient balance for transfer!"
            + "Card number: " 
            + card.getCardNumber()
            + "\n"
            + "Current credit balancee: "
            + card.getCurrentCreditBalance();
        }
        else {
            card.setCurrentCreditBalance(card.getCurrentCreditBalance() - ammount);
            card2.setCurrentCreditBalance(card2.getCurrentCreditBalance() + ammount);
            return "Transfer completed!\n"
                + "Card1 number: "
                + card.getCardNumber()
                + "\nCurrent credit balance: "
                + card.getCurrentCreditBalance()
                + "\nCard2 number: "
                + card2.getCardNumber()
                + "\nCurrent credit balance: "
                + card2.getCurrentCreditBalance();
        }   
    }

    public static String transferCTickets(Cards card, Cards card2, int ammount) {
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


