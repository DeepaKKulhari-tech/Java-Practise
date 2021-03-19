
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern.numberPattern(5);
		
		
	}
	
	public static void numberPattern(int rows) {
		  for (int row = 0; row < rows; row++) {
		     for (int col = 0; col < rows + 1; col++) {
		        int number = 0;
		        if (row % 2 == 0) {
		           number = col < rows ? row + 1 : row + 2;
		        } else {
		           number = col == 0 ? row + 2 : row + 1;
		        }
		        System.out.print(number);
		     }
		     System.out.println();
		  }
		}

}
