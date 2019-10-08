import java.util.Scanner;

public class StringMethods2 {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    System.out.print("Please enter a word or phrase: ");
    String input = kb.nextLine();

    input = input.trim();   // trims any whitespace before or after

    // Example 1: Get the last character
    int length = input.length();
    char c = input.charAt(length - 1);    // why is it necessary to subtract 1?
    System.out.println("The last character is: " + c);

    // #1 Get the first character
    // Write the code to get the first character from the input and print it out
	

    // Example 2: Splitting a word in thirds
    String firstThird = input.substring(0, length/3);
    String secondThird = input.substring(length/3, length*2/3).toUpperCase();
    String thirdThird = input.substring(length*2/3);
    System.out.println("The word is:"+firstThird+secondThird+thirdThird);


    // #2 Complete the following code so the characters after the 'a' are CAPS
    int aPos = input.indexOf("a");
    String beforeA = substring(aPOS);  // change after the = sign
    String afterA = aPOS.toUpperCase;   // change after the = sign
    System.out.println("Before and after \'a\'" + beforeA + afterA);

  }


}
