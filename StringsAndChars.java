import java.util.Scanner; 

public class StringsAndChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //ask  user to input first, middle, and last names
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        //extra first initials from each name
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        
        //display contents of variables
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("First initial: " + firstInitial);
        System.out.println("Middle initial: " + middleInitial);
        System.out.println("Last initial: " + lastInitial);
    }
    
}
