/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractise;

import java.util.Scanner ;
public class Area {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;
        System.out.print("Input base: ");
         float base = input.nextFloat() ;
         
         System.out.print("Input height: ");
         float height = input.nextFloat();
         
         double area = 0.5 * base * height ;
         System.out.println("area= "+area);
         
         System.out.print("Inter Radius: ");
                 double r = input.nextDouble();
                 
         double radius = 3.1416 * r * r ;
         
        System.out.println("Radius: "+radius);
         
         
        
        
        
        
    }
    
}
