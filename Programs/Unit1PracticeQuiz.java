import java.util.Scanner;

public class Unit1PracticeQuiz {

  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	String Word = "";
	
	boolean go = true; 
	
	System.out.println("I am a parrot (press q to quit)");
	
	while (go == true) {
		
		
		if (Word.equals("q")){
			
			System.out.println("The parrot says: \"good bye\"");
		
			go = false;
			
			break;
		}
	
		Word = keyboard.nextLine();
	
		System.out.println("The parrot says:\" " + Word + "\"");
	
		
	
	}
  }
}
	