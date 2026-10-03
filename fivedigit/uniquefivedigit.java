/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fivedigit;


public class uniquefivedigit {
    
    
   

    public static void main(String[] args) {

        int count = 0;

        // First digit
        for (int a = 1; a <= 5; a++) {

            // Second digit
            for (int b = 1; b <= 5; b++) {

                // Third digit
                for (int c = 1; c <= 5; c++) {

                    // Fourth digit
                    for (int d = 1; d <= 5; d++) {

                        // Fifth digit
                        for (int e = 1; e <= 5; e++) {

                            // Check that all digits are unique
                            if (a != b && a != c && a != d && a != e
                                    && b != c && b != d && b != e
                                    && c != d && c != e
                                    && d != e) {

                                int number = a * 10000 + b * 1000
                                           + c * 100 + d * 10 + e;

                                System.out.println(number);
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Total unique 5-digit numbers = " + count);
    }
}
    
