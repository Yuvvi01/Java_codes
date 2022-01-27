/**
 * Java program to compute Average of three number
 */
/**
 * function2
 */
import java.util.Scanner;
public class function3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = in.nextDouble();
        System.out.print("Enter the second number: ");
        double b = in.nextDouble();
        System.out.print("Enter the third number: ");
        double c = in.nextDouble();
        double Average = (a+b+c)/3;
        System.out.print("The Average of three is " + Average );
        in.close();
        
    }
    public static double Average(double a, double b, double c){
        return a+b+c;
    }

    
    }
