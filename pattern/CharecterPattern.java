/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;
import java.util.Scanner ;
/**
 *
 * @author Asus
 */
public class CharecterPattern {
    
   
    public static void main(String[] args) {
        int n ;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();

       
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            
            char ch = 'E';
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++; 
                } else {
                    ch--; 
                }
            }
            System.out.println();
        }

       
        for (int i = n - 2; i >= 0; i--) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

           
            char ch = 'E';
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
   
