import java.util.Scanner;

public class TextAdventure {

  public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	
	String Decision = "";
	
    String input = "";
	
	String NameOriginal = ""; 
	
	
	String NameF = "";
	String NameFF = "";
	String NameL = "";
	String NameLF = "";
	
	String NameFull = "";
	
	boolean HeartAttack = false;
	int heartAttackC = 0;
	int heartAttackN = 1;
	
	boolean Game = true; 
	
	String CarJump = "";

    System.out.println("You are Bob Johnsonsonsonson, son of John, grandson of John, greatgrandson of John, greatgreatgrandson of John.");
	System.out.println("Your car is low on gas and so you have stopped at a local gas station in downtown Portland, Oregon. However, sadly, there is no one there to pump our gas...");
	System.out.println("what will you do? Pump your own gas (yes) and be on your way or will you wait like the good citizen you think you are? (no)");
	Decision = Keyboard.nextLine();
	
	
	if (Decision1.equals("yes")) {
		System.out.println("");
		System.out.println("your hand reaches out...never before have you been so bold! As you fill your car with gas, your lungs and heart are filled with the ecstacy of freedom and fuel.");
		System.out.println("but wait...what is this!?");
		System.out.println("a police officer has been watching you and has witnessed your crimes: 'well, well, well, what do we have here? A auto-gas pumper eyy? What is your name, I'm putting you on file?' ");
		NameOriginal = Keyboard.nextLine();
		
		String [] Names = NameOriginal.split(" ");
		
		NameFF = NameF.substring(0,1).toUpperCase();
		NameF = Names[0].substring(1);
		
		NameLF = NameL.substring(0,1).toUpperCase();
		NameL = Names[1].substring(1);
		
	
			
		NameFull = NameFF + NameF + " " + NameLF + NameL; 
		
		
		System.out.println("Ok, " + NameFull+ " you are under arrest for the crime of pumping your own gas! Come with me");
		HeartAttack = true; 
		
		System.out.println("On the car drive in the police cruise on the way to the police station, you notice that the car window open.");
		System.out.println("You also notice that you have not eaten in two weeks due to a brutal breakup between your former wife and yourself.");
		System.out.println("Will you jump out the window of the moving car on the highway barreling down the road at 90mph??? (yes or no)");
		CarJump = Keyboard.nextLine();
		
		if (CarJump.equals("yes")) {
			System.out.println("You throw yourself out of the car window like a discarded MacDonalds burger wrapper, hitting the ground traveling 90mph");
			System.out.println("");
			System.out.println("Your body becomes a horrific meat crayon and you suffer horrific bodily damage");
			System.out.println("Congratulations, you die...");
			Game = false; 
		}
		
		
		if (CarJump.equals("no")) {
		
		
		}
	
	}
	
	if (Decision1.equals("no")) {
		Game = false; 
	}
   
   
   while (HeartAttack == true) {
		heartAttackN = (int)(Math.random() *10);	
		
		if (heartAttackN == heartAttackC) {
			System.out.println("");
			System.out.println("You have suffered a surprise heart attack!");
			Game = false;
		} 
		
		else {
			HeartAttack = false;
			break;
		}
	}
   
   if (Game == false) {
		System.out.println("Game Over!");
	
	}
   
  
  }

}
