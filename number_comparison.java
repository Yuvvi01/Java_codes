/**
 * number_comparison
 */

//Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.
import java.util.Scanner;
public class number_comparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int number1 = in.nextInt();
        System.out.print("Input the second number: ");
        int number2 = in.nextInt();
        System.out.print("Input the third number: ");
        int number3 = in.nextInt();
        System.out.print("Input the fourth number: ");
        int number4 = in.nextInt();
        if (number1 == number2 && number2 == number3 && number3 == number4){
            System.out.println("All numbers are equal");
            
        }
        else {
            System.out.println("All numbers are not equal.");

        }
        in.close();

    }

    
}