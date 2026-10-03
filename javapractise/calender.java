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
public class calender {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Calendar object 
        Calendar cal = Calendar.getInstance();

        // set year, month, day = 1
        cal.set(year, month - 1, 1);

     
        String monthName = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.US);

        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

     
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

      
        int totalDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

    
        for (int i = 1; i < firstDay; i++) {
            System.out.print("    ");
        }

        // print 
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            // new line for week
            if ((day + firstDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
   
