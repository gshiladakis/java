package modulus;

/**
 *
 *
 * @author gshil
 */
import java.util.Scanner;

public class Modulus {

/**
* @param arg the command line arguments
*/
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

System.out.println("Enter the forst integer: ");
int num1 = input.nextInt();

System.out.println("Enter the second integer: ");
int num2 = input.nextInt();

  int product = num1 * num2;

  System.out.println("The product of the two numbers is: " + product);
}
} 
