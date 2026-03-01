import java.util.Scanner;

public class InterestIncome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit, rate;
        int years;
        System.out.println("Enter deposit: ");
        deposit = sc.nextDouble();
        System.out.println("Enter number of years: ");
        years = sc.nextInt();
        if (years >= 5)
            rate = 0.045;
        else if (years >= 4)
            rate = 0.04;
        else if (years >= 3)
            rate = 0.035;
        else if (years >= 2)
            rate = 0.025;
        else if (years >= 1)
            rate = 0.02;
        else
            rate = 0.015;
        double intrest = deposit * rate * years;
        System.out.println("Old deposit: " + deposit);
        System.out.println("Interest: " + intrest);
        System.out.println("New deposit: " + (deposit + intrest));
        
    }
    
}
