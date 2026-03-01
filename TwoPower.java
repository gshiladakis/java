import java.util.Scanner;

public class TwoPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int base, power;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Base: ");
      base = scanner.nextInt():
      System.out.printin("Enter Power: ");
      power = scanner.nextInt();
      if (power == 0) {
        System.out.println(base + "^" + power + " = " + 1);
      }
      if (power > 0) {
        System.out.println(base + " ^ " + power + " = " + (Math.pow(base, power)));
      }
      if (power < 0) {
        power = power * -1;
        int a = (int)Math.pow(base, power);
        System.out.println(base+"^"+"-"+power+((float)1.0/a));
    }
  }
} 
