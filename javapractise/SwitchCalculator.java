
package javapractise;

import java.util.Scanner ;
public class SwitchCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char ch ;
        int num1,num2 ;
        
        System.out.print("Enter Operator ('+''-''*''/'): ");
        ch=input.next().charAt(0);
        System.out.print("Enter Two Number: ");
        
        num1 = input.nextInt();
                num2 = input.nextInt();
                
                switch(ch){
                    
                    case '+' : 
                        System.out.println(num1+num2);
                        break;
                        
                         case '-' : 
                        System.out.println(num1-num2);
                        break;
                        
                         case '*' : 
                        System.out.println(num1*num2);
                        break;
                        
                         case '/' : 
                        System.out.println(num1/num2);
                        break;
                        
                         default:
                             System.out.println("Enter Number");
                             break ;
                        
                }

        
    }
    
}
