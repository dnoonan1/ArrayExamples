/**
 *
 * @author Dan
 */
public class OneHundred {

    public static void main(String[] args) {
        
        // Array to hold numbers 1 to 100
        int[] numbers = new int[100];
        
        /*
        index:   0 1 2 ... 97 98 99
                 | | |      |  |  |
        number:  1 2 3 ... 98 99 100
        
        Pattern: number is always one greater than index (index + 1).
        */
        
        for (int i = 0; i < 100; i++) { // better to use numbers.length
            numbers[i] = i + 1;
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
    
}
