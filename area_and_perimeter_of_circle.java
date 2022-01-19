//Java program to print the area and perimeter of a circle.
//Method 1
/*public class area_and_perimeter_of_circle {
public static void main(String[] args) {
    float Radius = 7.5f;
    float pi = 3.14f;
    float perimeter = 2*pi*Radius;
    float area = pi*Radius*Radius;
    System.out.println("Perimeter of the circle is: " + perimeter);
    
    System.out.println("Area of the circle is: " + area);


}
}
*/
//Method 2
/**
 * area_and_perimeter_of_circle
 */
import java.util.Scanner;
/**
 * area_and_perimeter_of_circle
 */
public class area_and_perimeter_of_circle {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
  System.out.println("Input the radius of the circle: ");
  double radius = io.nextDouble();
  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
  System.out.println("Area is = " + (Math.PI * radius * radius));
io.close();
    }
}

