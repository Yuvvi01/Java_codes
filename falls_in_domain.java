//Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
import java.util.Scanner;
/**
 * falls_in_domain
 */
public class falls_in_domain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = in.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = in.nextDouble();
        System.out.println(num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1);
        in.close();

    }
}
