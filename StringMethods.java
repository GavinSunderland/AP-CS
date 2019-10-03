import java.util.Scanner;

public class StringMethods {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    System.out.print("Please enter a word or phrase: ");
    String input = kb.nextLine();

    int length = input.length();
    System.out.println("The length of the string is: " + length);

    char c = input.charAt(1);
    System.out.println("The second character is: " + c);

    String upper = input.toUpperCase();
    System.out.println("The string in upper case is: " + upper);

    boolean contains = input.contains("at");
    System.out.println("The string contains \"at\": " + contains);

    String sub1 = input.substring(2);
    System.out.println("The substring starting at index 2 is: " + sub1);

    String sub2 = input.substring(1,3);
    System.out.println("The substring between index 1 and 3 is: " + sub2);

    int index = input.indexOf("at");
    System.out.println("\"at\" occurs at index: " + index);

    boolean isEqual = input.equals("cat");
    System.out.println("Is your string equal to \"cat\"? " + isEqual);

    int distance = input.compareTo("cat");
    System.out.println("Your string and \"cat\" are apart by: " + distance);

  }

}
