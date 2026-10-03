package javapractise;

import java.util.Scanner ;
public class EvenOdd {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in) ;
        
       System.out.println("Enter A number: ");
       
       int num = input.nextInt();
       
       if (num > 0)
       {
         if(num%2 == 0)
         {
             System.out.println("Even");
         }
         else
         {
             System.out.println("Odd Number");
         }
             
              
       }
       
       else
       {
           System.out.println("Please Inter negative number");
       }
        
    }
    
}
