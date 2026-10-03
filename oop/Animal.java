/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Asus
 */
public class Animal {
    
    String name, group ;
       int age;
    
    
    Animal(String n,String g,int a) //create constructor
    {
        name = n ;
        group = g ;
        age = a ;
        
    }
    
    void display(){ //methode creeating
    
        System.out.println("Name:"+name);
        System.out.println("Blood Group:"+group);
        System.out.println("Age:"+age);
        
        }
        
    }
    

