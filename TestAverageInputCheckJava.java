import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestAverageInputCheckJava {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // Set the name of the input file to read scores from
        String fileName = "scores.txt";

        // Initialize variables to keep track of pass and fail counts, total score,
        // highest and lowest scores, and the count of scores
        int passCount = 0;
        int failCount = 0;
        int totalScore = 0;
        int highestScore = 0;
        int lowestScore = 100;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Read each line from the input file
            String line;
            while ((line = br.readLine()) != null) {
                // Convert the line to an integer score
                int score = Integer.parseInt(line);

                // Print the score
                System.out.println(score);

                // Check whether the score is a pass or fail, and update the pass and fail counts
                if (score >= 60) {
                    System.out.println("PASS");
                    passCount++;
                } else {
                    System.out.println("FAIL");
                    failCount++;
                }

                // Update the total score, count of scores, highest score, and lowest score
                totalScore += score;
                count++;

                if (score > highestScore) {
                    highestScore = score;
                }

                if (score < lowestScore) {
                    lowestScore = score;
                }
            }
        } catch (IOException e) {
            // Handle any input/output errors
            System.err.format("IOException: %s%n", e);
        }

        // Calculate the average score and print the pass and fail counts, average score,
        // highest score, and lowest score
        double average = (double) totalScore / count;
        System.out.println("Pass count: " + passCount);
        System.out.println("Fail count: " + failCount);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
    }
}
