import java.awt.Color;
import java.util.Scanner;
import java.util.Arrays;

public class PictureEditor1 {

	static Picture pic;

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		String Answer = Keyboard.nextLine();

		args = new String[1];

        args[0] = "liz.jpg";
        
       args[0] = "pig.jpg";

		pic = new Picture(args[0]);
		System.out.println(pic.width() + "w x " + pic.height() + "h");

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
		if (Answer.equals("f"))	{
		mirror();
		pic.show();
		}	
		if (Answer.equals("g"))	{
		drawTriangle();
		pic.show();
		}	
        if (Answer.equals("h"))	{
		GrayScale();
		pic.show();
		}	   
		if (Answer.equals("i"))	{
		LetterBox();
		pic.show();
		}	   
		if (Answer.equals("j"))	{
		drawDarkerLine();
		TintColor();
		pic.show();
		Nuke();
		SortByColor();
		drawSquare();
		mirror();
		drawTriangle();
		GrayScale();
		LetterBox();
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
		int width = pic.width() - 50;
		int height = pic.height() - 50;
		int red = 190;
		int blue = 151;
		int green = 100;


		Color color = new Color(red, green, blue);

		pic.set(x, y, color);

		for (y = 100; y <= 200; y++) {

			for (x = 100; x <= 200; x++) {

				int red1 = 190;
				int blue1 = 151;
				int green1 = 100;

				
	
	
				pic.set(x,y, color);
	
	}
	}
	}
	
	
    
    
    
   
    




	public static void drawCenteredSquare() {

	}

	

	 public static void LetterBox() {
        for (int y = 0; y < 50; y ++){
			for (int x = 0; x < 639; x ++){
			Color color = pic.get(x,y);
			int red = color.getRed();
			int green = color.getGreen();
			int blue = color.getBlue();
			
			red = 0;
			green = 0;
			blue = 0;
			
			pic.set(x,y,color);
			}
		}
		
		for (int y = 852; y > 802; y --){
			for (int x = 0; x < 639; x ++){
			Color color = pic.get(x,y);
			int red = color.getRed();
			int green = color.getGreen();
			int blue = color.getBlue();
			
			red = 0;
			green = 0;
			blue = 0;
			
			pic.set(x,y,color);
			}
		}
   }
	
	
	public static void TintColor() {
		for (int y = 0; y <= 853; y++) {

			for (int x = 0; x <= 640; x++) {

				Color Color = pic.get(x, y);
				int red = Color.getRed();
				int green = Color.getGreen();
				int blue = Color.getBlue();

				int average = (red + green + blue) / 3;

				if (average < 50) {

					red *= 5;

					if (red > 255)
						red = 255;

					Color = new Color(red, green, blue);

					pic.set(x, y, Color);

				}

			}

		}
	}

	  public static void drawTriangle() {
    
	   for (int y = 50; y < 100; y ++){
			for (int x = 50; x < y; x ++){
					Color color = pic.get(x,y);
					
					int red1 = 190;
					int blue1 = 151;
					int green1 = 100;
					color = new Color(red1, blue1, green1);
				
				pic.set(x,y,color);
				}
    			
			}
	   }
	
	
	public static void GrayScale(){
	for (int y = 0; y <=852; y++){
		for (int x = 0; x <= 639; x ++){
			Color color = pic.get(x,y);
			int red = color.getRed();
			int green = color.getGreen();
			int blue = color.getBlue();
			
			int average = (red + green + blue)/3;
			
			Color gray = new Color(average,average,average);
			
			pic.set(x,y,gray);
		}
	}
}
	
	
	public static void Nuke() {
		for (int y = 0; y <= 800; y++) {

			for (int x = 0; x <= 600; x++) {

				Color Color = pic.get(x, y);
				int red = Color.getRed();
				int green = Color.getGreen();
				int blue = Color.getBlue();

				int average = (red + green + blue) / 3;

				if (average < 50) {

					green *= 100;
					blue *= 100;
					red *= 100;

					if (green > 255)
						green = 255;
					if (blue > 255)
						blue = 255;
					if (red > 255)
						red = 255;

					Color = new Color(red, green, blue);

					pic.set(x, y, Color);

				}
			}
		}
	}

	public static void SortByBrightness() {
		int width = pic.width();
		int height = pic.height();
		int[][] imageRow = new int[width][4];
		int[] averages = new int[width];
		
		for (int y = 0; y < height; y++) {

			for (int x = 0; x < width; x++) {
				int red = pic.get(x,y).getRed();
				int green = pic.get(x,y).getGreen();
				int blue = pic.get(x,y).getBlue();
				
				int average = (red + green + blue) / 3;
				imageRow[x][0] = red;
				imageRow[x][1] = green;
				imageRow[x][2] = blue;
				imageRow[x][3] = average;
				averages[x] = average;
			}
			Arrays.sort(averages);
			for (int x = 0; x < width; x++) {
				int greyScaled = averages[x];
				int[] colors = new int[3];
				for (int[] pixel : imageRow) {
					if (pixel[3] == greyScaled) {
						colors[0] = pixel[0];
						colors[1] = pixel[1];
						colors[2] = pixel[2];
						break;
					}
				}
				pic.set(x,y, new Color(colors[0], colors[1], colors[2]));
			}
		}

	}
	public static void SortByRed() {
		int width = pic.width();
		int height = pic.height();
		int[][] imageRow = new int[width][4];
		int[] averages = new int[width];
		
		for (int y = 0; y < height; y++) {

			for (int x = 0; x < width; x++) {
				int red = pic.get(x,y).getRed();
				int green = pic.get(x,y).getGreen();
				int blue = pic.get(x,y).getBlue();
				
				int average = (red + green + blue) / 3;
				imageRow[x][0] = red;
				imageRow[x][1] = green;
				imageRow[x][2] = blue;
				imageRow[x][3] = average;
				averages[x] = red;
			}
			Arrays.sort(averages);
			for (int x = 0; x < width; x++) {
				int greyScaled = averages[x];
				int[] colors = new int[3];
				for (int[] pixel : imageRow) {
					if (pixel[0] == greyScaled) {
						colors[0] = pixel[0];
						colors[1] = pixel[1];
						colors[2] = pixel[2];
						break;
					}
				}
				pic.set(x,y, new Color(colors[0], colors[1], colors[2]));
			}
		}

	}
	public static void SortByGreen() {
		int width = pic.width();
		int height = pic.height();
		int[][] imageRow = new int[width][4];
		int[] averages = new int[width];
		
		for (int y = 0; y < height; y++) {

			for (int x = 0; x < width; x++) {
				int red = pic.get(x,y).getRed();
				int green = pic.get(x,y).getGreen();
				int blue = pic.get(x,y).getBlue();
				
				int average = (red + green + blue) / 3;
				imageRow[x][0] = red;
				imageRow[x][1] = green;
				imageRow[x][2] = blue;
				imageRow[x][3] = average;
				averages[x] = green;
			}
			Arrays.sort(averages);
			for (int x = 0; x < width; x++) {
				int greyScaled = averages[x];
				int[] colors = new int[3];
				for (int[] pixel : imageRow) {
					if (pixel[1] == greyScaled) {
						colors[0] = pixel[0];
						colors[1] = pixel[1];
						colors[2] = pixel[2];
						break;
					}
				}
				pic.set(x,y, new Color(colors[0], colors[1], colors[2]));
			}
		}
	}





public static void mirror() {
	for (int x = 0; x < 639; x ++) {
	for (int y = 0; y < 427; y ++ ){
				
				Color color = pic.get(x,y);
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
			
				int pos = 852 - y;
					
				pic.set(x, pos, color);
			
			
			
			
			
			
			
			
		}
	}
}












	public static void SortByBlue() {
		int width = pic.width();
		int height = pic.height();
		int[][] imageRow = new int[width][4];
		int[] averages = new int[width];
		
		for (int y = 0; y < height; y++) {

			for (int x = 0; x < width; x++) {
				int red = pic.get(x,y).getRed();
				int green = pic.get(x,y).getGreen();
				int blue = pic.get(x,y).getBlue();
				
				int average = (red + green + blue) / 3;
				imageRow[x][0] = red;
				imageRow[x][1] = green;
				imageRow[x][2] = blue;
				imageRow[x][3] = average;
				averages[x] = blue;
			}
			Arrays.sort(averages);
			for (int x = 0; x < width; x++) {
				int greyScaled = averages[x];
				int[] colors = new int[3];
				for (int[] pixel : imageRow) {
					if (pixel[2] == greyScaled) {
						colors[0] = pixel[0];
						colors[1] = pixel[1];
						colors[2] = pixel[2];
						break;
					}
				}
				pic.set(x,y, new Color(colors[0], colors[1], colors[2]));
			}
		}

	}
}
