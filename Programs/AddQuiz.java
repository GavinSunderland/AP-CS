import java.util.Scanner;

public class AddQuiz {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    System.out.println("print a welcome message here");

    int input = 0;                // this variable stores the user's input
    int numCorrect = 0;       // variable to keep track of the number of correct answers

    while ( input != -1) {

      int rand1 = (int)(Math.random()*20) +1;   
      int rand2 = (int)(Math.random()*20) +1;
	 

      input = Integer.parseInt( kb.nextLine() );

      if (input == rand1 + rand2) {
        System.out.print("you got the answer correct");
        numCorrect++;     // add +1 to the number correct
      }

	  else {
		System.out.print("incorrect.");
	  }
    }

    System.out.println("you got " + numCorrect + "correct");
  }

}
