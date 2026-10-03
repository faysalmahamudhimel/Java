/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calander2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Leap year
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }

        for (int i = 0; i < 12; i++) {

            System.out.println("\n      " + months[i] + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            int month = i + 1;
            int y = year;

            if (month < 3) {
                month += 12;
                y--;
            }

            int k = y % 100;
            int j = y / 100;

            int h = (1 + (13 * (month + 1)) / 5
                    + k + k / 4 + j / 4 + 5 * j) % 7;

            for (int space = 0; space < h; space++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= days[i]; day++) {
                System.out.printf("%3d ", day);

                if ((h + day) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        }

        input.close();
    }
}