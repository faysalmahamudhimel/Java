/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance3;

class Shape {

    void printShape() {
        System.out.println("This is shape");
    }
}

class RectangleShape extends Shape {

    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {

    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class SquareShape extends RectangleShape {

    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
