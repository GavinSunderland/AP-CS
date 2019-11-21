import java.awt.*;
import javax.swing.*;

public class Drawing extends JComponent {
	static int a = 500;
	static int b = 500;
	
	
	public static void main (String[] args) {
		
		JFrame window = new JFrame("A rectangle");
		Drawing Shapes = new Drawing();
		
		window.setSize(a, b);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	
		window.add(Shapes);
		
		
	}

	public void paint(Graphics g) {
		
		int x = 0;
		
		int y = 0;
		
		for (x = 0; x <= 500; x += 50){
		
			g.drawLine(x, 0, 0+x, 500);
		}
		
		
		for (y = 0; y <= 500; y += 50){
		
			g.drawLine(0, y, 500, 0+y);
		}
		
		int previousX1 = 0;
		int x1 = 0;
		int y1 =0;
		for (x1= 0; x1<=500; x1 += 10){
			g.setColor(new Color(0,0,255));
			g.fillOval(x1-3,x1-3,6,6);
			g.drawLine(previousX1, previousX1, x1,x1);
			previousX1 = x1;
		}
		
		int x2 = 0;
		int y2 = 0;
		int previousX2 = x2;
		int previousY2 = y2;
		for (x2 = 0; x2<=500; x2 += 10){
			y2 = (5*x2+50);
			g.setColor(new Color(0,0,255));
			g.fillOval(x2-3,(5*x2+50)-3,6,6);
			g.drawLine(previousX2, previousY2, x2,y2);
			previousX2 = x2;
			previousY2 = y2;
	
		}
		
		int x3 = 0;
		int y3 = 0;
		int previousX3 = x3;
		int previousY3 = y3;
		for (x3 = 0; x3<=500; x3 += 10){
			y3 = (int)(Math.pow(x3-100,2));
			g.setColor(new Color(0,0,255));
			g.fillOval(x3-3,(int)(Math.pow(x3-100,2))-3,6,6);
			g.drawLine(previousX3, previousY3, x3,y3);
			previousX3 = x3;
			previousY3 = y3;
		}
		
		
		
	}
	
		
		
		
		
	
	}
	




		
		