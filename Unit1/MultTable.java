public class MultTable {

  public static void main (String[] args) {

    System.out.println("#1 : What is printed?"); // #1 : What is printed?
    for (int row = 1; row <= 4; row++) {
      System.out.println(row);
    }

    System.out.println("#2 : What is printed?");  // #2 : What is printed?
    for (int col = 1; col <= 3; col++) {
      System.out.print(col + " ");
    }
    System.out.println();

    System.out.println("#3 : What is printed?"); // #3 : What is printed?
    for (int row = 1; row <= 4; row++) {
      for (int col = 1; col <= 3; col++) {
        System.out.print(row + "," + col + " ");
      }
      System.out.println();
    }


    // #4 : Write code to create a 10x10 multiplication table like
    for (int row = 1; row <= 10; row++){
		for (int col = 1; col <= 10; col++){
		System.out.print(row*col + " ");
		
		
		
		
		
	
		}
	System.out.println();
	}
    
    System.out.println("#4 : Write code to create a 10x10 multiplication table");

  }

}
