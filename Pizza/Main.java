/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizza;

class Pizza {

    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;


    Pizza(String size, int cheeseToppings,
          int pepperoniToppings, int hamToppings) {

        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }




    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }


    
    public double calcCost() {

        double cost = 0;

        if (size.equalsIgnoreCase("small")) {
            cost = 10;
        }
        else if (size.equalsIgnoreCase("medium")) {
            cost = 12;
        }
        else if (size.equalsIgnoreCase("large")) {
            cost = 14;
        }

    
        int totalToppings =
                cheeseToppings +
                pepperoniToppings +
                hamToppings;

      
        cost = cost + (totalToppings * 2);

        return cost;
    }


    // Get description
    public String getDescription() {

        return "Size: " + size +
               ", Cheese: " + cheeseToppings +
               ", Pepperoni: " + pepperoniToppings +
               ", Ham: " + hamToppings;
    }
}



// PizzaOrder class
class PizzaOrder {

    private Pizza[] pizzas;
    private int numPizzas;


    // Constructor
    PizzaOrder() {
        pizzas = new Pizza[3];
        numPizzas = 0;
    }


    // Add pizza to order
    public void addPizza(Pizza pizza) {

        if (numPizzas < 3) {
            pizzas[numPizzas] = pizza;
            numPizzas++;

            System.out.println("Pizza added successfully.");
        }
        else {
            System.out.println("Cannot add more than 3 pizzas.");
        }
    }


    // Calculate total cost
    public double calcTotal() {

        double total = 0;

        for (int i = 0; i < numPizzas; i++) {
            total = total + pizzas[i].calcCost();
        }

        return total;
    }
}



public class Main {

    public static void main(String[] args) {

   
        Pizza pizza1 =
                new Pizza("large", 1, 1, 2);

        Pizza pizza2 =
                new Pizza("medium", 2, 1, 0);

        Pizza pizza3 =
                new Pizza("small", 1, 0, 1);


       
        System.out.println(pizza1.getDescription());
        System.out.println("Cost: $" + pizza1.calcCost());

        System.out.println();

        System.out.println(pizza2.getDescription());
        System.out.println("Cost: $" + pizza2.calcCost());

        System.out.println();

        System.out.println(pizza3.getDescription());
        System.out.println("Cost: $" + pizza3.calcCost());


      
        PizzaOrder order = new PizzaOrder();

      
        order.addPizza(pizza1);
        order.addPizza(pizza2);


        System.out.println();
        System.out.println("Total Order Cost: $" +
                           order.calcTotal());
    }
}