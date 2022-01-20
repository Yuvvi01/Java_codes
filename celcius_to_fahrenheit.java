/**
 * celcius_to_fareinheit
 */
//Java program to convert celcius into fahrenheit
import java.util.Scanner;
public class celcius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the  in fareinheit: ");
        double fahrenheit = in.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        in.close();

    }

    
}