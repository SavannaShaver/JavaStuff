/*
 * Written by Savanna Shaver
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class trianglesCarpet extends Canvas {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Applet");
		frame.setSize(500,500);
		trianglesCarpet sp = new trianglesCarpet(); // i am creating a new instance of the CANVAS drawing thing
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}
	public void paint(Graphics g)// this is a function of canvas
	{
			
		    
		 drawCarpet(0,0,this.getSize().height,g);
		    
	}
	public void drawCarpet(int x, int y, int side, Graphics g)
	{
		int sub = side/2;
		int npoints = 3;
		//if(this.getSize().height < 720)
		//{
			//int xpoints[] = {this.getSize().height/2,this.getSize().height,0};
			//int ypoints[] = {0,this.getSize().height,this.getSize().height};
			//g.fillPolygon(xpoints, ypoints, npoints); 
		//}
		//else
		//{
			int xpoints[] = {200,0,400};
		    int ypoints[] = {0,400,400};
		    g.fillPolygon(xpoints, ypoints, npoints); 
		//}
		
		
		g.setColor(Color.white);
		int hopex[] = {200,100,300}; // 
		int worksy[] = {400,200,200};
		g.fillPolygon(hopex, worksy, npoints);
		
		g.setColor(Color.blue);
		int lefttrix[] = {100,150,50}; // 
		int lefttriy[] = {400,300,300};
		g.fillPolygon(lefttrix, lefttriy, npoints);
		
		
		g.setColor(Color.blue);
		int rightX[] = {300,250,350}; // 
		int rightY[] = {400,300,300};
		g.fillPolygon(rightX, rightY, npoints);
		
		
		g.setColor(Color.blue);
		int topX[] = {200,150,250}; // 
		int topY[] = {200,100,100};
		g.fillPolygon(topX, topY, npoints);
		
		g.setColor(Color.red);
		int smalltopX[] = {150,125,175}; // 
		int smalltopY[] = {200,150,150};
		g.fillPolygon(smalltopX, smalltopY, npoints);
		
		g.setColor(Color.red);
		int rightTOPX[] = {250,225,275}; // 
		int rightTOPY[] = {200,150,150};
		g.fillPolygon(rightTOPX, rightTOPY, npoints);
		
		
		
		
	
	}

}
