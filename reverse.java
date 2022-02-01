// Java program to reverse an input variable
/**
 * reverse
 */
import java.util.Scanner;
public class reverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int remainder, reverse = 0;
        
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 +remainder;
            number = number/10;
        

         
        }
        System.out.println("Reversed number is: " + reverse);
        in.close();


        
    }
}