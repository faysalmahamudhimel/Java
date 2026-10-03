/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package squre15;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array of 15 Square objects
        Square[] squares = new Square[15];

        // Taking input
        for (int i = 0; i < 15; i++) {

            System.out.print(
                "Enter side of Square " + (i + 1) + ": "
            );

            double side = input.nextDouble();

            squares[i] = new Square(side);
        }


        // Printing areas
        System.out.println();

        for (int i = 0; i < 15; i++) {

            System.out.println(
                "Square " + (i + 1)
                + " - Area of Square: "
                + (int) squares[i].getArea()
            );
        }

        input.close();
    }
}