/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractise;

import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     
     
     int n = input.nextInt();
     
     if(n%4==0 && n%100!=0 || n%400 == 0)
     {
         System.out.println("leap year");
         
     }
     else
     {
         System.out.println("not leap year");
     }
    }
         
    
}
