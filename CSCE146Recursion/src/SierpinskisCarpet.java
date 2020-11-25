import java.awt.*;
import javax.swing.*;
import java.util.*;
public class SierpinskisCarpet extends Canvas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Sierpinki's Carpet");
		frame.setSize(900,900);
		SierpinskisCarpet sp = new SierpinskisCarpet(); // i am creating a new instance of the CANVAS drawing thing
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public void paint(Graphics g)// this is a function of canvas
	{
		drawCarpet(0,0, this.getSize().height,g);
	}
	public void drawCarpet(int x, int y, int side, Graphics g)
	{
		int sub = side/3;
		g.fillRect(x+sub, y+sub, sub, sub); // x + sub moves it 1/3 to the right
		if(sub >= 3)
		{
			//Top
			//drawCarpet(x,y,sub,g); //left
			//drawCarpet(x+sub,y,sub,g); //middle
			//drawCarpet(x+sub*2,y,sub,g);// right
			//Middle
			//drawCarpet(x,y+sub,sub,g); //left
			//drawCarpet(x+sub*2,y+sub,sub,g);// right
			//Bottom
			//drawCarpet(x,y+sub*2,sub,g); //left
			//drawCarpet(x+sub,y+sub*2,sub,g);// middle
			//drawCarpet(x+sub*2,y+sub*2,sub,g);// right
			
			
		}
	}

}
