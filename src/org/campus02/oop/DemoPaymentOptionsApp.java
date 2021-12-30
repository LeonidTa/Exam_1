package org.campus02.
        oop;


public class DemoPaymentOptionsApp {
    public static void main(String[] args) {
        CashPayment cash = new CashPayment(200.00, "SEK");
        CreditcardPayment credit = new CreditcardPayment("AT1341351350", "abc" ,505.50, "EUR");
        MaestroPayment maestro = new MaestroPayment(350, "HUK", "AT3415135135");
        MaestroPayment maestro2 = new MaestroPayment(6000, "HUK", "AT3415135135");

        PaymentJournal journal = new PaymentJournal();
        journal.add(cash);
        journal.add(credit);
        journal.add(maestro);
        journal.add(maestro2);

        System.out.println(journal.totalTransactionCosts());
        System.out.println(journal.getPaymentsPerCurrency());

        System.out.println("cash.exchangeToEUR= " + cash.exchangeToEUR());
        System.out.println("maestro.exchangeToEUR= " + maestro.exchangeToEUR());
        System.out.println("credit.exchangeToEUR= " + credit.exchangeToEUR());
    }

}
