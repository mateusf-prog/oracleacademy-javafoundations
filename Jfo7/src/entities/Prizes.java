package Jfo7.src.entities;

public class Prizes {

    private String name;
    private int requiredTickets;
    private int stock;

    public Prizes(String name, int requiredTickets, int stock){
        this.name = name;
        this.requiredTickets = requiredTickets;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredTickets() {
        return this.requiredTickets;
    }

    public void setRequiredTickets(int requiredTickets) {
        this.requiredTickets = requiredTickets;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
