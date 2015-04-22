/**
 *
 * @author Dan
 */
public class Average {

    public static void main(String[] args) {
        
        int[] numbers = { 1, 2, 6, 8, 4, 10 };
        
        int total = 0;
        double average;
        
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        
        average = total / numbers.length;
        System.out.println("Total   = " + total);
        System.out.println("Average = " + average + "\n");
        
        total = 0;
        for (int number : numbers) {
            total += number;
        }
        
        average = total / numbers.length;
        System.out.println("Total   = " + total);
        System.out.println("Average = " + average);
        
    }
    
}
