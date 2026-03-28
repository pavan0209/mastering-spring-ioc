package org.example;

public class CashPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Cash");
    }
}
