/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Asus
 */

    
    class Shape {

    // Method to be overridden
    void show() {
        System.out.println("This is Shape");
    }

    // Method to be directly inherited
    void getInfo() {
        System.out.println("Method implemented in Shape class");
    }
}

class Circle extends Shape {

    // Overriding show()
    @Override
    void show() {
        System.out.println("This is Circle");
    }
}

class Rectangle extends Shape {

    // Overriding show()
    @Override
    void show() {
        System.out.println("This is Rectangle");
    }
}

