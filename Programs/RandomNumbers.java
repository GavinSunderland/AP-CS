import java.util.Scanner;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in);
		String name = Keyboard.nextLine();
	
		int Number = (int)(Math.random() *100);
		System.out.println(Number);
	
		int Number1 = (int)(Math.random()*7) +2;
		System.out.println(Number1);
		
		int Number2 = (int)(Math.random()*2) +11;
		System.out.println(Number2);
	
		
		int X = 11;
		
		int Z = 0;
		
		while (X>=1) {
			
			System.out.println(X);
			X = X -1;
			
			
			if (X == 1) {
				System.out.println("gamer");
			}
		}
		
		for (int Y=11;Y>0;Y--) {
			System.out.print(Y);
			
			if (Y == 1) {
				System.out.println("gamer");
			}
		}
		
		while (Z<100) {
			System.out.println(Z);
			Z = Z + 2;
			
		}
		
		String Attempt = Keyboard.nextLine();
		
		System.out.print("what is the secret word?");
		String S_Word = "gamer";
		
		int Tries = 0;
		
		while (Attempt != S_Word) {
			Tries ++;
			
			System.out.println("AHHHHHHHHHHHH! RONG!!!!");
			System.out.println("this is your " + Tries + "th try" );
			System.out.println("try again.");
			
			Attempt = Keyboard.nextLine();
		
			System.out.print("this is your " + Tries + "th try");
		
			if (Attempt = S_Word){
				System.out.print("welcome, gamer");
			}
		}
		
		
	}
}