
package javapractise;

import java.util.Scanner ;

public class Arithmatic {
    
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in) ;
      
        System.out.print("INPUT FIRST NUMBER: ");
        int first = input.nextInt();
        
        System.out.print("INPUT SECOND NUMBER : ");
      int second = input.nextInt();
      
        System.out.println(first +"+"+ second+"="+ (first+second));
                System.out.println(first +"-"+ second+"="+ (first-second));
                System.out.println(first +"*"+ second+"="+ (first*second));
                System.out.println(first +"/"+ second+"="+ (first/second));
                System.out.println(first +"%"+ second+"="+ (first%second));

      

             
                 
              
              
        
    }
    
}
