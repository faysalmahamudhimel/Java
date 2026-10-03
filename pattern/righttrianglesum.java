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
public class righttrianglesum {
   


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = input.nextInt();

        int num = 1;
        int sum = 0;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");

                sum = sum + num; // sum calculate
                num++;           // next number

            }

            System.out.println();
        }

        System.out.println("Sum = " + sum);
    }
}
