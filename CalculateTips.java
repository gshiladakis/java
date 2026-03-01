import java.util.Scanner;

public class CalculateTips {

  /**
   *
   */ 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double subtotal, gratuityRate, gratuityAmount, total;
    // Prompt user to enter the subtotal and read the value as double
    System.out.print("Enter the gratuity rate: ");
    gratuityRate = scanner.nextDouble();
    // Calculate the gratuity amount
    gratuityAmount = subtotal * gratuityRate / 100;
    // Calculate the total which is the sub of subtotal and gratuity amount
    total = subtotal + gratuityAmount;
    // Print the gratuity and total with 2 decimal places
    System.out.printf("The gratuity is %.2f and the total is %.2f\n", gratuityAmount, total);
  }
} 
