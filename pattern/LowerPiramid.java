/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;
   import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class LowerPiramid {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = n; i >= 1; i--) {

         
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    
