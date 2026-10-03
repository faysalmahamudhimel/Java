
package javapractise;

import java.util.Scanner ;

public class UppercaseLowercase {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in) ;
        System.out.println("ENter A Character: ");    
    char ch = input.next().charAt(0) ;
    if(ch>='A' && ch<='Z'){
            System.out.println("uppercase");
    }
    else if(ch>='a' && ch<='z')
    {
        System.out.println("Lowercase");
    
    }
    }
    
       
 }
