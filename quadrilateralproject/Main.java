/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadrilateralproject;

/**
 *
 * @author Asus
 */

    
    // Point class represents x-y coordinates
class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


// Super class
class Quadrilateral {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;


    // Constructor
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


    // Getter methods
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }
}



// Trapezoid inherits Quadrilateral
class Trapezoid extends Quadrilateral {

    protected double height;
    protected double base1;
    protected double base2;


    public Trapezoid(Point p1, Point p2, Point p3, Point p4,
                     double base1, double base2, double height) {

        super(p1, p2, p3, p4);

        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }


    public double area() {
        return 0.5 * (base1 + base2) * height;
    }
}



// Parallelogram inherits Trapezoid
class Parallelogram extends Trapezoid {

    protected double length;
    protected double width;


    public Parallelogram(Point p1, Point p2, Point p3, Point p4,
                         double length, double width) {

        super(p1, p2, p3, p4, length, length, width);

        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }
}



// Rectangle inherits Parallelogram
class Rectangle extends Parallelogram {


    public Rectangle(Point p1, Point p2, Point p3, Point p4,
                     double length, double width) {

        super(p1, p2, p3, p4, length, width);
    }


    @Override
    public double area() {
        return length * width;
    }
}



// Square inherits Rectangle
class Square extends Rectangle {

    private double side;


    public Square(Point p1, Point p2, Point p3, Point p4,
                   double side) {

        super(p1, p2, p3, p4, side, side);

        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }
}



// Main class
public class Main {

    public static void main(String[] args) {


        Point a = new Point(0,0);
        Point b = new Point(4,0);
        Point c = new Point(4,3);
        Point d = new Point(0,3);


        Trapezoid trapezoid =
                new Trapezoid(a,b,c,d,4,6,3);


        Parallelogram parallelogram =
                new Parallelogram(a,b,c,d,5,4);


        Rectangle rectangle =
                new Rectangle(a,b,c,d,6,5);


        Square square =
                new Square(a,b,c,d,5);



        System.out.println("Trapezoid Area = "
                + trapezoid.area());


        System.out.println("Parallelogram Area = "
                + parallelogram.area());


        System.out.println("Rectangle Area = "
                + rectangle.area());


        System.out.println("Square Area = "
                + square.area());

    }
}
