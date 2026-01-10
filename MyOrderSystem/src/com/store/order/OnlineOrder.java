package com.store.order;

import com.store.payment.Payable;

// Task 5: Implement a Concrete Class with Encapsulation
// Extends Order and Implements Payable interface
public class OnlineOrder extends Order implements Payable {

    public OnlineOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processing online order #" + getOrderId() + "...");
    }

    // From Payable Interface
    @Override
    public void pay() {
        // 
        setStatus(OrderStatus.PAID); 
        System.out.println("Payment received for Order #" + getOrderId() + ". Status updated to PAID.");
    }
}