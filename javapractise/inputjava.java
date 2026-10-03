/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractise;

import java.util.Scanner ; // to acess input machine library
public class inputjava {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ; //input machine
        
        System.out.print("Enter name = ");
        String name = input.nextLine() ; //get input from user like scanf
        
        System.out.println("name = "+name);
        
        int number ;
         System.out.print("Enter number = ");
        number = input.nextInt() ; //here input in scanner class
       
        System.out.println("Number = "+number);
        }
    
}
