package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] arr = new int[n];

    
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
                   
       
        System.out.print("Original Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    
        System.out.print("\nAscending Order: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

   
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

      
        System.out.print("\nDescending Order: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}