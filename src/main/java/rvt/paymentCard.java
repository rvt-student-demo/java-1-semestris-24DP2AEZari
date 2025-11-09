package rvt;

public class paymentCard {
    private double balance;

    public paymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public String toString() {
        return "tis card has " + balance + " euro balance";
    }
    public void eatAffordably() {
        if (balance >= 2.60) {
            balance = balance - 2.60;
        }
       
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance = balance - 4.60;
        }
    }
    public void addMoney(double amount) {
        if (amount <= 150) { 
            if (amount > 0) {
                balance = balance + amount; 
            } else {
                this.balance = balance;
            }
            } else {
                balance = 150;
        }
}
}

