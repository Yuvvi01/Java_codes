//Java program to check Armstrong number
/**
 * Armstrong
 */
import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/**                                  FIRST PART
 * To check the armstrong number first we need to find the length of the user entered value. 
 * So, to do that first we will take user input then while loop will execute and the entered 
 * number will be devided by 10 leaving some remainder and then second statement inside while 
 * loop will execute here the length becomes 1 as at first we have initialized the length as 0 
 * and after looping it will increase accordingly.   */  
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int length =0;
        while (number != 0) {
            number = number/10;
            length = length +1;
            

/**                                  SECOND PART 
 * Here, we will initialize a temp variable equal to user entered value and another value needs 
 * to be initialized that is remainder. After initializing we will execute a while loop which will 
 * execute until the condition becomes false that is it will loop until when temp becomes 0. Inside
 * the while loop to get the remainder we have devided the temp variable by 10. Next we will we will
 * initialize armstrong = 0 and mul = 1 moving forward we will use for loop whose conditions are, i ini-
 * tialized with 1 and i will execxute till it becomes lees that or equal to length of the user entered 
 * value and then it will be incremented and inside for loop mul variable will execute which is intialized 
 * with value 1 now functions as..when the user entered value is devide by 10 it will produce some remainder
 * then that remainder will get multiplied by mul..EX: first loop (REMAINEDR = 3 and mul = 1 then 3*1 = 3 next
 * mul = 3 and remaider will remain same then mul = 3*3 = 9 then again mul = 9 and remainder remains to be 3 
 * then mul = 9*3 = 27) now the second variable armstrong executes and finally we will devide temp by 10. 
 * So, this way we will check if the number is an armstrong number .
*/
        }
        int temp = number;
        int remainder;
        int armstrong = 0;
        while (temp != 0){
            int mul = 1;
            remainder = temp % 2;
            int i;
            for (i = 1; i<=length ; i++)
            {
                mul = mul * remainder;
               

            }
            armstrong = armstrong + mul;
            temp = temp/10;
            
        }
        if (armstrong == number) {
            System.out.println("number is an Armstrong number: " + number);
            
        }
        else {
            System.out.println("number is not an Armstrong number: " + number);
        }
        in.close();
        
    }
}