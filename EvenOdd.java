// Java program to check if the entered number is Even or Odd
import java.util.Scanner;
/**
 * EvenOdd
 */

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
            reader.close();
    }
}