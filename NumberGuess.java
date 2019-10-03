import java.util.Scanner;

public class NumberGuess {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		// #1 pick a random number
		int randNum = ?

		while (true) {

			// #2 ask for a guess
			System.out.println("What's your guess?");
			int guess = Integer.parseInt( keyboard.nextLine() );

			// #3 give the user feedback - too high, low, or correct
			if ( ? ) {
				System.out.println("too low");
			}

    }
  }
}
