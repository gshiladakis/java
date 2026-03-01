import java.util.Scanner;

public class CookiesMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double flour = 2.75;
        double bakingSoda = 1;
        double bakingPowder = .5;
        double butter = 1;
        double sugar = 1.5;
        double egg = 1;
        double vanillaExtract = 1;
        double makes = 48;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int cookies = in.nextInt();

        if (cookies < 1 || cookies > 500) {
            System.out.println("Invalid input");
        } else {
            flour *= (cookies / makes);
            bakingSoda *= (cookies / makes);
            bakingPowder *= (cookies / makes);
            butter *= (cookies / makes);
            sugar *= (cookies / makes);
            egg *= (cookies / makes);
            vanillaExtract *= (cookies / makes);

            System.out.println("Flour = " + flour);
            System.out.println("Baking Soda = " + bakingSoda);
            System.out.println("Baking Powder = " + bakingPowder);
            System.out.println("Butter  = " + butter);
            System.out.println("Sugar = " + sugar);
            System.out.println("Egg = " + egg);
            System.out.println("Vanilla Extract = " + vanillaExtract);
    }
    
}

}
