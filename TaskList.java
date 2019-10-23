import java.util.Scanner;

public class TaskList {

  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	boolean go = true; 
	
	System.out.println("Create a task (press q to quit)):");
	String Input = keyboard.nextLine();
	
	while (go == true) {
		System.out.print(Input + " has been added to the task list");
		System.out.println("Create a task (press q to quit)):");
		String Input = keyboard.nextLine();

		System.out.print(Input + " has been added to the task list");
	
		if (Input.equals("q")){
		System.out.println("Goodbye");
		}
	}
	
	 
	
	
	
	}
	
	
  
  }
}