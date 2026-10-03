/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractise;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class DigitSpelling {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;
        int digit = input.nextInt();
        
        switch(digit)
        {
            case 0 :
                System.out.println("Zero");
                break ;
        
        case 1 :
        
        System.out.println("one");
        break ;
        
        default :
        System.out.println("Not Digit");
        break ;
                
        }
    }
    
}
