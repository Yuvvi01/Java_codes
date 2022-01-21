//Take three numbers from the user and print the greatest number.
import java.util.Scanner;
/**
 * gratest_amon_three
 */
public class gratest_amon_three {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = in.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = in.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("" + num1 + "is greatest.");
            
        }
        if (num2 > num3 && num2 > num1) {
            System.out.println("" + num2 + "is greatest.");
            
        }
        if (num3 > num2 && num3 > num1) {
            System.out.println("" + num3 + " is greatest among three.");
            
        }
        in.close();

    }
}
