**Laboratory Activity #7: Order Management System**

This project creates a modular backend for an online store to demonstrate **Abstraction** and **Encapsulation**. 
It manages order lifecycles (Pending -> Paid -> Shipped) while ensuring data security through strict access modifiers.

## Project Structure
The code is organized into specific packages to separate concerns:
* `com.store.order` - Contains the logic for order creation and status management.
* `com.store.payment` - Handles payment contracts via Interfaces.
* `com.store.main` - The main application entry point.

 Key Features implemented
1.  **Abstraction:** Uses an `abstract class Order` to define the blueprint for all orders.
2.  **Interfaces:** Implements a `Payable` interface to standardize payment processing.
3.  **Encapsulation:** All class fields are `private`. Access is controlled via Getters/Setters with validation (e.g., preventing negative order amounts).
4.  **Safe Traversal:** Uses `Iterator<Order>` to safely remove cancelled orders from the list during runtime.
