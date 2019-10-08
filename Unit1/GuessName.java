import java.util.Scanner;

import java.util.ArrayList;

public class GuessName {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		print("can you guess this famous name????? 99.999999999996748% of our users cannot!");
		
		String [] Names = {"Tom Cruise", "Bill Gates", "Michael Jackson"};
		String Name_Full = " ";
		
		ArrayList<String> Names_C = new ArrayList<String>();
		
		String Attempt = "";
		
		for (String Name : Names) {
			
			String [] FL = Name.split(" ");
			
			String First = FL[0];
			int Length_F = First.length();
			
			String Last = FL[1];
			int Length_L = Last.length();
			
			String First_C = First.substring(0, Length_F-2);
			String Last_C = Last.substring(0, Length_L-3);
			
			Name_Full = First_C + " " + Last_C;
			
			
			Names_C.add(Name_Full);
			
			/* Luke assisted me with the split function and rounding up some errors*/
			
			
		}
		
		String Names_C_L = Names_C.get(0);

		print("can you guess who this is?: ");
		println(Names_C_L);
		
		Attempt = keyboard.nextLine();
		
		if (Attempt.equals(Names_C_L) {
			print("wow, you got it!");
		}
		
		else{
			print("try again...");
			Attempt = keyboard.nextLine();
		}
		
		
		
		
	
	
	
	
	
	
	
		
	
		
	
	}
	
		
	
	public static void print(String Printed) {
		System.out.print(Printed);
	}
		
	public static void println(String Printed) {
		System.out.println(Printed);
	}
	
}