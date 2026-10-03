/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Asus
 */
public class Vehicle {
    
    void drive(){
        System.out.println("car driving");
    }
        
}

class car extends Vehicle{
    
    @Override
    
    void drive(){
        
        System.out.println("Repairing a car");
    }
}

