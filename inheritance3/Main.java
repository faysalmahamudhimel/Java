/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Parent parentObj = new Parent();

    
        parentObj.parentMethod();


        
        Child childObj = new Child();

 
        childObj.childMethod();

      
        childObj.parentMethod();
        
        
        //parant private
     




        ParentPrivate parentObj1 = new ParentPrivate();

       

        ChildPrivate childObj1 = new ChildPrivate();

        childObj.childMethod();
        
        //member
        
        System.out.println(" ");
      
        Employee employee = new Employee();

        employee.name = "Alice";
        employee.age = 28;
        employee.phoneNumber = "0123456789";
        employee.address = "123 Main Street";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";


      
        Manager manager = new Manager();

        manager.name = "Bob";
        manager.age = 40;
        manager.phoneNumber = "0987654321";
        manager.address = "456 Office Avenue";
        manager.salary = 80000.0;
        manager.department = "IT Operations";


        
        System.out.println("---- Employee Details ----");

        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);

        employee.printSalary();


       
        System.out.println();

        System.out.println("---- Manager Details ----");

        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);

        manager.printSalary();
        
        
        //reactangle
        
        

        Rectangle rect = new Rectangle(5, 3);

        System.out.println(
            "Area of Rectangle: " + (int) rect.getArea()
        );

        System.out.println(
            "Perimeter of Rectangle: " + (int) rect.getPerimeter()
        );


        Square sq = new Square(4);

        System.out.println(
            "Area of Square: " + (int) sq.getArea()
        );

        System.out.println(
            "Perimeter of Square: " + (int) sq.getPerimeter()
        );
        
        
        //shape
        
         SquareShape square = new SquareShape();

        square.printShape();

        square.printRectangle();
        

       
    }
}
        
  