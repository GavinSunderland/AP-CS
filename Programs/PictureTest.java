import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

public class PictureTest {
  static Picture pic;
  public static void main(String[] args){
    String filename = "fix_photo.jpg";

    pic = new Picture(filename);
    System.out.println(pic.width() + "wx" + pic.height() + "h");
	
	printPixleColors();
	fixDamage();
    pic.show();
  }

  public static void fixDamage() {
	for (int y = 175; y <= 190; y ++){
		for (int x = 98; x <= 107; x++){
		Color newcolor  = new Color(182, 167, 144);
		
		Color color = pic.get(x,y);
		int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
		Color pixelColor = new Color(red, green, blue);
		
		
		
		if (blue < 155){	
		pic.set(x, y, newcolor);
		}
		
		else if (green < 155){
			pic.set(x, y, newcolor);
		}
		
		else{
			pic.set(x, y, pixelColor);
		}
		
		
		}
	}
  }

  public static void printPixleColors() {
    int x = 0;
    int y = 0;
    Color pixelColor = pic.get(x,y);
    int red = pixelColor.getRed();
    int green = pixelColor.getGreen();
    int blue = pixelColor.getBlue();
    System.out.println("red:" + red + ", green:" + green + ", blue:" + blue);
  }

  public static void drawDarkerLine() {
    int y = 10;
    int width = 200;
    for (int x = 0; x < width; x++) {
        int red = 10;
        int blue = 10;
        int green = 10;
        Color pixelColor = new Color(red, green, blue);
        pic.set(x, y, pixelColor);
    }
  }
}
