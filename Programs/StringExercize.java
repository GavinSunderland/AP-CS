import java.util.Scanner;

public class StringExercize {

  public static void main(String[] args) {

	Scanner kb = new Scanner(System.in);
    System.out.print("Please enter a word ");
	String input = kb.nextLine();

    input = input.trim();   // trims any whitespace before or after
	
	char first = input.charAt(0);
	System.out.println("The first letter of your word is: " + first);
	
  
	// #2 Complete the following code so the characters after the 'a' are CAPS
    int aPos = input.indexOf("a");
    String beforeA = input.substring(0,aPos);  // change after the = sign
    String afterA = input.substring(aPos).toUpperCase();   // change after the = sign
    System.out.println("Before and after \'a\'" + beforeA + afterA);
	
	//given help understanding "substring" by Tim
	
  }
}
