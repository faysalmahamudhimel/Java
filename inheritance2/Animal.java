/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;


public class Animal {
    
    
    void move(){
        System.out.println("tiger moving ");
    }
    
    
}

class  Cheetah extends Animal
        {
    
    @Override
    void move(){
        System.out.println("cheeta runs fast");
    }
        
    }

