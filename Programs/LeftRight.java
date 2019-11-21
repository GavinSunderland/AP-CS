import java.util.Scanner;

public class LeftRight {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    // 0 is the left hand
    // 1 is the right hand
    int hand = (int)(Math.random()*2);

    // set the guess variable so it's not left or right
    int guess = -1;

    while (guess != hand) {

      System.out.println("Which hand am I hiding it in? (left or right) ");
      String input = kb.nextLine();
      if (input.equals("left"))
        guess = 0;
      else if (input.equals("right"))
        guess = 1;
      else
        System.out.println("Please type left or right");
    }

    System.out.println("You guessed correctly!");

  }


}
