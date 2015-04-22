/**
 *
 * @author Dan
 */
public class MinMax {

    public static void main(String[] args) {
        
        int[] numbers = { 1, 2, 10, 9, -3, 4, -1 };
        
        int min, max;
        
        // Find the min
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        // Find the max
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Or we can find both at the same time!
//        min = numbers[0];
//        max = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            // Min
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//            // Max
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
        
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        
    }
    
}
