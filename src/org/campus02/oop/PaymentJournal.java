package org.campus02.oop;

import java.util.*;

public class PaymentJournal {
    private ArrayList<Payment> payments = new ArrayList<>();

    public void add(Payment p){
        payments.add(p);
    }

    public double totalTransactionCosts(){
        double totalCosts = 0;

        for (Payment payment : payments) {
           totalCosts += payment.calcTransactionCost();
        }

        return totalCosts;
    }

    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap<String, Double> currencies = new HashMap<>();

        for (Payment payment : payments) {
            if (currencies.containsKey(payment.getCurrency())){
                currencies.put(payment.getCurrency(), currencies.get(payment.getCurrency()) + payment.getAmount());
            } else {
                currencies.put(payment.getCurrency(), payment.getAmount());
            }
        }
        return currencies;
    }
}
