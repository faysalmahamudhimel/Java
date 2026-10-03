/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance3;




class Rectangle {

    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    // Area
    double getArea() {

        return length * breadth;
    }

    // Perimeter
    double getPerimeter() {

        return 2 * (length + breadth);
    }
}


// Square inherits Rectangle
class Square extends Rectangle {

    // Constructor
    Square(double s) {

        super(s, s);
    }
}
