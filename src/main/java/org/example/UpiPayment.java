package org.example;

public class UpiPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Upi");
    }
}
