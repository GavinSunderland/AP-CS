import java.util.Scanner;

public class Password {
	
	public static void main(String[] args) {
		
		String Password = "1234";
		 
		System.out.println("Welcome user, please tell me your name.");
		
		Scanner Keyboard = new Scanner(System.in);
		String name = Keyboard.nextLine();
		
		System.out.println("Hello," + name);
		System.out.print("Please enter the correct password.");
		
		String Attempt = Keyboard.nextLine();
		
		if (Attempt.equals(Password)) {
			System.out.print("Welcome");
			System.out.print("you have entered the correct password");
		}
		
		else {
			System.out.print("you have entered the incorrect password.");
			System.out.print("you are not welcome, please enter the correct password");
			String Attempt = Keyboard.nextLine();
		}
	}
}	