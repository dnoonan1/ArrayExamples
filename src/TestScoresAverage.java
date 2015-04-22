import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class TestScoresAverage {

    public static void main(String[] args) { 
        
        Scanner in = new Scanner(System.in);
        
        final int MAX_TEST_SCORES = 5;        
        int numberOfTests = 0;
        int testScore;
        int[] testScores = new int[MAX_TEST_SCORES];
        int total = 0;
        double average;
        
        // This way leads to problems...
//        do {
//            System.out.print("Enter the next test score, or -1 to finish: ");
//            // Get the next test score
//            testScore = in.nextInt();
//            // Add it to the total
//            total += testScore;
//            // One more test
//            numberOfTests++;
//        } while (testScore != -1); // sentinel value is -1
        
        while (numberOfTests < testScores.length) {
            // Ask the user for input
            System.out.print("Enter the next test score, or -1 to finish: ");
            // Get the next test score
            testScore = in.nextInt();
            if (testScore == -1) {
                break;
            }
            // Store the test score in the array
            testScores[numberOfTests] = testScore;
            // Add the score to the total
            total += testScore;
            // One more test
            numberOfTests++; 
        }
        
        // Calculate average
        if (numberOfTests != 0) {
            average = (double)total / numberOfTests;    
        } else {
            average = 0.0;
        }
        
        // Print out info
        System.out.print  ("Test scores:        ");
        for (int i = 0; i < numberOfTests; i++) {
            System.out.print(testScores[i] + " ");
        }
        System.out.println();
        System.out.println("Number of tests:    " + numberOfTests);
        System.out.println("Average test score: " + average);

    }
    
}
