import java.util.Scanner;
public class Budget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Reeading from System.in
        System.out.println("Enter available budget: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
    // once finished 
        System.out.println("Available budget: " + n);
    }
    
}
