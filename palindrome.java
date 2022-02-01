//Java program to check palindrome 
/**
 * palindrome
 */
/**
 * palindrome
 */
import java.util.Scanner;
/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int remainder, sum= 0;
        int temp = number;
        
        while (number != 0) {
            remainder = number % 10;
            sum = sum * 10 +remainder;
            number = number/10;
        }
        if (sum == temp) {
            System.out.println("Yes!, the entered number is palindrome.");
            
        }
        else{
            System.out.println("Entered number is not palindrome.");
        }
        in.close();
    }
}