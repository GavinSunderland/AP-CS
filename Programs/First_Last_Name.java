import java.util.Scanner;

public class Lesson2_Exercize {

  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Please give me your first name: ");
	String FirstName = keyboard.nextLine();
  
	System.out.print("please give me your last name: ");
	String LastName = keyboard.nextLine();
	
	System.out.print("Hello, " + LastName + " " + First Name);
  }
}