import java.util.Scanner;
/**
 * binary_multiplication
 */
//Java program to add two binary numbers.
public class binary_multiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        String x = in.next();
        System.out.print("Input the second binary number: ");
        String y = in.next();

        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1 * n2;

        System.out.println("--------------------------------");
        System.out.println("Your first binary number is: " + Integer.toBinaryString(n1));
        System.out.println("Your second binary number is: " + Integer.toBinaryString(n2));
        System.out.println("--------------------------------");
        System.out.println("The product of two binary number are: " + Integer.toBinaryString(n3));
        in.close();


    }
}
