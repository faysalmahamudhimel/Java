/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

public class Main{
    public static void main(String[] args) {

 
        Shape s;

     
        s = new Circle();
        s.show();
        s.getInfo();

        System.out.println();

      
        s = new Rectangle();
        s.show();
        s.getInfo();

        System.out.println();

    
        s = new Shape();
        s.show();
        s.getInfo();
    }
}

    

