import java.util.Scanner;

public class TextAdventure {

  public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	
	String Decision1 = "";
	String Decision2 = "";
	
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
	
	int felonies = 0; 
	
	boolean Game = true; 
	
	String CarJump = "";

    System.out.println("You are Bob Johnsonsonsonson, son of John, grandson of John, greatgrandson of John, greatgreatgrandson of John.");
	System.out.println("Your car is low on gas and so you have stopped at a local gas station in downtown Portland, Oregon. However, sadly, there is no one there to pump our gas...");
	System.out.println("what will you do? Pump your own gas (yes) and be on your way or will you wait like the good citizen you think you are? (no)");
	Decision1 = Keyboard.nextLine();
	
	
	if (Decision1.equals("yes")) {
		felonies ++;
		System.out.println("your hand reaches out...never before have you been so bold! As you fill your car with gas, your lungs and heart are filled with the ecstacy of freedom and fuel.\n");
		System.out.println("you have commited " + felonies + " felonies\n");
		System.out.println("but wait...what is this!?");
		System.out.println("a police officer has been watching you and has witnessed your crimes: \"well, well, well, what do we have here? A auto-gas pumper eyy? What is your name, I'm putting you on file\" ");
		NameOriginal = Keyboard.nextLine();
		
		String [] Names = NameOriginal.split(" ");
		
		NameF = Names[0];
		NameFF = NameF.substring(0,1).toUpperCase();
		NameF = Names[0].substring(1);
		
		NameL = Names[1];
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
			System.out.println("you continue in the car ride to the polic station, avoiding a foolish fate...");
			
			System.out.println("When you arrive at the police station, you notice the following:");
			System.out.println("The police officer acompanying you forgot to handcuf you.");
			System.out.println("There is a nearby car with its door open and keys laying on the seat. How convenient!");
			
			System.out.print("do you assualt the police officer and run away on foot, hopefully not be to noticed by anyone (a), or do you dash to the car and escape with style (b)?");
			Decision2 = Keyboard.nextLine();
			
			if (Decision2.equals("a")){
				felonies ++;
				System.out.println("you have commited " + felonies + " felonies\n");
				System.out.println("You attack the police officer. However, he is not fazed and handcufs you on the spot.")
				
			}
			
			if (Decision2.equals("b")){
				felonies ++;
				System.out.println("you have commited " + felonies + " felonies\n");
				
				
				
			}
		
		
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
