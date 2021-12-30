package org.campus02.oop;

public class MaestroPayment extends Payment{
    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCost() {
        double minCost = 0.95;

        if (exchangeToEUR() * 0.0075 > minCost) {
            return exchangeToEUR() * 0.0075;
        } else return minCost;
    }


    @Override
    public String toString() {
        return "[MaestroPayment, " +
                " cardNumber='" + cardNumber + '\'' +
                ", Amount= " + getAmount() + '\'' +
                ", Currency= " + getCurrency() + '\'' +
                ", TransactionCosts= " + calcTransactionCost() + "]";
    }
}


