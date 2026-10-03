/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.util.ArrayList;

class EmptyCartException extends Exception {
    public EmptyCartException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Item {
    private double price;
    private int quantity;

    public Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(double price, int quantity) {
        items.add(new Item(price, quantity));
    }
//emty cart exception
    
    public void checkout(double balance)
            throws EmptyCartException, InsufficientBalanceException {

        if (items.isEmpty()) {
            throw new EmptyCartException("Cart is empty!");
        }

        double total = 0;

        for (Item item : items) {
            total += item.getTotal();
        }

        if (total > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        System.out.println("Checkout successful!");
        System.out.println("Total Cost: " + total);
    }
}

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addItem(100, 2);
        cart.addItem(50, 1);

        try {
            cart.checkout(300);
        }
        catch (EmptyCartException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}