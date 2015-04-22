/**
 *
 * @author Dan
 */
public class TwoDimensional {
    
    public static void main(String[] args) {
        
        int[][] table = new int[5][5];
        
        // Initialize the array first
        int count = 1;
        for(int i = 0; i < 5; i++) {  // use < 5 instead of <= 4                       
            for(int j = 0; j < 5; j++){ // use < 5 instead of <= 4                                               
                table[i][j] = count;
                count++;
            }            
        }
        
        // Now print out the table
        //   i = row
        //   j = column
        for (int i = 0; i < 5; i++) { // For every row...
            // ...print out every column.
            for (int j = 0; j < 5; j++) { // For every column...
                // ...print out the value from the table.
                System.out.printf("%2d ", table[i][j]); // better
            }
            // At the end of each row, go to the next line.
            System.out.println(); 
        }
        
    }
    
}
