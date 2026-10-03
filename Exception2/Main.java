/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception2;

import java.util.*;

class DuplicateException extends Exception {
    public DuplicateException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {


    public static void checkDuplicates(int[] numbers)
            throws DuplicateException {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    throw new DuplicateException(
                            "Duplicate number found: " + numbers[i]);
                }
            }
        }

        System.out.println("No duplicate numbers found.");
    }


    public static void checkAge(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "Invalid age! Age must be 18 or above.");
        }

        System.out.println("Eligible for driving license.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter number of integers: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        try {
            checkDuplicates(numbers);
        }
        catch (DuplicateException e) {
            System.out.println(e.getMessage());
        }


        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            checkAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}