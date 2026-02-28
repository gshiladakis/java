import java.util.Scanner;

public class TestAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double score1,score2, score3,score3,average,total;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter test score 1: 80");
      score1 = sc.nextDouble();

  System.out.println("Enter test score 2: 91");
      score2 = sc.nextDouble();

      System.out.println("Enter test score 3: 75");
      score3 = sc.nextDouble();

      total = score1 + score2 + score3;

      average = total / 3;

      System.out.println("The average of the three test scores is " + average);

    }

} 
