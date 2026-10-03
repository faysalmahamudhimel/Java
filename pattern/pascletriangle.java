/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author Asus
 */
public class pascletriangle {
   
    public static void main(String[] args) {

        int n = 5;

        // Outer loop = Row control
        for (int i = 0; i < n; i++) {

            // Space print
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int num = 1;

            // Number print
            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");

                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
   
