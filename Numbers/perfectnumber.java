/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numbers;
import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in) ;
       
        System.out.print("Enter NUmber = ");
        
        int num = input.nextInt();
        
        int i ,sum=0;
        
        for(i=1; i<num ; i++)
        {
            if (num % i== 0)
            {
                sum = sum+ i ;
            }
        }
        
        if(sum == num )
        {
            System.out.println("Perfect number");
        
        }
        else
            System.out.println("not perfect number");
        
    
    
    }
       
    }
    