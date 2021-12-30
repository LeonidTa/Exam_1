package org.campus02.oop;

public class CreditcardPayment extends Payment{
    private String cardNumber;
    private String securityNumber;

    public CreditcardPayment(String cardNumber, String securityNumber, double amount, String currency) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    public double calcTransactionCost() {
        if (getCurrency() != "EUR"){
            return 1.5 + (exchangeToEUR() * 0.0275);
        } else {
            return 0.5 + (getAmount() * 0.011);
        }
    }

    @Override
    public String toString() {
        return "[CreditcardPayment, " +
                "cardNumber='" + cardNumber + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                ", Amount= " + getAmount() + '\'' +
                ", Currency= " + getCurrency() + '\'' +
                ", TransactionCosts= " + calcTransactionCost() + "]";
    }


}
