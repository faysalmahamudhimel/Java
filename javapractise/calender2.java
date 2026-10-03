/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractise;
 import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Asus
 */
public class calender2 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // শুধু year input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        Calendar cal = Calendar.getInstance();

        // 12টা মাস loop করবে
        for (int month = 0; month < 12; month++) {

            // set year, month, day = 1
            cal.set(year, month, 1);

            // month name
            String monthName = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.US);

            System.out.println("\n      " + monthName + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // first day
            int firstDay = cal.get(Calendar.DAY_OF_WEEK);

            // total days in month
            int totalDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

            // spacing
            for (int i = 1; i < firstDay; i++) {
                System.out.print("    ");
            }

            // print days
            for (int day = 1; day <= totalDays; day++) {
                System.out.printf("%3d ", day);

                if ((day + firstDay - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println("\n"); // month gap
        }
    }
}
    

