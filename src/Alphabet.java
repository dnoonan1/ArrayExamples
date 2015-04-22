/**
 *
 * @author Dan
 */
public class Alphabet {

    public static void main(String[] args) {
        
        // Array to hold the alphabet
        char[] alphabet = new char[26];
        
        // Initialize every element of the array
        for (int i = 0; i < 26; i++) { // better to use alphabet.length
            alphabet[i] = (char)('a' + i);
        }
        
        //Print out the array (while-loop)
        int j = 0;
        while (j < alphabet.length) {
            System.out.print(alphabet[j]);
            j++;
        }
        
        //Print out the array (standard for-loop)
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]);
        }
        System.out.println();
        
        //Print out the array (enhanced for-loop)
        for (char letter : alphabet) {
            System.out.print(letter);
        }
        System.out.println();
        
    }
    
}
