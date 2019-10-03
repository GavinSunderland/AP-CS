import java.util.Scanner;

public class TextAdventure {

  public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
  
    int playerX = 0;
    int playerY = 0;

    int riddleX = 3;
    int riddleY = 2;

	
	String Decision1 = "";
	
    String input = "";
	
	String NameOriginal = ""; 
	
	
	String NameF = "";
	String NameM = "";
	String NameL = "";
	
	String NameFull = "";

    System.out.println("You are Bob Johnsonsonsonson, son of John, grandson of John, greatgrandson of John, greatgreatgrandson of John.");
	System.out.println("Your car is low on gas and so you have stopped at a local gas station in downtown Portland, Oregon. However, sadly, there is no one there to pump our gas...");
	System.out.println("what will you do? Pump your own gas (yes) and be on your way or will you wait like the good citizen you think you are? (no)");
	Decision1 = Keyboard.nextLine();
	
	
	if (Decision1.equals("yes")) {
		System.out.println("");
		System.out.println("your hand reaches out...never before have you been so bold! As you fill your car with gas, your lungs and heart are filled with the ecstacy of freedom and fuel.");
		System.out.println("but wait...what is this!?");
		System.out.println("a police officer has been watching you and has witnessed your crimes: 'well, well, well, what do we have here? A auto-gas pumper eyy? What is your name, I'm putting you on file?' ");
		NameOriginal = Keyboard.nextLine();
		
		String [] Names = NameOriginal.split(" ");
		
	
		//NameF = Names[0];
		//NameF = NameF.indexOf(0).toUpperCase();
		
		//errors lie here
		
		//NameL = Names[1];
		//NameL = NameL.indexOf(0).toUpperCase();
	
			
		NameFull = NameF + " " + NameL; 
		
		
		System.out.print("Ok, " + NameFull+ " you are under arrest for the crime of pumping your own gas! Come with me");
		
		
		
		
		
		
		
		
		
	}
	
	if (Decision1.equals("no")) {
	}
   
  
  }

}
