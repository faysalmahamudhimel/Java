/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numbers;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       
        int fact=1,num,i;
         num = input.nextInt();
        
        for(i=num; i>=1; i-- )
        {
            fact = fact*i ;
        }
        
        System.out.println("The value of factorial is= "+fact);
            
        }
    }
    
