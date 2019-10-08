import java.util.Scanner;

public class GuessNumber {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

   
    int Number= (int)(Math.random()*10);


    int Attempt = 0;

    while (Attempt != Number){

      System.out.println("I am thinking of a number, what number am I thinking of?");
      Attempt = Integer.parseInt(kb.nextLine());
      
	  if (Attempt > Number) {
        System.out.println("Too large! Try again.");
	  }
	 
	  else if (Attempt < Number) {
        System.out.println("Too small! Try again.");
	  }
	  
	  else if (Attempt == Number){
		System.out.println("You guessed correctly!");
	  }
	  
      
    }


  }

}

