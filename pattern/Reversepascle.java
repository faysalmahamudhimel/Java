
package pattern;
  import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Reversepascle {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = input.nextInt();

        // Reverse row
        for (int i = row - 1; i >= 0; i--) {

            // Space print
            for (int j = 0; j < row - i - 1; j++) {
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
   
