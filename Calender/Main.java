/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calender;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        String[] months = {
            "", "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
        };

        int[] days = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Leap year check
        if (month == 2 &&
            (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            days[2] = 29;
        }

        // Calculate the day of the week for the 1st day
        int day = 1;
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (day + (13 * (m + 1)) / 5 + k
                + k / 4 + j / 4 + 5 * j) % 7;

        // Zeller: 0=Saturday, 1=Sunday, ..., 6=Friday
        int firstDay = h;

        System.out.println("\n       " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print calendar
        for (int d = 1; d <= days[month]; d++) {

            System.out.printf("%3d ", d);

            if ((firstDay + d) % 7 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}