import java.util.Scanner;

public class NumericDataTypesWithInputJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte byteNumber = 127;
       short shortNumber = 127;
       int intNumber = 127;
       long longNumber = 127;
       float floatNumber = 127;
       double doubleNumber = 127;
       String output = "\n\tbyteNumber = " + byteNumber + "\n\tshortNumber = " + shortNumber + "\n\tintNumber = " + intNumber + "\n\tlongNumber = " + longNumber + "\n\tfloatNumber = " + floatNumber + "\n\tdoubleNumber = " + doubleNumber;
       System.out.println("For problem 2(A): " + output);
       
       Scanner keyboardInput = new Scanner(System.in);
       System.out.println("Enter the same integer number 127 six time: ");
       byteNumber = keyboardInput.nextByte();
       
       shortNumber = keyboardInput.nextShort();
       intNumber = keyboardInput.nextInt();
       longNumber = keyboardInput.nextLong();
       floatNumber = keyboardInput.nextFloat();
       doubleNumber = keyboardInput.nextDouble();
       output = "\n\tbyteNumber = " + byteNumber + "\n\tshortNumber = " + shortNumber + "\n\tintNumber = " + intNumber + "\n\tlongNumber = " + longNumber + "\n\tfloatNumber = " + floatNumber + "\n\tdoubleNumber = " + doubleNumber;
       System.out.println("For problem 2(A):" + output);
    }
    
}
