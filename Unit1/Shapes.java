import java.util.Scanner;

public class  Shapes {

  public static void main (String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	
	String Answer = "";
	String Input = "";
	int size = 0;
	
	
	System.out.print("Hello would you like to draw a square (a), a rectangle (b), a right triangle (c) or an isosceles triangle (d)");
	Answer = Keyboard.nextLine();
	
	if (Answer.equals("a")){
		System.out.print("how large do you want your square?");
		Input = Keyboard.nextLine();
		size = Integer.parseInt(Input);
	
		for (int i = 0; i < size; i ++){
		System.out.println();
	
			for (int ii = 0; ii < size; ii ++){
			System.out.print("*");
			}
		}
	}
	
	if (Answer.equals("b")){
		System.out.print("how large do you want your rectangle");
		Input = Keyboard.nextLine();
		size = Integer.parseInt(Input);
	
	
		for (int i = 0; i < size; i ++){
		System.out.println();
	
			for (int ii = 0; ii < (size)*2; ii ++){
			System.out.print("*");
			}
		}
	}
	
	
	if (Answer.equals("c")){
	System.out.print("how large do you want your triangle?");
	Input = Keyboard.nextLine();
	size = Integer.parseInt(Input);
	
	for (int i = 0; i <= size; i++) {

		for (int ii = 0; ii < i; ii++) {
			System.out.print("* ");

		}	

	System.out.println();

	
	}
	}
	
	if (Answer.equals("d")){
	System.out.print("how large do you want your triangle?");
	Input = Keyboard.nextLine();
	size = Integer.parseInt(Input);
	
	for (int i = 0; i <= size; i++) {
		for (int ii = 0; ii < i; ii++) {
			System.out.print("* ");
		
		}	
		
	for (int i = 0; i )
		
		
	System.out.println();

	
	}
	}
	
  }
}