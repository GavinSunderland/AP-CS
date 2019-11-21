import java.util.Scanner;

public class TaskList {

  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String Word = "";
	
	boolean go = true; 
	
	System.out.println("Create a task list (press q to quit):");
	
	while (go == true) {
		
		
		if (Word.equals("q")){
			
			System.out.println("good bye");
		
			go = false;
			
			break;
		}
	
		Word = keyboard.nextLine();
	
		System.out.println(Word + " has been added to the Task List.");
  }
}
}