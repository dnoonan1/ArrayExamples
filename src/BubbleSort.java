/**
 *
 * @author Dan
 */
public class BubbleSort {

    public static void main(String[] args) {
        
        int[] numbers = { 2, 10, 1, 9, -3, 4, -1, 7, -20, 12, 11, 3, 4 };
        int temp; // for swapping
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                // Use > for bubble sort, < for reverse bubble sort
                if (numbers[j] > numbers[j+1]) {
                    // swap values
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        
    }
    
}
