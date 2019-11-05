import java.awt.Color;
import java.util.Scanner;


public class PictureEditor {
    
    static Picture pic;
    
    public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		String Answer = Keyboard.nextLine();
        
		args = new String[1];
        args[0] = "liz.jpg";
        
        pic = new Picture(args[0]);
        System.out.println(pic.width() + "w x " + pic.height()+"h");
        
		
        printPixelColors();
		
		if (Answer.equals("a"))	{
        drawDarkerLine();
		pic.show();
		}	   
		if (Answer.equals("b"))	{
        TintColor();
		pic.show();
		}	   
		if (Answer.equals("c"))	{
        Nuke();
		pic.show();
		}	  
		if (Answer.equals("d"))	{
        SortByColor();
		pic.show();
		}	  
		if (Answer.equals("e"))	{
        drawSquare();
		pic.show();
		}	
		
		
            
    }
    
    
    public static void printPixelColors() {
        int x = 100;
        int y = 100;
        Color pixelColor = pic.get(x, y);
        int red = pixelColor.getRed();
        int green = pixelColor.getGreen();
        int blue = pixelColor.getBlue();
        System.out.println("red:"+red+",green:"+green+",blue:"+blue);
    }

    public static void drawDarkerLine() {
        int y = 10;
        int width = 100;
        for (int x = 0; x < width; x++) {
            int red = 10;
            int blue = 10;
            int green = 10;
            Color pixelColor = new Color(red, green, blue);
            pic.set(x, y, pixelColor);
        }
    }


    public static void drawSquare() {
	int y = 100;
	int x = 100;
	int width = pic.width()-50;
	int height = pic.height()-50;
	int red = 190;
	int blue = 151;
	int green = 100;
	
		Color color = new Color(red, green, blue);
		
	
		pic.set(x,y, color);
		
	
	
			for (y = 100; y <= 200; y ++){
				
				for (x = 100; x <= 200; x ++) {
				
				int red1 = 190;
				int blue1 = 151;
				int green1 = 100;
				
	
	
				pic.set(x,y, color);
	
	}
	}
	}
	
	
    
    
    public static void drawCenteredSquare() {
        
    }
    
    public static void drawTriangleTop() {
        
    }
    


public static void TintColor(){
for ( int y = 0; y <= 853; y ++) {
	
	for( int x = 0; x <= 640; x ++) {
	
		Color Color = pic.get(x,y);
		int red = Color.getRed();
		int green = Color.getGreen();
		int blue = Color.getBlue();
	
	
		int average = (red + green + blue)/3;
	
	if (average < 50){
		
		red *= 5;
		
		if (red > 255) red = 255;
		
		
		Color = new Color(red,green,blue);
	
		pic.set(x,y,Color);
	
	}
	
	
}
	
}
}

public static void Nuke(){
for ( int y = 0; y <= 800; y ++) {
	
	for( int x = 0; x <= 600; x ++) {
	
		Color Color = pic.get(x,y);
		int red = Color.getRed();
		int green = Color.getGreen();
		int blue = Color.getBlue();
	
	
		int average = (red + green + blue)/3;

	if (average < 50){
		
		green *= 100;
		blue *= 100;
		red *= 100;
		
		if (green > 255) green = 255;
		if (blue > 255) blue = 255;
		if (red >255) red = 255;
		
		Color = new Color(red,green,blue);
	
		pic.set(x,y,Color);
	
	}
	}
}
}
public static void SortByColor() {




for ( int y = 0; y <= 800; y ++) {
	
	for( int x = 0; x <= 600; x ++) {
		
		int shiftX = 0;
		int shiftY = 0;
		
		
		
		
		
		Color color = pic.get(x,y);
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		
		if (red == 0){
		shiftX = 1;
		red = 1;
		}
		
		
		else{
		shiftX = x/red;
		}
		
		if (green == 0){
		shiftY = 1;
		green = 1;
		}
		
		else{
		shiftY = y/green;
		}
		
		
		
		
		
		
		x += shiftX;
		y += shiftY;
	
		int height = 851; 
		for (int i = y; y > height; y --){
		
		}
		
		int width = 638;
		for (int i = x; x > width; x --){
		
		}
		
		
		
		pic.set(x,y,color);
		
		
		
		
		
	
		
	
		
	
	
	
	}
}




}
}

