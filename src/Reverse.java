/**
 *
 * @author Dan
 */
public class Reverse {

    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        
        // Print in reverse
        System.out.print("#1: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Print in reverse - another way
        System.out.print("#2: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[numbers.length - 1 - i] + " ");
        }
        System.out.println();
        
        // Store the numbers in reverse order in another array
        int[] reverse = new int[numbers.length];
        
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        
        // Now we could do the following, or see below
//        numbers = reverse;
        
        // Print out reverse array
        System.out.print("#3: ");
        for (int n : reverse) {
            System.out.print(n + " ");
        }
        System.out.println();
        
        // Reverse numbers array itself
        int temp;
        int i = 0;
        int j = numbers.length - 1;
        while (j > i) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        
        System.out.print("#4: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        
    }
    
}
