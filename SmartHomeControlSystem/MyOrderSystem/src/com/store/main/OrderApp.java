package com.store.main;

import com.store.order.OnlineOrder;
import com.store.order.Order;
import com.store.order.OrderStatus;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {
    public static void main(String[] args) {
        System.out.println("=== ORDER MANAGEMENT SYSTEM ===\n");

        // Task 7: Managing Orders Using ArrayList
        ArrayList<Order> orderList = new ArrayList<>();

        // Create 3 OnlineOrder objects
        OnlineOrder order1 = new OnlineOrder(101, 150.50);
        OnlineOrder order2 = new OnlineOrder(102, 300.00);
        OnlineOrder order3 = new OnlineOrder(103, 75.25);
        OnlineOrder order4 = new OnlineOrder(104, 0); // Testing validation logic for negative/zero

        // Actions
        order1.pay(); // Pay for first order
        order3.setStatus(OrderStatus.CANCELLED); // Cancel the third order manually for testing Task 8

        // Add them to the list
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);

        System.out.println("\n--- Processing Orders List ---");

        // Task 8: Traverse Orders Using Iterator
        Iterator<Order> iterator = orderList.iterator();

        while (iterator.hasNext()) {
            Order currentOrder = iterator.next();
            
            // Display summary
            System.out.println(currentOrder.getOrderSummary());

            // Identify and remove CANCELLED orders
            if (currentOrder.getStatus() == OrderStatus.CANCELLED) {
                System.out.println(">> Removing Cancelled Order #" + currentOrder.getOrderId());
                iterator.remove(); // Safe removal using iterator
            }
        }

        // Verify removal
        System.out.println("\n--- Final Order List ---");
        for (Order o : orderList) {
            System.out.println(o.getOrderSummary());
        }
    }
}

