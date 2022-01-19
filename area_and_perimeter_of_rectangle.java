import java.util.Scanner;
public class area_and_perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth: ");
        

        double breadth = in.nextDouble();
        System.out.println("Perimeter of rectangle is: " + 2*length+2*breadth);
        System.out.println("Area of rectangle is: " + length*breadth);
        in.close();

    }
    
}
