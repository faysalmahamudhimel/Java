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
public class Rightpattern2 {
  


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }

            System.out.println();
        }
    }
}
