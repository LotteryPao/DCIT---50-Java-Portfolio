package com.store.order;

// Task 3: Create an Abstract Class Order
public abstract class Order {
    
    
    private int orderId;
    private double amount;
    private OrderStatus status;

    // Constructor to initialize fields
    public Order(int orderId, double amount) {
        this.orderId = orderId;
        // Task 6: Use the setter to ensure validation logic applies even during creation
        setAmount(amount); 
        this.status = OrderStatus.PENDING; // Default status
    }

    // Abstract method to be implented by child classes
    public abstract void processOrder();

    // Concrete method to get details
    public String getOrderSummary() {
        return "Order ID: " + orderId + " | Amount: $" + amount + " | Status: " + status;
    }

    // --- Task 6: Encapsulation Using Getters and Setters ---

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

   
    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Error: Amount cannot be negative. Value not updated.");
        }
    }

    public OrderStatus getStatus() {
        return status;
    }

   
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}