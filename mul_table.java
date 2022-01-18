/* Java program that takes a number as input and prints its multiplication table upto 10

 */
import java.util.Scanner;
public class mul_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = input.nextInt();
        for(int i = 0; i < 10; i++){
            System.out.println(num1 + "*" + (i+1) + "=" +(num1 * (i+1)));
        }
        input.close();

    }

}
