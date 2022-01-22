//Java program to calculate the quaotient and remainder 
/**
 * quotient 
 *        and
 *           remainder 
 *    
 */
import java.util.Scanner;

public class quotient_and_remainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Divident: ");
        double Dividend = in.nextDouble();
         
        System.out.println("Enter Divisor: ");
        double Divisor = in.nextDouble();
        double quotient = Dividend / Divisor;
        double remainder = Dividend % Divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        in.close();

    }

    
}
